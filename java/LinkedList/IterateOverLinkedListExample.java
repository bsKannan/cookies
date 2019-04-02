import java.util.*;
public class IterateOverLinkedListExample{
    public static void main(String args[]){
        LinkedList<String> humanSpecies = new LinkedList<String>();
        humanSpecies.add("Homo Sapiens");
        humanSpecies.add("Homo Neanderthalensis");
        humanSpecies.add("Homo Erectus");
        humanSpecies.add("Home Habilis");

        System.out.println(humanSpecies);
        System.out.println();

        System.out.println("===Iterator over forEach and lambda");;

        humanSpecies.forEach(name ->{
            System.out.println(name);
        });

        System.out.println("\n=== iterator linkedlist using iterator()");
        Iterator<String> humanSpeciesIterator= humanSpecies.iterator();
        while(humanSpeciesIterator.hasNext()){
            String speciesName = humanSpeciesIterator.next();
            System.out.println(speciesName);
        }

        System.out.println();
        System.out.println("\n=== iterator() and forEach()");
        humanSpeciesIterator = humanSpecies.iterator();
        humanSpeciesIterator.forEachRemaining(speciesName ->{
            System.out.println(speciesName);
        });

        System.out.println();
        System.out.println("\n ===Desending order");
        Iterator<String> descendingHumanSpeciesIterator = humanSpecies.descendingIterator();
        while(descendingHumanSpeciesIterator.hasNext()){
            String speciesName = descendingHumanSpeciesIterator.next();
            System.out.println(speciesName);
        }

        System.out.println("\n===Iterator linkedlist using listIterator()===");

        ListIterator<String> humanSpecListIterator = humanSpecies.listIterator(humanSpecies.size());
        while (humanSpecListIterator.hasPrevious()) {
            String speciesName = humanSpecListIterator.previous();
            System.out.println(speciesName);
        }

        System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
        for(String speciesName: humanSpecies) {
            System.out.println(speciesName);
        }
    }
}