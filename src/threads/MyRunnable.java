package threads;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Running in the MyRunnable.");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
