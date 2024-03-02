/*
Deadlock problem: When a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object that is got by first thread.

*/

//DeadLock Problem
// public class DeadLock {
//     public static void main(String[] args) {
//         final String resource1 = "Eclairs"; 
//         final String resource2 = "Ferrero Rocher";
        
//         Thread t1 = new Thread("Dhyey") {
//             @Override
//             public void run() {
//                 synchronized(resource1) {
//                     System.out.println(Thread.currentThread().getName() + " got " + resource1);
//                     try {
//                         Thread.sleep(100);
//                     } catch (Exception e) {
//                         e.printStackTrace();
//                     }

//                     synchronized(resource2) {
//                         System.out.println(Thread.currentThread().getName() + " got " + resource2);
//                     }
//                 }
//             }
//         };

//         Thread t2 = new Thread("Disha") {
//             @Override
//             public void run() {
//                 synchronized(resource2) {
//                     System.out.println(Thread.currentThread().getName() + " got " + resource2);
//                     try {
//                         Thread.sleep(100);
//                     } catch (Exception e) {
//                         e.printStackTrace();
//                     }

//                     synchronized(resource1) {
//                         System.out.println(Thread.currentThread().getName() + " got " + resource1);
//                     }
//                 }
//             }
//         };

//         t1.start();
//         t2.start();
//     }
// }

//Deadlock Solution
public class DeadLock {
    public static void main(String[] args) {
        final String resource1 = "Eclairs"; 
        final String resource2 = "Ferrero Rocher";
        
        Thread t1 = new Thread("Dhyey") {
            @Override
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource2);
                    }
                }
            }
        };

        Thread t2 = new Thread("Disha") {
            @Override
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource2);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}