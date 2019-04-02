import java.util.*;

public class HashMapEntryKeySetValuesExample {

    public static void main(String args[]){
        Map<String, String> countryISO = new HashMap<>();
        countryISO.put("India","IN");
        countryISO.put("United States of America","US");
        countryISO.put("Russia","RU");
        countryISO.put("Japan","JP");
        countryISO.put("China","CN");

        System.out.println(countryISO);

        Set<Map.Entry<String, String>> countryEntries = countryISO.entrySet();
        System.out.println("countryISO entries: "+ countryEntries); 
        System.out.println();

        Set<String> countries = countryISO.keySet();
        System.out.println("countries: "+countries);

        Collection<String> isoCodes = countryISO.values();
        System.out.println("isocodes "+ isoCodes);
    }
}