package kata;

import java.util.Arrays;


public class k_6_1_13_2 {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.remove(7);
        array.remove(7);
        array.remove(7);
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        for (int i = 0; i < array.arr.length; i++) {
            System.out.print(array.get(i) + " ");
        }

    }

    public static class DynamicArray<T> {
        public Object[] arr = {};

        public void add(T el) {
            Object[] arr1;
            if (arr == null) {
                arr = new Object[]{el};
            } else {
                arr1 = Arrays.copyOf(this.arr, arr.length + 1);
                arr1[arr.length] = el;
                arr = arr1;
            }
        }

        public void remove(int index)  {
            Object[] arr1 = new Object[arr.length - 1];
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
                return (T)arr[index];
        }
    }
}
/*
кто будет мучаться - вот пара дополнений:
- конструктор не делайте, сразу инициализируйте массив, сделайте массив object произвольного размера, я делал 10 и не забудьте (T[]);
- в remove() часть массива правее удаляемого индекса должна смещаться левее, я делал так, что размер массива не менялся,
но в конце появлялись null. т.е. если был массив, например, 1, 2, 3, 4, 5, то после remove(1) получаем 1, 3, 4, 5, null;
- еще одна, сука, неочевидная херня, из-за которой я часа 2-3 потерял - тест 8 и исключение ArrayIndexOutOfBoundsException.
Я при проверке по старинке проверял, чтоб индекс за пределы массива не выходил, а нужно сравнивать с количеством, мать их так, заполненных элементов.
Т.е. если есть массив 1, 3, 4, 5, null, то формально ты можешь вызвать метод get(4), но получишь null, а нужно чтоб вместо этого вываливалось исключение.
 */