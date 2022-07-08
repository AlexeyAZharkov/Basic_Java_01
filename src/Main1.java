import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class Main1 {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.println(summ(in.nextInt(), in.nextInt()));
//        in.close();
        System.out.println(integrate(x -> 1, 0, 10));
    }
    static int summ(int x, int y) { return x + y ; }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = 0.1;
        double epsil = 0.01;
        double firstRes = 0;
        for (double st = step; ; st *= 0.5 ){
            double result = 0;

            for (double x = a; x < b; x += st){
                result += f.applyAsDouble(x) * st;
            }
//            System.out.println(firstRes);
            if (firstRes == 0) {
                firstRes = result;
                continue;
            }
            if (Math.abs(firstRes - result) < epsil) {
                System.out.println("Step: " + st);
                return result;
            }
            firstRes = result;
        }
    }

}
