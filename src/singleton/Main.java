package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println("The username of the first reference is "+singleton.getUsername());
        System.out.println("The password of the first reference is "+singleton.getPassword());

        System.out.println("The username of the second reference is "+singleton1.getUsername());
        System.out.println("The password of the second reference is "+singleton1.getPassword());
    }
}
