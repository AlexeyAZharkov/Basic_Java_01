package ru.example;

public class test {
    public static void main(String... args) {
        int toX = 3;
        int[] toY = {1, 2};
        moveRobot(toX, toY);
        System.out.println(toY[0]);
        test1 t = new test1();
        t.d = 4;

    }
    static public void moveRobot(int toX, int[] toY) {
        toX = 5;
        toY[0] = 4;
        System.out.println(toY[0]);

    }
}
class test1 {
    int d = 5;
}