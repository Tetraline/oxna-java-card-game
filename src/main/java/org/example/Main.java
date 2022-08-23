package org.example;

import java.util.concurrent.*;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Snap game = new Snap();
        game.playSnap();
    }

}