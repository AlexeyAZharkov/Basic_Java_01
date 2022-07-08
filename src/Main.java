import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(); int y = in.nextInt();
        System.out.println(summ(x, y));


    }
    static int summ(int x, int y){
        return x + y;

    }
}