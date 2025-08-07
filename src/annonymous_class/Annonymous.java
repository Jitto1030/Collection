package annonymous_class;

interface Animal{
    void sound();
    void eat();
    void sleep();
}

public class Annonymous {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Bow Bow");
            }

            @Override
            public void eat() {
                System.out.println("Eat");
            }

            @Override
            public void sleep() {
                System.out.println("Sleep");
            }
        };
        dog.sound();
        dog.eat();
        dog.sleep();
    }
}
