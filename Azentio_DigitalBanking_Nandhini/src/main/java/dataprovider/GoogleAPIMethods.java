package dataprovider;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

public class GoogleAPIMethods {
	
	public HashMap<String, String> returnMap(Sheets service, String spreadsheetId, String range) {
		
		ValueRange response = null;
		try {
			response = service.spreadsheets().values().get(spreadsheetId, range).execute();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		HashMap<String, String> map = null;
		try {
			List<List<Object>> values = response.getValues();

			map = new HashMap<String, String>();

			for (List<Object> list : values) {
				try {
					map.put(String.valueOf(list.get(0)), String.valueOf(list.get(1)));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return map;
	}
	
	public List<List<Object>> returnList(Sheets service, String spreadsheetId, String range) {
			
			ValueRange response = null;
			try {
				response = service.spreadsheets().values().get(spreadsheetId, range).execute();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			List<List<Object>> values = null;
			try {
				 values = response.getValues();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return values;
			
	}
}
