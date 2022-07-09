package ru.example;

import java.util.Objects;

public class St34_1 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a);
        System.out.println(a.equals(b)); //must return true
        System.out.println(a.hashCode() == b.hashCode());

//        a.hashCode() must be equal to b.hashCode()
    }
    public static final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object anObject) {
            if (this == anObject) { return true; }
            if (anObject instanceof ComplexNumber) {
                ComplexNumber other = (ComplexNumber) anObject;
//                System.out.println(this.im + "  " + other.re);
                return (this.re == other.re && this.im == other.im);
            }
            return false;
        }


        @Override
        public int hashCode() {
//            System.out.println(Objects.hash(re, im));
            return Objects.hash(re, im);
        }

        @Override
        public String toString(){
            return "re = " + re + ", im = " + im;
        }

    }
}
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ComplexNumber that = (ComplexNumber) o;
//        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
//    }