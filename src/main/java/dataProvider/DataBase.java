package dataProvider;

import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class DataBase {

//	Connection OmniDB;
//	Connection CoreDB;
//	
//	public DataBase() {
//		super();
//		
//		this.OmniDB = connection("Omni");
//		this.CoreDB = connection("Core");
//	}
//	
	public static enum DataBaseName {
		OmniDB, CoreDB
	}
	
    String transactionNumber;
    Object serviceResponse;


	/***
	 * 
	 * @param DBName - Type Omni for Omni database OR Core for Core database
	 * @return - Database connection for the given database
	 */

	public Connection connection(DataBaseName DBName) {

		// tell the driver where to look for the TNSNAMES.ORA file
		System.setProperty("oracle.net.tns_admin", ".//src//test//resources");

		// ORCL is net service name from the TNSNAMES.ORA file
		String dbURL = "jdbc:oracle:thin:@ora19s1";

		String UserName = null;
		String password = null;

		if (DBName.equals(DataBaseName.CoreDB)) {
			UserName = "CP_BPM_O19";
			password = "CP_BPM_O19";
		} else if (DBName.equals(DataBaseName.OmniDB)) {

			UserName = "OMNICHANNEL_QC_O19";
			password = "OMNICHANNEL_QC_O19";
		}

		Connection con = null;

		try {
			con = DriverManager.getConnection(dbURL, UserName, password);
			System.out.println(DBName + " is connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}

	public ResultSet retriveAllDataFromTable(Connection con, String tableName, String OrderBy) throws SQLException {

		ResultSet rs = null;
		String queryString = "select * from " + tableName + " order by " + OrderBy + " DESC";
		Statement statement = con.createStatement();
		rs = statement.executeQuery(queryString);

		return rs;
	}

	public ResultSet retriveRsFromQuery(Connection con, String Query) throws SQLException {

		ResultSet rs = null;
		Statement statement = con.createStatement();
		rs = statement.executeQuery(Query);

		return rs;
	}
	

	public List<Object> retriveListFromResultSet(ResultSet rs, int ColumnNo, int limit) throws SQLException {

		List<Object> list = new ArrayList<Object>();

		int countLimit = 0;

		while (rs.next()) {

			ResultSetMetaData metaData = rs.getMetaData();
			String columnType = metaData.getColumnTypeName(ColumnNo);

			if (columnType.equals("CLOB")) {

				list.add(CLOBtoString(rs, ColumnNo));
				countLimit++;
			} else {
				list.add(rs.getObject(ColumnNo));
				countLimit++;
			}
			if (countLimit == limit) {
				break;
			}
		}

		return list;
	}
	
	
	
	/***
	 * 
	 * @param con - Use this method - connection(DataBaseName DBName)
	 * @param Query - Sql Query as String
	 * @param ColumnNo - Column number from the database we want to retrieve
	 * @param limit - No of data needs to be retrieved from the database
	 * @return - List of the data as per the given column number and limit
	 * @throws SQLException
	 */
	
	public List<Object> retriveListFromQuery(Connection con, String Query, int ColumnNo, int limit) throws SQLException {
		
		ResultSet rs = null;
		Statement statement = con.createStatement();
		rs = statement.executeQuery(Query);

		List<Object> list = new ArrayList<Object>();

		int countLimit = 0;

		while (rs.next()) {

			ResultSetMetaData metaData = rs.getMetaData();
			String columnType = metaData.getColumnTypeName(ColumnNo);

			if (columnType.equals("CLOB")) {

				list.add(CLOBtoString(rs, ColumnNo));
				countLimit++;
			} else {
				list.add(rs.getObject(ColumnNo));
				countLimit++;
			}
			if (countLimit == limit) {
				break;
			}
		}

		return list;
	}

	public String CLOBtoString(ResultSet rs, int ColumnNo) throws SQLException {

		Clob clob = rs.getClob(ColumnNo);
		Reader r = clob.getCharacterStream();
		StringBuffer buffer = new StringBuffer();
		int ch;

		try {
			while ((ch = r.read()) != -1) {
				buffer.append("" + (char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String string = buffer.toString();

		return string;
	}
	
	
	public List<DataBase> returnJsonList(Connection con, String Query, int columnNo, int limit) throws SQLException {
		Gson gson = new Gson();

	    
		List<Object> retriveListFromResultSet = retriveListFromResultSet(retriveRsFromQuery(con, Query), columnNo, limit);
		
		List<DataBase> jsonList = new ArrayList<DataBase>();
		
		for (Object object : retriveListFromResultSet) {
			DataBase fromJson = gson.fromJson(object.toString(), DataBase.class);
			jsonList.add(fromJson);
		}
		return jsonList;
	}
}
