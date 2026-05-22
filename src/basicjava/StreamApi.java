package basicjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApi {
    static void main(String[] args) {
        List<Integer> a = Arrays.asList(5, 4, 3, 2, 1);

        a.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2).forEach(n -> System.out.print(n + " "));
        System.out.println();
        a.forEach(n -> System.out.print(n + " "));


    }
}
