package ru.example;

public class Kat_4_1_7 {
    public static void main(String[] args) throws MyNewException {
        testExp();
    }
    //Реализуй метод и исключение здесь
    public static void testExp() throws MyNewException {
        throw new MyNewException();
    }

    static class MyNewException extends Throwable {
    }
}
