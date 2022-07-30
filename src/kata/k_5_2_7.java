package kata;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class k_5_2_7 {
    public static void main(String[] args) throws IOException {
        byte[] data = {1, 2, 4, -10};
        InputStream inputStream = new ByteArrayInputStream(data);
        System.out.println(sumOfStream(inputStream));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int read;
        int result = 0;
        while ((read = inputStream.read()) != -1) {
//            System.out.println(read);
            result +=  (int)(byte)read;
        }
        return result;
    }
}
/**
 *  Cn+1=rotateLeft(Cn) xor bn+1 C_{n+1}=\mathrm{rotateLeft}(C_n)\ \mathrm{xor}\ b_{n+1}
 *  Cn+1​=rotateLeft(Cn​) xor bn+1​ , где Cn C_n Cn​ — контрольная сумма первых n байт данных,
 *  rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед,
 *  используйте Integer.rotateLeft), bn b_n bn​ — n-ный байт данных.
 */
//boolean isFirst = true;
//if (isFirst) {
//        System.out.print(read);
//        isFirst = false;
//        } else {
//        System.out.print(", " + read);
//        }