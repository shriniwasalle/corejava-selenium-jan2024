package org.alpha.shriniwas.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapWithCities {

    public String getCityName(String airportCode) {
        Map<String, String> citiesMap = new HashMap<>();
        citiesMap.put("PNQ", "Pune");
        citiesMap.put("BOM", "Mumbai");
        citiesMap.put("DEL", "Delhi");
        citiesMap.put("BKK", "Bangkok");
        return citiesMap.get(airportCode);
    }

    public List<String> getCredentials(String accessType) {
        Map<String, List<String>> citiesMap = new HashMap<>();
        citiesMap.put("Admin", Arrays.asList("ShriAdmin", "ShriAdminPass"));
        citiesMap.put("Viewer", Arrays.asList("ShriViewer", "ShriViewerPass"));
        citiesMap.put("Operator", Arrays.asList("ShriOperator", "ShriOperatorPass"));
        return citiesMap.get(accessType);
    }

    public static void main(String[] args) {
        TestMapWithCities obj = new TestMapWithCities();
        System.out.println("City Name: " +obj.getCityName("DEL"));

        List<String> creds =  obj.getCredentials("Viewer");
        String userName = creds.get(0); // username
        String password = creds.get(1); // password

        System.out.println("UserName: " +creds.get(0) + "  " + "Password: " + creds.get(1));

        System.out.println(userName);
        System.out.println(password);
    }
}
