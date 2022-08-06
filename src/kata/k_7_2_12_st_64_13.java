package kata;


import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class k_7_2_12_st_64_13 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        String st = in.nextLine();
        String [] arr = in.nextLine().toLowerCase().split("[\\p{Blank}\\p{Punct}]+");
//        Arrays.stream(arr).sorted();
//        Stream <String> streamFromArray = Arrays.stream(arr);
//        Stream <String> streamFrom = streamFromArray
//                .sorted();
//        streamFrom.forEach(System.out::println);

        Map<String, Long> result =
                Arrays.stream(arr).collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        result.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if(e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
                    else return e2.getValue().compareTo(e1.getValue());})
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }

        //Sort a map and add to finalMap
//        Set<String> mySet = result.entrySet().stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue()
//                        .reversed());
//
//        System.out.println(finalMap);

//        HashMap<String, Integer> hashMap = new HashMap<>();
//        for (String s : arr) {
//            if (hashMap.containsKey(s)) {
//                hashMap.put(s, hashMap.get(s) + 1);
//            } else {
//                hashMap.put(s, 1);
//            }
//        }

//        for (String k : result.keySet()) {
//            System.out.println(k + " - " + result.get(k));
//        }

//        HashMap<String, Integer> sortedHashMap = result.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .sorted(Map.Entry.comparingByKey())
//                .limit(10)
//                .collect(Collectors
//                        .toMap(Map.Entry::getKey,
//                                Map.Entry::getValue,
//                                (e1, e2) -> e1,
//                                LinkedHashMap::new));
//
//        for (String k : sortedHashMap.keySet()) {
//            System.out.println(k + " - " + hashMap.get(k));
//        }


//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap = streamFrom
//                .map(x -> x, x -> x.length());


//        for (String s : arr) {
//            System.out.println(s);
//        }

//        for (String a : arr) {
//            System.out.println(a);
//        }






}
// Мама мыла-мыла-мыла раму!
// Помогло использование регулярки [\\p{Blank}\\p{Punct}]+
// "[^A-Za-z0-9А-Яа-я]"
// яама мыла-мыла-мыла раму!
// Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.