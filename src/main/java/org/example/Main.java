package org.example;

import java.util.concurrent.*;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Snap game = new Snap();
        game.playSnap();
        //ExecutorService e = newSingleThreadExecutor();
        //Future<String> result = e.submit(new ConsoleInputReadTask());
        //String userInput = null;
        //try {
        //    userInput = result.get(5, TimeUnit.SECONDS);
        //} catch (TimeoutException ex) {
        //    System.out.println("Out of time!");
        //    result.cancel(true);
        //}
        //System.out.println("input was: " + userInput);

        //e.shutdown();
    }

}