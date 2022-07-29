package ru.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Kat_6_1_13 {
    public static void main(String[] args) {
//        Integer[] arr = {1, 2};
//        String[] arr = {"111w", "22w"};
//        DynamicArray<String> myArr = new DynamicArray<>(arr);
//        System.out.println(myArr.get(1));
//        myArr.add("3ee");
//        myArr.remove(1);

    }

    public static class DynamicArray<T> {
        public T[] arr = (T[]) new Object[0];

        public DynamicArray() {
        }

//        public DynamicArray(T[] first) {
//            arr = first;
//        }

        public void add(T el) {
            int len = (arr != null) ? arr.length : 0;
            T[] arr1 = (T[]) new Object[len + 1];
            for (int i = 0; i < len; ++i) {
                arr1[i] = arr[i];
            }
            arr1[len] = el;
            arr = arr1;
//            System.out.println(arr[0]);
        }

        public void remove(int index)  {
            T[] arr1 = (T[]) new Object[arr.length - 1];
            int ad = 0;
            for (int i = 0; i < arr.length; ++i) {
                if (i != index) {
                    arr1[i + ad] = arr[i];
                } else {
                    ad--;
                }
            }
            arr = arr1;
//            System.out.println(arr[1]);
        }

        public T get(int index) {
            return arr[index];
        }
    }
}
