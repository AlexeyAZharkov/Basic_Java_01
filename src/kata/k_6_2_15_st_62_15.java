package kata;

import java.util.ArrayList;
import java.util.Scanner;


public class k_6_2_15_st_62_15 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
//        String[] inp = in.nextLine().split(" ");
        while (in.hasNextInt()) {
            arr.add(in.nextInt());
        }
//        for (String i : inp) {
//            arr.add(Integer.valueOf(i));
//        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            if(i % 2 == 1) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }


}
