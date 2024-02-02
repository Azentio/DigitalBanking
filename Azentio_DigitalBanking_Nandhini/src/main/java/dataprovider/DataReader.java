package dataprovider;

import java.util.HashMap;

public class DataReader {
	
	public static HashMap<String, String> configFileMap;
	public static HashMap<String, HashMap<String, String>> locatorsMap;
	public static HashMap<String, HashMap<String, String>> userCredentialsMap;
	public static HashMap<String, HashMap<String, HashMap<String, String>>> testDataMap;
	public static HashMap<String, String> executionTestData;
	
	
	public static HashMap<String, String> OmniScreen_L;
	
	public DataReader(boolean excelRun) {
		DataFromGoogleSheet config = new DataFromGoogleSheet();
		DataReader.configFileMap = config.configFileMap;
		DataReader.locatorsMap = config.LocatorsMap;
		DataReader.userCredentialsMap = config.userCredentialsMap;
		DataReader.testDataMap = config.testDataMap;

		
		if (excelRun) {
			executionTestData = config.excelTestAndDataSet;
		}
		else {
			executionTestData = config.testAndDataSet;
		}
	}

}
