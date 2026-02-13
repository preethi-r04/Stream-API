
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 11, 15, 20, 25, 30);

        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        firstEven.ifPresent(System.out::println);
    }
}
