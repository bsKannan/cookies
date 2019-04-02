import java.util.*;

public class Test3{
    public static void main(String args[]){
        List<Integer>  al = new ArrayList<Integer>();
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(11);

        List<Integer> al2 = new ArrayList<Integer>();
        al2.add(13);
        al2.add(17);
        al2.add(19);
        al2.add(23);
        al2.add(31);

        al.addAll(al2);  //Inserts all of the elements in the specified collection into this list at the specified position 
        System.out.println(al);
        al.remove(2);
        System.out.println("Removed 2th position"+al);
        // al2.clear(); 
        al.removeAll(al2);
        System.out.println("Removed al2 elements"+al);
    }
}