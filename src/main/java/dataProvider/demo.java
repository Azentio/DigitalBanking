package dataProvider;

import com.google.gson.Gson;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class demo {
    String transactionNumber;
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
        ResultSet rs = db.retriveRsFromQuery(db.CoreDB, query);
        List<Object> referenceNoFromOmniDataBase = db.retriveListFromResultSet(rs, 5, 5);

        System.out.println(referenceNoFromOmniDataBase.get(0).toString());
        
        Gson gson = new Gson();
        demo fooFromJson = gson.fromJson(referenceNoFromOmniDataBase.get(0).toString(), demo.class);

        System.out.println(fooFromJson.transactionNumber);
    }

}
