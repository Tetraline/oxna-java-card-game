package org.example;

import java.util.concurrent.*;

public class ConsoleInput {
    private final int timeout;
    private final TimeUnit unit;
    private final ExecutorService executorService;

    public ConsoleInput(ExecutorService executorService, int timeout, TimeUnit unit) {
        this.timeout = timeout;
        this.unit = unit;
        this.executorService = executorService;
    }

    public String readLine() throws InterruptedException {
        String input = null;
        Future<String> result = executorService.submit(
                new ConsoleInputReadTask());
        try {
            input = result.get(timeout, unit);
        } catch (ExecutionException e) {
            e.getCause().printStackTrace();
        } catch (TimeoutException e) {
            result.cancel(true);
        }
        return input;
    }
}