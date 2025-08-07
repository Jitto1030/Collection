package threads;

public class MultiThreading extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running from the task 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }
}

class Task2 extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running from the task 2 ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }
}

class Task3 extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running from the task 3 ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }
}
