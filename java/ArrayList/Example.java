import java.util.*;

// **   Java 8 forEach and lambda expression.
// **   iterator().
// **   iterator() and Java 8 forEachRemaining() method.
// **   listIterator().
// **   Simple for-each loop.
// **   for loop with index.

public class Example {
    public static void main(String args[]) {
        List<String> tvShows = new ArrayList<String>();
        tvShows.add("News");
        tvShows.add("Movie");
        tvShows.add("comedy");
        tvShows.add("Songs");
        // Check if an ArrayList contains a given element
        System.out.println("Does array containes /Movie/ : "+ tvShows.contains("Movie"));

        //To check the index of elements
        System.out.println("index of Comedy elements: "+tvShows.indexOf("comedy"));
        System.out.println("index of Comedy elements: "+tvShows.indexOf("Bear"));
        
        //To check last Index of the elements
        System.out.println("index of Comedy elements: "+tvShows.lastIndexOf("Movie"));
        System.out.println("index of Comedy elements: "+tvShows.lastIndexOf("Bear"));

        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
        
        // String a = tvShows;
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });
        
        
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        // Here, we start from the end of the list and traverse backwards.
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String tvShow: tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
    }
}