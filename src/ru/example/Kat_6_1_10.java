package ru.example;

import java.util.Arrays;

public class Kat_6_1_10 {
    public static void main(String[] args) {
        Box <Integer> box = new Box<>();
        System.out.println(box.getBox().toString());
        box.getBox();
    }

    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<>();
        }
    }
}
