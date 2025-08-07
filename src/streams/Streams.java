package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,1,2,5,4);

        List<Integer> evens = nums.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());
        evens.forEach(n -> System.out.println(n));

        List<Integer> doubleNum = nums.stream()
                .map(n -> n*2)
                .collect(Collectors.toList());
        doubleNum.forEach(n -> System.out.println(n));

        List<String> names = Arrays.asList("Jitto","Jerico","Damlin","Piccaso","Anish","Jenish");
        List<String> jNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());
        jNames.forEach(name -> System.out.println(name));
    }
}