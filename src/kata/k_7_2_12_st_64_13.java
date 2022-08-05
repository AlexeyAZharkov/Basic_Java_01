package kata;


import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class k_7_2_12_st_64_13 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        String st = in.nextLine();
        String [] arr = in.nextLine().toLowerCase().split("[^A-Za-z0-9А-Яа-я]");
        Stream <String> streamFromArray = Arrays.stream(arr);
        Stream <String> streamFrom = streamFromArray
                .distinct()
                .limit(2)
                .map(x -> x.toUpperCase());
        streamFrom.forEach(System.out::println);


//        for (String s : arr) {
//            System.out.println(s);
//        }

//        for (String a : arr) {
//            System.out.println(a);
//        }



    }


}
