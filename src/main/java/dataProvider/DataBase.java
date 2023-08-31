package dataProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	
	Connection OmniDB;
	Connection CoreDB;
	
	public DataBase() {
		super();
		
		this.OmniDB = connection("Omni");
		this.CoreDB = connection("Core");
	}

	/***
	 * 
	 * @param DBName - Type Omni for Omni database OR Core for Core database
	 * @return - Database connection for the given database
	 */
	
	public Connection connection(String DBName) {
		
		 // tell the driver where to look for the TNSNAMES.ORA file
		System.setProperty(
		          "oracle.net.tns_admin",
		          "C:\\app\\client\\USER\\product\\19.0.0\\client_1\\Network\\Admin");

		// ORCL is net service name from the TNSNAMES.ORA file
		String dbURL = "jdbc:oracle:thin:@ora19s1";
		
		String UserName = null;
		String password = null;
		
		if (DBName.equalsIgnoreCase("Core")) {
			UserName = "CP_BPM_O19";
			password = "CP_BPM_O19";
		}
		else if (DBName.equalsIgnoreCase("Omni")) {
			
			UserName = "OMNICHANNEL_QC_O19";
			password = "OMNICHANNEL_QC_O19";
		}
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(dbURL, UserName, password);
			System.out.println(DBName+"DB is connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
