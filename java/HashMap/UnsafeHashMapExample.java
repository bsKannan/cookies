// Java HashMap is not thread-safe. It may become non-deterministic in multi-threaded environments where multiple threads try to modify the HashMap concurrently.


// ==== Example demonstrating HashMap’s unpredictable behavior in multi-threaded environments  ====

import java.util.*;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnsafeHashMapExample {
    public static void main(String args[]) throws InterruptedException{ 
        Map<String, Integer> cricketTeamScore = new HashMap<>();
        cricketTeamScore.put("Australia",373);
        cricketTeamScore.put("India", 290);

        //Create an EcecutorService with a Thread Pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //Create a Runnable object that increments the value associated with a given key in the HashMap by One.
        Runnable task = ()->{
            incrementTeamScore(cricketTeamScore,"India");
        };

        for(int i = 0;i<100;i++){
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println("Final score of Team India :  "+ cricketTeamScore.get("India"));
    }

        //Increment the score of a team by one
    private static void incrementTeamScore(Map<String, Integer> cricketTeamScore, String team){
        Integer score = cricketTeamScore.get(team);
        cricketTeamScore.put(team,score+1);
    }
    
}