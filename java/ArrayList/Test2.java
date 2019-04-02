import java.util.ArrayList;
import java.util.List;


//String using arraylist here

public class Test2{
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();

        animals.add("Lion");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Dog");

        System.out.println(animals);

        System.out.println(animals.size()); //size of arraylist


        animals.add(2,"Elephant");//added new element in 2th index

        System.out.println(animals);


        String a = animals.get(0);//first element in arraylist

        System.out.println(a);

        String b = animals.get(animals.size()-1);//last element in arraylist

        System.out.println(b);
    }
}
