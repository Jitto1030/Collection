package threads;

public class Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(new Team1(counter));
        Thread thread1 = new Thread(new Team1(counter));
        thread.start();
        thread1.start();
        try{
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.count);
    }
}

class Counter{
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}

class Team1 implements Runnable{

    Counter counter;
    Team1(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
