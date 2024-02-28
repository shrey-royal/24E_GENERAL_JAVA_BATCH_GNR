class MyThread extends Thread {
    MyThread() {
        super();
    }

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoiningThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("one");
        MyThread t2 = new MyThread("two");

        t1.start();
        try {
            t1.join(3000);  //now t2 will wait for 3 seconds then starts executing
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
