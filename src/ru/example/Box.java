package ru.example;

public class Box <T> {
    private T object;

    public Box<T> getBox() {
        return new Box<T>();
    }
}

