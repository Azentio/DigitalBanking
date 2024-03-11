package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.Sheets.Spreadsheets.Values.Get;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;

import dataProvider.GoogleAPIMethods;

public class SheetTest {
	public static void main(String[] args) throws IOException {
		String executionSheetName = "TestExecutionSheet";
		String spreadSheetID = "1DtbuoWTCJkWXS2rK5RtqO2GvNPfymvskiY3Y6fvrlhA";
		// String TestCaseIDColumnName = "";

		String ApplicationName = "AzentioLearning";
		JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
		String CREDENTIALS_FILE_PATH = ".\\src\\test\\resources\\azentiolearning-71200dde582a.json";
		GoogleAPIMethods apiMethod = new GoogleAPIMethods();
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
		int i = 0;
		// int startingIndex=1;
		int endingIndex = 20;

		for (int startingIndex = 1; startingIndex <= endingIndex; startingIndex++) {
			try {
				ValueRange execute = service.spreadsheets().values()
						.get(spreadSheetID, executionSheetName + "!A" + startingIndex).execute();
				// System.out.println(execute.getValues().get(0));
				String tag = execute.getValues().get(0).toString();
				System.out.println("Test tag " + tag.replace("[", "").replace("]", ""));
				System.out.println("Starting index " + startingIndex);
			} catch (NullPointerException e) {
			}
		}

	}

}
