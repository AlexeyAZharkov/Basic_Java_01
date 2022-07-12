package ru.example;

public class St41_9 {
    public static void main(String[] args) {
        double a = sqrt(-1.2);
    }
    public static double sqrt(double x) {
        if (x < 0){
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        } else { return Math.sqrt(x); }
    }
}
