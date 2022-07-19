package ru.example;

public class Kat_4_2_7 {
    public static void main(String... args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException e) {}
    }

    public static class Car implements AutoCloseable {
        public final void drive() {
            System.out.println("Машина поехала.");
        }

        public void close() {
            System.out.println("Машина закрывается...");
        }
    }
}
