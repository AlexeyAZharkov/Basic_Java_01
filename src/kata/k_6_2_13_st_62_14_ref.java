package kata;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

public class k_6_2_13_st_62_14_ref {
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
        Set set1Copy = new HashSet(set1);
        Set set2Copy = new HashSet(set2);
        set1Copy.removeAll(set2);
        set2Copy.removeAll(set1);
        set1Copy.addAll(set2Copy);
        return set1Copy;

    }
}
