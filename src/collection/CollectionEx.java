package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEx {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Jitto");
        names.add("Damlin");
        names.add("Jerico");
        names.add("Piccaso");
        names.add("Anishtone");
        System.out.println("Names :"+names);

        Collection<String> extraNames = new ArrayList<>();
        extraNames.add("jenish");
        extraNames.add("Jensiya");
        extraNames.add("romario");

        names.addAll(extraNames);
        System.out.println("Names after add all "+names);

        boolean isContain = names.contains("Jerico");
        System.out.println("Is the name contains "+isContain);

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
