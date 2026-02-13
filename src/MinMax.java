
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo);

        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);

        System.out.println("Min Even: " + minEven.orElse(null));
        System.out.println("Max Even: " + maxEven.orElse(null));
    }
}
