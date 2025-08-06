package staticexample;

public class Main {
    public static void main(String[] args) {
        Human jitto = new Human("jitto",21,"male","indian");
        Human jerico = new Human("Jerico",25,"Male","indian");
        Human damlin = new Human("Damlin",19,"male","indian");
        System.out.println(jitto.toString());
        System.out.println(jerico.toString());
        System.out.println(damlin.toString());
        System.out.println("The total population is '"+Human.population+"'");
    }
}
