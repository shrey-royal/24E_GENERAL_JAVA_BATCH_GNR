class MyThread extends Thread {
    MyThread() {
        super();
    }

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadSchedular {
    public static void main(String[] args) {
        // Thread t1 = new Thread();
        // System.out.println(t1.getName());
        // Thread t2 = new Thread("New Thread");
        // System.out.println(t2.getName());

        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();

        // System.out.println(t2.getPriority());

    }
}

/*
Thread Scheduler: A component that decides which thread should get executed.
it only picks threads which is in runnable state.

criteria to get selected by the thread scheduler:
1. priority and 2. time of arrival

3 algorithm/methods:

1. first come first serve scheduling
2. Time slicing Scheduling
3. Preemptive-priority Scheduling

*/