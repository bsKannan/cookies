import java.util.*;
public class Example{
    public static void main(String args[]) {
        
    LinkedHashMap<String,Integer> number = new LinkedHashMap<>();

    number.put("One",1);
    number.put("Two",2);
    number.put("Three",3);
    number.put("Four", 4);


    number.putIfAbsent("Five",5);

    System.out.println(number);
    }
}