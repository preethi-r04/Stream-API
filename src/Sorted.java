
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(25, 10, 5, 30, 15);

        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
