package kata;
//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class k_7_2_12_st_64_13ref3 {
    public static void main(String[] args) throws IOException {
        new BufferedReader(new InputStreamReader(System.in))
            .lines()
            .map(line -> line.toLowerCase().split("[\\p{Blank}\\p{Punct}]+"))
            .flatMap(Arrays::stream)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(10)
            .forEach(e -> System.out.println(e.getKey()));

    }
}
// РАБОЧЕЕ решение
// решить без создания полей, не разрывая цепочки методов, методом chaining