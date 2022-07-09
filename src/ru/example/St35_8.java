package ru.example;

import java.util.Objects;

public class St35_8 {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
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

        AsciiCharSequence(byte[] ar){
            this.ar = ar.clone();
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

        public String charAt(int x){
            return Character.toString((char)ar[x]) ;
        }

        String subSequence(int start, int end){
            StringBuffer sb = new StringBuffer();
            for (int i = start; i <= end; i++){
                sb.append((char)ar[i]);
            }
            return sb.toString();
        }
    }
    public interface CharSequence{
        int length();
    }
}
