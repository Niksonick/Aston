package Module4.Task1;

public class DeadlockExample {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();


    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: удерживает lock1");
                try {
                    Thread.sleep(100); // Имитация работы
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: ожидает lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1: удерживает lock1 и lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: удерживает lock2");
                try {
                    Thread.sleep(100); // Имитация работы
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: ожидает lock1");
                synchronized (lock1) {
                    System.out.println("Thread 2: удерживает lock2 и lock1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
    }
