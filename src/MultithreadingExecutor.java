import java.util.concurrent.*;

/**
 * Created by naveenjetty on 12/26/16.
 */
public class MultithreadingExecutor {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            System.out.println("A");
        });
        try {
            System.out.println("Attempting shutdown of executor");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }
    }
}
