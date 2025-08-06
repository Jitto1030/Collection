package staticexample;

public class Human {
    String name;
    int age;
    String gender;
    String nationality;
    static int population;

    public Human(String name, int age, String gender, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        Human.population +=1;
    }

    public Human() {
    }

    @Override
    public String toString(){
        return name +" "+nationality+" "+age+" "+gender;
    }
}
