import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Task t1 = new Task("Thread 1");
        Task t2 = new Task("Thread 2");
        Task t3 = new Task("Thread 3");
        Task t4 = new Task("Thread 4");
        Task t5 = new Task("Thread 5");

        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        pool.shutdown();
    }
}
