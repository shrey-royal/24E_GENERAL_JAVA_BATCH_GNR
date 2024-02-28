import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) message: " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + "(End)");
    }

    void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i=0; i<100; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);   //run thread
        }
        executor.shutdown();

        while(!executor.isShutdown()) {}

        System.out.println("Finished all Threads");
    }
}
