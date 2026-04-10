package thread;

public class DeadLockDemo {

    static Object obj1 = new Object();
    static Object obj2 = new Object();

    public static void main(String[] args) {

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                System.out.println("Thread 1 acquired obj1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (obj2) {
                    System.out.println("Thread 1 acquired obj2");
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (obj2) {
                System.out.println("Thread 2 acquired obj2");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (obj1) {
                    System.out.println("Thread 2 acquired obj1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}