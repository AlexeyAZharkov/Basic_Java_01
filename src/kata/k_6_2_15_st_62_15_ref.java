package kata;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class k_6_2_15_st_62_15_ref {
    public static void main(String[] args) {
        LinkedList<Integer> deque = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            in.nextInt();
            if (in.hasNext()) {
                deque.addFirst(in.nextInt());
//                ((LinkedList<Integer>) deque).addFirst(in.nextInt());
            }
        }
        for (int i: deque) {
            System.out.printf("%s ", i);
        }
    }


}
