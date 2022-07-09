package ru.example;

public class M14 {
    public static void main(String[] args) {
        Vec2 v1 = new Vec2();
        Vec2 v2 = new Vec2();

        v1.setVect(2, -1);
        v2.setVect(3, 4);
        Vec2 v3 = v1.sum(v1, v2);
        Vec2 v4 = v1.sub(v1, v2);
        System.out.println("A = " + v3.getA() + ", B = " + v3.getB());
        System.out.println("A = " + v4.getA() + ", B = " + v4.getB());

    }
    static class Vec2 {
        private int a, b;
        final int MAX_VAL = 9;

        {
            a = 0; b = 0;
        }

        Vec2(){}

        void setVect(int a, int b){
            if (a >= -MAX_VAL && a <= MAX_VAL && b >= -MAX_VAL && b <= MAX_VAL) {
                this.a = a;
                this.b = b;
            }
        }

        Vec2 sum(Vec2 v1, Vec2 v2){
            Vec2 v3 = new Vec2();
            v3.setVect(v1.getA() + v2.getA(), v1.getB() + v2.getB());
            return v3;
        }

        Vec2 sub(Vec2 v1, Vec2 v2){
            Vec2 v3 = new Vec2();
            v3.setVect(v1.getA() - v2.getA(), v1.getB() - v2.getB());
            return v3;
        }

        int getA(){ return a; }
        int getB(){ return b; }
    }
}
