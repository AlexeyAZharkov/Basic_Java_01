package kata;

import java.io.FileNotFoundException;


public class k_6_1_13_ {
    public static void main(String[] args) {
        k_6_1_13.DynamicArray<Integer> a = new k_6_1_13.DynamicArray<>();
        a.add(2);
        a.add(3);
    }

    public static class DynamicArray<T> {
        public T[] arr;

        public DynamicArray() {
        }

        public void add(T el) {
            int len = (arr != null) ? arr.length : 0;
            T[] arr1 = (T[]) new Object[len + 1];
            for (int i = 0; i < len; ++i) {
                arr1[i] = arr[i];
            }
            arr1[len] = el;
            arr = arr1;
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
        }

        public T get(int index) {
            return arr[index];
        }
    }

}
