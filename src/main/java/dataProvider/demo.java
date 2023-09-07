package dataProvider;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {
    String transactionNumber;
    Object serviceResponse;
    String statusDesc;
    public static void main(String[] args) throws SQLException {

        String str = "{\n" +
                "   \"requesterContext\":    {\n" +
                "      \"userID\": \"MODEL.B\",\n" +
                "      \"password\": \"XXXXXXX\",\n" +
                "      \"langId\": \"EN\"\n" +
                "   },\n" +
                "   \"vendorContext\": {},\n" +
                "   \"requestContext\":    {\n" +
                "      \"requestID\": \"15b4bd95-af98-4b07-9d9c-5ffd29932d7d\",\n" +
                "      \"coreRequestTimeStamp\": 1693326423096\n" +
                "   },\n" +
                "   \"serviceResponse\":    {\n" +
                "      \"statusCode\": \"0\",\n" +
                "      \"statusDesc\": \"Success\"\n" +
                "   },\n" +
                "   \"responseContext\": {},\n" +
                "   \"responseServiceContext\":    {\n" +
                "      \"businessArea\": \"Retail\",\n" +
                "      \"businessDomain\": \"PaymentsOperationsManagement\",\n" +
                "      \"serviceDomain\": \"Transfer\",\n" +
                "      \"version\": \"[APP_VERSION:1405000000000439]\",\n" +
                "      \"operationName\": \"createSwiftTransfer\",\n" +
                "      \"serviceID\": \"4802\"\n" +
                "   },\n" +
                "   \"companyCode\": \"1\",\n" +
                "   \"branchCode\": \"1\",\n" +
                "   \"transactionType\": \"574\",\n" +
                "   \"fromAccount\":    {\n" +
                "      \"branch\": \"1\",\n" +
                "      \"currency\": \"929\",\n" +
                "      \"accGl\": \"210265\",\n" +
                "      \"cif\": \"10114932\",\n" +
                "      \"serialNo\": \"0\",\n" +
                "      \"additionalRef\": \"0001000192921026510114932000\"\n" +
                "   },\n" +
                "   \"toAccounts\": [],\n" +
                "   \"transactionAmount\": \"100\",\n" +
                "   \"currencyIso\": \"929\",\n" +
                "   \"instructions1\": \"sdsdsdsd\",\n" +
                "   \"useDate\": \"2\",\n" +
                "   \"beneficaryAccount\": \"1212\",\n" +
                "   \"beneficaryBank\": \"1000070\",\n" +
                "   \"beneficaryName\": \"hasan benef\",\n" +
                "   \"beneficaryAddress2\": \"111\",\n" +
                "   \"swiftDate\": 1693326418420,\n" +
                "   \"additionalFieldsList\": [],\n" +
                "   \"availableBalance\": \"5574988.2\",\n" +
                "   \"transactionNumber\": \"647934\",\n" +
                "   \"feesTransactionNumber\": \"0\"\n" +
                "}";

         String query = "select *\n" +
                "  from (select *\n" +
                "          from common_pws_response_log rp\n" +
                "         --where operation_name ='createTransfer' -- Internal transfer / transfer to internal beneficiary\n" +
                "         where operation_name='createSwiftTransfer' -- Local and Internation transfer\n" +
                "         --where operation_name='createStandingOrder' -- Scheduled transfer\n" +
                "         --where operation_name = 'returnGeneralAccountDetails' -- Details of a specific account\n" +
                "         --where operation_name = 'returnGeneralAccountsList' -- List of accounts\n" +
                "         --where operation_name = 'returnCifDetails' -- details of a specific CIF\n" +
                "         --where operation_name = 'returnCifList' -- List of CIFs\n" +
                "         order by rp.core_request_timestamp desc nulls last)\n" +
                "         where SERVICE_DOMAIN= 'Transfer' AND STATUS_DESC = 'Success'";

        DataBase db = new DataBase();
        
//        List<Object> returnList = db.returnList(db.connection(DataBaseName.CoreDB), query, 5, 5);
//        
//    	Gson gson = new Gson();
//    	
//        for (Object object : returnList) {
//        	
//        	demo fromJson = gson.fromJson(object.toString(), demo.class);
//        	System.out.println(fromJson.serviceResponse);
//			
//		}
        
//        List<DataBase> returnList = db.returnJsonList(db.connection(DataBaseName.CoreDB), query, 5, 5);
//        System.out.println(returnList);
//        for (DataBase dataBase : returnList) {
//        	System.out.println(dataBase.transactionNumber);
//		}
        
//        List<Object> retriveListFromQuery = db.retriveListFromQuery(db.connection(DataBaseName.CoreDB), query, 1, 5);
//        for (Object object : retriveListFromQuery) {
//			System.out.println(object);
//		}
        
//        DataReader dr = new DataReader(false);
//        
//        String referenceNoFromOmni = "10104";
//        String referenceNoFromOmniDataBaseNew = "";
//
//
//        List<Object> retriveListFromQuery = db.retriveListFromQuery(db.connection(DataBaseName.OmniDB), DataReader.configFileMap.get("oc_data_saveQuery"), 1, 5);
//
//        for (Object ob : retriveListFromQuery) {
//            System.out.println("Reference number from Omni Database: " + ob.toString());
//            if (ob.toString().equals(referenceNoFromOmni)) {
//                referenceNoFromOmniDataBaseNew = ob.toString();
//                break;
//            }
//        }
//
//        if (!referenceNoFromOmniDataBaseNew.equals(referenceNoFromOmni)) {
//            Assert.fail("No match found with respect to DB oc_data_save");
//        }
        
//        
//        String num = "647952";
//        String sb = "\"transactionNumber\": "+num;
//        System.out.println(sb);
//        
//        
//        List<Object> retriveListFromQuery = db.retriveListFromQuery(db.connection(DataBaseName.CoreDB), query, 5, 5);
//        
//        for (Object object : retriveListFromQuery) {
//        	System.out.println(object);
//        	if (object.toString().contains(sb)) {
//        		System.out.println(object);
//			}
//			
//		}
//        
//        System.out.println("Execution completed!");
        
        
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setBinary("C:\\Users\\ININDC00614\\eclipse-workspace_Azentio\\chrome-win64\\chrome-win64\\chrome.exe");
		options.addArguments("--user-data-dir=C:\\Users\\ININDC00614\\AppData\\Local\\Google\\Chrome for Testing\\User Data");
		options.addArguments("--profile-directory=Profile 1");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.bigbasket.com/");
		
		
    }

}
