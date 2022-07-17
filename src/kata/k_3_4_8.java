package kata;

import java.util.Objects;

public class k_3_4_8 {
    public final class ComplexNumber {
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
        public int hashCode() {
            return Objects.hash(getRe(), getIm());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ComplexNumber that = (ComplexNumber) o;
            return getRe() == that.getRe() &&
                    getIm() == that.getIm() &&
                    hashCode() == that.hashCode();
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) {
//                return true;
//            }
//            if (o instanceof ComplexNumber) {
//                ComplexNumber other = (ComplexNumber) o;
//                return (this.re == other.re && this.im == other.im);
//            }
//            return false;
//        }
//
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(re, im);
//        }
    }
}
