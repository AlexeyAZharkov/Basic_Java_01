package ru.example;

public class M12 {
    public static void main(String[] args) {
        Point3D pt = new Point3D();
        Point3D pt1 = new Point3D(1, 2, 3);
//        pt1.x = 1; pt1.y = 2; pt1.z = 3;
        System.out.println("x = " + pt1.x + ", y = " + pt1.y + ", z = " + pt1.z + ",  color "+ pt1.color);

    }
    static class Point3D{
        int x, y, z;
        int color;

        Point3D(){
            x = 4; y = 5; z = 6; color = 0;
        }

        Point3D(int x, int y, int z){
//            x = x1; y = y1; z = z1;
            this();
            this.x = x; this.y = y; this.z = z;
        }
    }
}
