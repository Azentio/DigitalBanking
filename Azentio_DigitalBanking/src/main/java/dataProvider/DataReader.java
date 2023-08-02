package dataProvider;

import java.util.HashMap;

public class DataReader {
	
	HashMap<String, String> configFileMap;
	HashMap<String, HashMap<String, String>> locatorsMap;
	HashMap<String, HashMap<String, String>> userCredentialsMap;
	HashMap<String, HashMap<String, HashMap<String, String>>> testDataMap;
	
	public DataReader() {
		DataFromGoogleSheet config = new DataFromGoogleSheet();
		this.configFileMap = config.configFileMap;
		this.locatorsMap = config.LocatorsMap;
		this.userCredentialsMap = config.userCredentialsMap;
		this.testDataMap = config.testDataMap;

		
		
	}

}
