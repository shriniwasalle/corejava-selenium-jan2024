package org.alpha.sanjeevani.onlycorejavaconcepts.collections.map;

import java.util.*;

public class TestMapWithGetCredential {

    public List<String> getCredential(String accessType) {
        Map<String, List<String>> credsMap = new HashMap<>();
        credsMap.put("Admin", Arrays.asList("AdminSanjeevani", "sanjeevAdminPass"));
        credsMap.put("Viewer", Arrays.asList("ViewerSanjeevani", "sanjeevViewerPass"));
        credsMap.put("Operator", Arrays.asList("OperatorSanjeevani", "sanjeevOperatorPass"));

        /*List<String> creds=credsMap.get(accessType);
        return creds;
        */
        return credsMap.get(accessType);
    }

    public static void main(String[] args) {
        TestMapWithGetCredential obj = new TestMapWithGetCredential();
        List<String> creds = obj.getCredential("Admin");
        String userName = creds.get(0);//userName
        String passward = creds.get(1);//passward

        System.out.println("userName is:" + userName);
        System.out.println("passward is:" + passward);
    }
}
