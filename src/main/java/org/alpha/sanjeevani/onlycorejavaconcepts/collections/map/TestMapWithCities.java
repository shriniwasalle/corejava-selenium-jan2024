package org.alpha.sanjeevani.onlycorejavaconcepts.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapWithCities {
    public String getCitiesName(String airportCode) {
        Map<String, String> citisMap = new HashMap<>();
        citisMap.put("PNQ", "Pune");
        citisMap.put("BOM", "Mumbai");
        citisMap.put("DEL", "Delhi");
        citisMap.put("BKK", "Bangkok");

        String cityName = citisMap.get(airportCode);
        return cityName;
    }

    public static void main(String[] args) {
        TestMapWithCities obj = new TestMapWithCities();
        System.out.println("CityName is :" + obj.getCitiesName("PNQ"));
    }
}
