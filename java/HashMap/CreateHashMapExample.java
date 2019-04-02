import java.util.*;

public class CreateHashMapExample{
    public static void main(String[] args) {
        Map<String,Integer> number = new HashMap<>();
        number.put("One",1);
        number.put("Two",2);
        number.put("Three",3);
        System.out.println(number);

        // number.putIfAbsent("Four", null);
        number.putIfAbsent("Four", 4);
        System.out.println(number);
    }
}