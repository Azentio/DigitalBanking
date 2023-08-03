package dataProvider;

import java.util.HashMap;

public class DataReader {
	
	public static HashMap<String, String> configFileMap;
	public static HashMap<String, HashMap<String, String>> locatorsMap;
	public static HashMap<String, HashMap<String, String>> userCredentialsMap;
	public static HashMap<String, HashMap<String, HashMap<String, String>>> testDataMap;
	
	public DataReader() {
		DataFromGoogleSheet config = new DataFromGoogleSheet();
		DataReader.configFileMap = config.configFileMap;
		DataReader.locatorsMap = config.LocatorsMap;
		DataReader.userCredentialsMap = config.userCredentialsMap;
		DataReader.testDataMap = config.testDataMap;

		
		
	}

}
