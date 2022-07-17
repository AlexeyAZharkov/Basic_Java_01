package ru.example;

import java.util.Arrays;

public class St35_8 {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        byte bb;
        AsciiCharSequence answer = new AsciiCharSequence(example);
//        System.out.println("args = ");
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

        public String toString(){
            StringBuffer sb = new StringBuffer();
            for (int i : ar){
                sb.append((char)i);
            }
            return sb.toString();
        }

        public char charAt(int x){
            return (char)ar[x] ;
        }

        public CharSequence subSequence(int start, int end){
            byte[] n = new byte[end - start];
            for(int i = 0; i < end - start; i++) {
                n[i] = ar[i + start];
            }
            return new AsciiCharSequence(n);
        }
    }
//    public interface CharSequence{
//        int length();
//        String toString();
//        String subSequence(int start, int end);
//        String charAt(int x);
//    }
}
