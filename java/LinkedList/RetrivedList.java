import java.util.*;
public class RetrivedList {

    public static void main(String args[]) {
        LinkedList<Double> sp = new LinkedList<Double>();

        sp.add(45.00);
        sp.add(51.00);
        sp.add(62.50);
        sp.add(42.57);
        sp.add(36.80);
        sp.add(41.26);
        sp.add(25.98);
        System.out.println(sp);

        Double firstElemnt = sp.getFirst();
        System.out.println(sp.getFirst());

        Double lastElement = sp.getLast();
        System.out.println(sp.getLast());

       

        Double stockPriceOn3rdDay = sp.get(2);
        System.out.println("Stock Price on 3rd Day : " + stockPriceOn3rdDay);


        Double element = sp.removeFirst();
        System.out.println("remove last Element "+element);

         element = sp.removeLast();
        System.out.println("remove last Element "+element);


        System.out.println(sp);

        boolean isRemoved = sp.remove(41.26);
        if(isRemoved) {
            System.out.println("Removed 41.26 => " + sp);
        }

        sp.clear();
        System.out.println("Cleared the LinkedList => " + sp);
    }
}