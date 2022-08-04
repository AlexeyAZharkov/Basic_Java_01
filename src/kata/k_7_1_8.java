package kata;


public class k_7_1_8 {
    public static void main(String[] args) {

    }
    public interface NumberGenerator <T extends Number> {
        boolean cond(T arg);
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return x -> x.intValue() > 0;
    }
}
