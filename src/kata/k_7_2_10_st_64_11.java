package kata;


import java.util.stream.IntStream;

public class k_7_2_10_st_64_11 {
    public static void main(String[] args) {
        for (int i : pseudoRandomStream(13).limit(11).toArray()) {
            System.out.println(i);
        }
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n / 10 % 1000);
    }

}
