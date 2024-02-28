public class DaemonThread {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
    
        t1.start();
        t2.start();
        t3.setDaemon(true);
        t3.start();

        t1.interrupt();
        System.out.println(t1.isInterrupted());
        System.out.println(t1.isDaemon() + "\t" + t1.isAlive());
        System.out.println(t2.isDaemon() + "\t" + t2.isAlive());
        System.out.println(t3.isDaemon() + "\t" + t3.isAlive());
    
    }
}

/*
The Purpose of using daemon thread is to provide the background support to user threads.
if all user threads dies then JVM kills the daemon thread too.
*/