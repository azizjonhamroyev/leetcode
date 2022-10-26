package task_real_time;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture.runAsync(runnable1);
        CompletableFuture.runAsync(runnable2);
    }

    private static Runnable runnable1 = () -> {
        System.out.println("thread 1");

    };
    private static Runnable runnable2 = () -> {
        System.out.println("thread 2");
    };
}
