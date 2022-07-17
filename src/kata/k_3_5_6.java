package kata;

import java.util.Objects;

public class k_3_5_6 {
    public static class AsciiCharSequence  implements CharSequence {
        private final byte[] ar;

        AsciiCharSequence(byte[] ar) {
            this.ar = (byte[]) ar.clone();
        }

        public int length() {
            return ar.length;
        }

        public String toString() {
            StringBuffer sb = new StringBuffer();
            for (int i : ar){
                sb.append((char)i);
            }
            return sb.toString();
        }

        public char charAt(int x) {
            return (char)ar[x];
        }

        public CharSequence subSequence(int start, int end){
            byte[] n = new byte[end - start];
            for(int i = 0; i < end - start; i++) {
                n[i] = ar[i + start];
            }
            return new AsciiCharSequence(n);
        }
    }
}
