package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadMethod());
        Thread t2 = new Thread(new ThreadMethod1());
        Thread t3 = new Thread(new ThreadMethod2());
        t1.start();
        System.out.println("The get State "+ t1.getState()); //Returns 'RUNNABLE' when the thread is Running.
        t1.join(); // join method waits for one thread to be stopped before continuing the others.
        t2.start();
        t3.start();
        System.out.println(t1.getState()); //Returns 'TERMINATED' when the thread ends.
    }
}
