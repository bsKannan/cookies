import java.util.*;
public class AccessKeysFromHashMapExample{
    public static void main(String args[]){
        Map<String,String>  city = new HashMap<>();

        System.out.println(city.isEmpty());
            city.put("Kannan","Salem");
            city.put("Bala","Chennai");
            city.put("jennie","karnataka");
            System.out.println(city.isEmpty());
            System.out.println(city);
        System.out.println(city.size());


        String userName = "Steve"; //searching this name in hashmap
        // Check if a key exists in the HashMap
        if(city.containsKey(userName)){
            String c = city.get(userName);
            System.out.println(userName +" lives in " +c);
        }
        else {
            System.out.println("City details not found for user " + userName);
        }
        // Check if a value exists in a HashMap
        if(city.containsValue("Chennai")){//Here searching for using value
            System.out.println("There is a user in the userCityMapping who lives in Chennai");
        } else {
            System.out.println("There is no user in the userCityMapping who lives in Chennai");
        }

        city.put(userName, "Kovai");

        System.out.println(userName + "moved to a new city " +city.get(userName));

        System.out.println("vas's city : "+city.get("Vas"));
    }
}