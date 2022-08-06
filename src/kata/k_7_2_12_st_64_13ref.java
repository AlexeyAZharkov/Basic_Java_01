package kata;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class k_7_2_12_st_64_13ref {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        in.lines()
                .map(line -> line.toLowerCase().split("[\\p{Blank}\\p{Punct}]+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (e1.getValue() == e2.getValue()) {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                    else {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                } )
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));

        in.close();

//        String [] arr = in.lines().toArray().toLowerCase().split("[\\p{Blank}\\p{Punct}]+");
//
//
//        Map<String, Long> result =
//                Arrays.stream(arr).collect(
//                        Collectors.groupingBy(
//                                Function.identity(), Collectors.counting()
//                        )
//                );
//
//        result.entrySet()
//                .stream()
//                .sorted((e1, e2) -> {
//                    if(e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
//                    else return e2.getValue().compareTo(e1.getValue());})
//                .limit(10)
//                .forEach(e -> System.out.println(e.getKey()));
    }




}
// Мама мыла-мыла-мыла раму!
// Помогло использование регулярки [\\p{Blank}\\p{Punct}]+
// "[^A-Za-z0-9А-Яа-я]"
// яама мыла-мыла-мыла раму!
// Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.