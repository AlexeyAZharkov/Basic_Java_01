package kata;


import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class k_7_2_11_st_64_12 {
    public static void main(String[] args) {

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T [] array =(T []) stream.sorted(order).toArray();
        if ((array.length == 0)) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(array[0], array[array.length- 1]);
        }

    }

}
