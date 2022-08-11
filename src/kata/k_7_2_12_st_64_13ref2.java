package kata;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class k_7_2_12_st_64_13ref2 {
    public static void main(String[] args) throws IOException {
        new BufferedReader(new InputStreamReader(System.in))
            .lines()
            .map(line -> line.toLowerCase().split("[\\p{Blank}\\p{Punct}]+"))
            .flatMap(Arrays::stream)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .sorted((e1, e2) -> {
                if (e1.getValue() == e2.getValue()) {
                    return e1.getKey().compareTo(e2.getKey());
                } else {
                    return e2.getValue().compareTo(e1.getValue());
                }
            } )
            .limit(10)
            .forEach(e -> System.out.println(e.getKey()));

    }
}
// РАБОЧЕЕ решение
// решить без создания полей, не разрывая цепочки методов, методом chaining