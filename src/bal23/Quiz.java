package bal23;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Quiz {

    public static void main(String[] args) throws Exception {
//        System.out.println(priceCalculation(2.3, 5));
//        System.out.println(drawisMonitorsCounter(9, 4));
//        System.out.println(factorial(2));
//        System.out.println(determineGroup(16));
        printOddNumbers(new int[]{1, 3, 2, 4, 5, 2});
    }
    public static double priceCalculation(double price, int count) {
        return price * count;
    }
    public static int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
//    public static char charExpression(int a) {
//        //Твой код здесь
//    }
    public static boolean isPowerOfTwo(int value) {
        int x = java.lang.Integer.bitCount(Math.abs(value));
        return x == 1;
    }

//    public static BigInteger factorial(int value) {
//        BigInteger result = BigInteger.valueOf(1);
//        if (value == 0) {
//            return result;
//        }
//        for (int i = 1; i <= value; i++){
//            BigInteger nextValue = BigInteger.valueOf(i);
//            result =  result.multiply(nextValue);
//        }
//        return result;
//    }

    public static BigInteger factorial(int value) {
        BigInteger result;
        if (value == 0 | value == 1) {
            return BigInteger.valueOf(1);
        } else {
            result = BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
        return result;
    }

    public static int determineGroup(int age) {
        //1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 лет.
        if (age > 6 & age < 14) {
            return 1;
        } else if (age > 13 & age < 18) {
            return 2;
        } else if (age > 17 & age < 66) {
            return 3;
        }
        return -1;
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int number : arr) {
            if (Math.abs(number) % 2 == 1) {
                if (result.length() > 0) {
                    result.append(",").append(number);
                } else {
                    result.append(number);
                }
            }
        }
        System.out.println(result.toString());
    }
}