package lambda;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

@FunctionalInterface
interface Hello{
    void sayHello();
}

@FunctionalInterface
interface Greet{
    String greet(String name);
}

public class Main {
    public static void main(String[] args) {
        Greet greet = name -> "Good morning "+name;
        System.out.println(greet.greet("jitto"));

        Hello hello = () -> System.out.println("Hello");
        hello.sayHello();

        Calculator calc = (a,b) -> a+b;
        System.out.println(calc.add(10,20));
    }
}
