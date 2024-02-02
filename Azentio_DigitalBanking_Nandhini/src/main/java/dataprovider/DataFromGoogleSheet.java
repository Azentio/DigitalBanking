package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;

public class DataFromGoogleSheet {

	HashMap<String, String> configFileMap;
	HashMap<String, String> testData;
	HashMap<String, String> testAndDataSet;
	HashMap<String, String> excelTestAndDataSet;
	HashMap<String, String> userCredentailsData;
	HashMap<String, HashMap<String, String>> LocatorsMap;
	HashMap<String, HashMap<String, String>> userCredentialsMap;
	HashMap<String, HashMap<String, String>> testDataMap0;
	HashMap<String,HashMap<String, HashMap<String, String>>> testDataMap;
	
	String spreadsheetId = "1S0tFhJmDaXqhu3j1y0_SnOgOd_7rMaIKbW9gmv_MJ3E";
	String spreadsheetIdForTestData = "1DtbuoWTCJkWXS2rK5RtqO2GvNPfymvskiY3Y6fvrlhA";
	String ConfigFileRange = "ConfigFile!A2:B50";
	String locatorsRange = "ConfigFile!F2:G50";
	String testDataRange = "TestDataRangeFile!A2:B50";
	String userCredentialsRange = "ConfigFile!K2:L5";
	
	String ApplicationName = "AzentioLearning";
	JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
	String CREDENTIALS_FILE_PATH = ".\\src\\test\\resources\\azentiolearning-71200dde582a.json";

	GoogleAPIMethods googleAPIMethods = new GoogleAPIMethods();

	public DataFromGoogleSheet() {


		GoogleCredentials googleCredentials = null;
		try {
			googleCredentials = GoogleCredentials.fromStream(new FileInputStream(CREDENTIALS_FILE_PATH));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		HttpRequestInitializer requestInitializer = new HttpCredentialsAdapter(googleCredentials);

		NetHttpTransport HTTP_TRANSPORT = null;
		try {
			HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
		} catch (GeneralSecurityException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, requestInitializer)
				.setApplicationName(ApplicationName).build();
		
//		Load the data for ConfigFile

		this.configFileMap = googleAPIMethods.returnMap(service, spreadsheetId, ConfigFileRange);

//		Load the data for locators
		
		HashMap<String, String> internalLocatorsMap;

		internalLocatorsMap = googleAPIMethods.returnMap(service, spreadsheetId, locatorsRange);
		
//		System.out.println(internalLocatorsMap);

		HashMap<String, HashMap<String, String>> LocatorsMap = new HashMap<String, HashMap<String, String>>();

		for (Entry<String, String> iterable_element : internalLocatorsMap.entrySet()) {

			HashMap<String, String> internalLocatorsMap2 = googleAPIMethods.returnMap(service, spreadsheetId,
					iterable_element.getValue());

			try {
				LocatorsMap.put(iterable_element.getKey(), internalLocatorsMap2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		this.LocatorsMap = LocatorsMap;
		
//		Load the map for test data

		this.testData = googleAPIMethods.returnMap(service, spreadsheetIdForTestData, testDataRange);
		System.out.println(testData);
		HashMap<String, String> testAndDataSet = new HashMap<String, String>();
		HashMap<String, HashMap<String, String>> insideTestDataMap = new HashMap<String, HashMap<String, String>>();
		HashMap<String,HashMap<String, HashMap<String, String>>> testDataMap2 = new HashMap<String,HashMap<String, HashMap<String, String>>>();
		List<List<Object>> testDataList = null;
		for (Entry<String, String> iterable_element : testData.entrySet()) {

			testDataList = googleAPIMethods.returnList(service, spreadsheetIdForTestData, iterable_element.getValue());

			System.out.println(testDataList);

			

			for (int i = 1; i < testDataList.size(); i++) {

				String titleHeader = (String) testDataList.get(i).get(1);
				HashMap<String, String> internalTestDataMap = new HashMap<String, String>();
				for (int j = 1; j < testDataList.get(i).size(); j++) {

					String headerValue = (String) testDataList.get(0).get(j);

					String dataValue = (String) testDataList.get(i).get(j);

					internalTestDataMap.put(headerValue, dataValue);
					
					testAndDataSet.put((String) testDataList.get(i).get(0), (String) testDataList.get(i).get(1));

				}

				insideTestDataMap.put(titleHeader, internalTestDataMap);
			}
			
			testDataMap2.put(iterable_element.getKey(), insideTestDataMap);

		}
		this.testAndDataSet = testAndDataSet;
		
		System.out.println("testAndDataSet:" + testAndDataSet);
		
		this.testDataMap = testDataMap2;

//		Load the map for test data

		this.userCredentailsData = googleAPIMethods.returnMap(service, spreadsheetId, userCredentialsRange);

		HashMap<String, HashMap<String, String>> insideuserCredentialsMap = new HashMap<String, HashMap<String, String>>();
		List<List<Object>> userCredentialsList = null;
		for (Entry<String, String> iterable_element : userCredentailsData.entrySet()) {

			userCredentialsList = googleAPIMethods.returnList(service, spreadsheetId, iterable_element.getValue());

//			System.out.println(userCredentialsList);

			

			for (int i = 1; i < userCredentialsList.size(); i++) {

				String titleHeader = (String) userCredentialsList.get(i).get(0);
				HashMap<String, String> internaluserCredentialsMap = new HashMap<String, String>();
				for (int j = 1; j < userCredentialsList.get(i).size(); j++) {

					String headerValue = (String) userCredentialsList.get(0).get(j);

					String dataValue = (String) userCredentialsList.get(i).get(j);

					internaluserCredentialsMap.put(headerValue, dataValue);

				}

				insideuserCredentialsMap.put(titleHeader, internaluserCredentialsMap);

			}

		}
		this.userCredentialsMap = insideuserCredentialsMap;
	}

}
