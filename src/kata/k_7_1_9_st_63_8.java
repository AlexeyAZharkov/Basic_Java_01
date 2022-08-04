package kata;


import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class k_7_1_9_st_63_8 {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        String st = "null";
        System.out.println(condition.test(st));
        System.out.println(ifTrue.apply(st));
        System.out.println(safeStringLength.apply(st));

    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

//
//        }

        return null;

    }
}
