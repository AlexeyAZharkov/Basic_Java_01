package ru.example;

import java.util.Arrays;

public class Kat_3_5_6_St35_8 {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        byte bb;
//        int e = -1;
        AsciiCharSequence answer = new AsciiCharSequence(example);
//        System.out.println("args = ");
//        System.out.println("Последовательность - " + (byte) e);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!

    }
    public static class AsciiCharSequence  implements CharSequence {
        private final byte[] ar;

        public AsciiCharSequence(byte[] ar){
            this.ar = ar.clone();
            System.out.println("ar = " + this.ar);
        }

        public int length(){
            return ar.length;
        }

        public String toString() {
            return new String(ar);
        }

        public char charAt(int x){
            return (char)ar[x] ;
        }

        public CharSequence subSequence(int start, int end){
            return new AsciiCharSequence(Arrays.copyOfRange(ar, start, end));
        }
    }
//    public interface CharSequence{
//        int length();
//        String toString();
//        String subSequence(int start, int end);
//        String charAt(int x);
//    }
}
//
//    public String toString() {
//        StringBuffer sb = new StringBuffer();
//        for (int i : ar){
//            sb.append((char)i);
//        }
//        return sb.toString();
//    }