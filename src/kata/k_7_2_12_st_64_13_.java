package kata;


import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class k_7_2_12_st_64_13_ {
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

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : arr) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }
//        for (String k : hashMap.keySet()) {
//            System.out.println(k + " - " + hashMap.get(k));
//        }
        HashMap<String, Integer> sortedHashMap = hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByKey())
                .limit(10)
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        for (String k : sortedHashMap.keySet()) {
            System.out.println(k + " - " + hashMap.get(k));
        }


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


}
// Мама мыла-мыла-мыла раму!
// Помогло использование регулярки [\\p{Blank}\\p{Punct}]+
// "[^A-Za-z0-9А-Яа-я]"
// яама мыла-мыла-мыла раму!
/*
new InputStreamReader(System.in, "UTF-8")

3) Comparator.reverseOrder() - это вам понадобится :)

Ура! Долго долбался. Часов 6.... Основная проблема была в незнании как убрать кол-во вхождений. Вот так завершается! :)

        .map(e0 -> e0.getKey())
        .limit(10)
        .forEach(System.out::println);
*/