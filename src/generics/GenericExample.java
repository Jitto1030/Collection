package generics;

class Printer<T>{
    T thingToPrint;
    public Printer (T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(30);
        integerPrinter.print();
        Printer<String> stringPrinter = new Printer<>("Jitto");
        stringPrinter.print();
        Printer<Double> doublePrinter = new Printer<>(10.0);
        doublePrinter.print();
    }
}
