package ru.example;

import java.util.Arrays;
import java.util.List;

public class Print {

    void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        Print print = new Print();
        List list = Arrays.asList("first step", null, null, "second step");
//        int i = 0;
        String[] arr = {null, null, null, "first step", null, "second step"};

        for (int i = 0; i < 6; ++i) {
            String s = arr[i];
            try {
                print.print(s);
                System.out.println("i = " + i);
                i = 6;
            }
            catch (NullPointerException e) {
                if (i == 2) {
                    System.out.println(e.getMessage());
                    System.out.println("Exception was processed. i = " + i);
                }

            }
            finally {
//                System.out.println("Inside bloсk finally");
            }
//            System.out.println("Go program....");
            System.out.println("-----------------");
        }

    }
}
