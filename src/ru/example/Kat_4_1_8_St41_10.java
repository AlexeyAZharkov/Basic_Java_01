package ru.example;

public class Kat_4_1_8_St41_10 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] methods;
        methods = new Throwable().getStackTrace();

        if (methods.length>2) {
            return methods[2].getClassName() + "#" + methods[2].getMethodName();
        }
        return null;
    }

}
