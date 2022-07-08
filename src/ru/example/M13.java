package ru.example;

public class M13 {
    public static void main(String[] args) {
        Rect rec1 = new Rect();
        Rect rec2 = new Rect(1, 2, 3, 4);
        Rect rec3 = new Rect(1, 2, 5.6, 7.6);
        Rect ar[] = {rec1, rec2, rec3};
        for (Rect r : ar){
            System.out.println("X1 = " + r.x1 + ", Y1 = " + r.y1 + ", X2 = " + r.x2 + ", Y2 = " + r.y2);
        }
//        System.out.println("X1 = " + rec1.x1 + ", Y1 = " + rec1.y1 + ", X2 = " + rec1.x2 + ", Y2 = " + rec1.y2);
//        System.out.println("X1 = " + rec2.x1 + ", Y1 = " + rec2.y1 + ", X2 = " + rec2.x2 + ", Y2 = " + rec2.y2);
//        System.out.println("X1 = " + rec3.x1 + ", Y1 = " + rec3.y1 + ", X2 = " + rec3.x2 + ", Y2 = " + rec3.y2);
    }
    static class Rect{
        int x1, y1, x2, y2;

        {
            x1 = 0; y1 = 10;
            x2 = 0; y2 = 20;
        }

        Rect(){}
        Rect(int x, int y, int x3, int y3){
            x1 = x; y1 = y;
            x2 = x3; y2 = y3;
        }
        Rect(int x, int y, double w, double h){
            x1 = x; y1 = y;
            x2 = (int)(x + w); y2 = (int)(y + h);
        }
    }
}
