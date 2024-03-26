package org.alpha.tejashri.corejava.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapWithCities {
    public String getCityName(String airportCode) { // non static
        Map<String, String> citiesMap = new HashMap<>();
        citiesMap.put("PNQ", "Pune");
        citiesMap.put("BOM", "Mumbai");
        citiesMap.put("DEL", "New Delhi");
        citiesMap.put("BLR", "Bengaluru");
        citiesMap.put("HYD", "Hyderabad");
        citiesMap.put("CCU", "Kolkata");
        citiesMap.put("MAA", "Chennai");

        return citiesMap.get(airportCode);
    }

    public List<String> getCredentials(String accessType) {
        Map<String, List<String>> credentials = new HashMap<>();
        credentials.put("Admin", Arrays.asList("AdminID", "AdminPass"));
        credentials.put("Viewer", Arrays.asList("ViewerID", "ViewerPass"));
        credentials.put("Operator", Arrays.asList("OperatorID", "OperatorPass"));

        return credentials.get(accessType);
    }

    public static void main(String[] args) {
        TestMapWithCities obj = new TestMapWithCities();
        System.out.println("City Name : " + obj.getCityName("PNQ"));

        System.out.println("Credentials : " + obj.getCredentials("Operator"));

        List<String> creds = obj.getCredentials("Viewer");
        System.out.println(creds.get(0)); //0=userID
        System.out.println(creds.get(1)); //1= userPassword

        //Different ways to print
        String userID = creds.get(0);//0=userID->stored in another variable
        String userPassword = creds.get(1);//1= userPassword

        System.out.println(creds.get(0) + creds.get(1));

        System.out.println(userID);
        System.out.println(userPassword);

        System.out.println("User ID : " + userID + ", User Password : " + userPassword);
    }
}
