package kata;

import java.util.Objects.*;

public class k_3_4_8_re {
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
            Double red = (Double) re;
            Double imd = (Double) im;
            int result = red.hashCode();
            return result * 31 + imd.hashCode();
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
            return Double.compare(getRe(), that.getRe()) == 0 &&
                    Double.compare(getIm(), that.getIm()) == 0 &&
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
