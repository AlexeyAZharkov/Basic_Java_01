package kata;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class st_52_8 {
    public static void main(String[] args) throws IOException {
        byte[] data = {0x33, 0x45, 0x01};
        InputStream inputStream = new ByteArrayInputStream(data);
        System.out.println(checkSumOfStream(inputStream));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int read;
        int result = 0;
        while ((read = inputStream.read()) >= 0) {
//            System.out.println(read);
            result = Integer.rotateLeft(result, 1) ^ read;
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