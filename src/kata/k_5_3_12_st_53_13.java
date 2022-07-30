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
            if (in.hasNextDouble()) {
                result += Double.parseDouble(in.next());
            } else {
                in.next();
            }

        }
        System.out.printf("%.6f", result);
//        java.io.BufferedReader(Reader r)
    }
}
