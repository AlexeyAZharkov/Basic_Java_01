package kata;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class k_5_3_12_st_53_13 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Double result = 0.0;
//        Scanner in = new Scanner("1 2 3");
        while (in.hasNext()) {
            String st = in.next();
            try {
                result += Double.parseDouble(st);
            } catch (NumberFormatException e) {}
//            System.out.println(result);
        }
        System.out.printf("%.6f", result);
    }
}
