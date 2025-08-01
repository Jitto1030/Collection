package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Jitto");
        names.add("Damlin");
        names.add("Jerico");
        names.add("Piccaso");
        names.add("Anishtone");

        for (String name : names){
            System.out.println(name);
        }
    }
}
