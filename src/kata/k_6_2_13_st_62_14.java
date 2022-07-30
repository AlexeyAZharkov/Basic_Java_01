package kata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.*;

public class k_6_2_13_st_62_14 {
    public static void main(String[] args) throws FileNotFoundException {
//        Reader reader = new FileReader("F:\\_Yand\\small\\_java\\step_bas_java\\_01\\src\\kata\\test.txt");
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(4);
        set2.add(1);
        set2.add(4);
        set2.add(3);
        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> symDiff = new HashSet<>();
        for (T i : set1) {
            if (!set2.contains(i)) {
                symDiff.add(i);
            }
        }
        for (T i : set2) {
            if (!set1.contains(i)) {
                symDiff.add(i);
            }
        }
        return symDiff;
    }
}
