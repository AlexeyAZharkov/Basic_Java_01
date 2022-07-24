package kata;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class k_5_3_11_st_53_12 {
    public static void main(String[] args) throws IOException {
        byte[] data = {48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(data);
        Charset charset = StandardCharsets.US_ASCII;
        System.out.println(readAsString(inputStream, charset));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuffer result = new StringBuffer();
        Reader reader = new InputStreamReader(inputStream, charset);
        int read;
        while ((read = reader.read()) != -1) {
            result.append((char) read);
//            System.out.println((char) read);
        }
        return result.toString();
    }
}
/**
 *  Cn+1=rotateLeft(Cn) xor bn+1 C_{n+1}=\mathrm{rotateLeft}(C_n)\ \mathrm{xor}\ b_{n+1}
 *  Cn+1​=rotateLeft(Cn​) xor bn+1​ , где Cn C_n Cn​ — контрольная сумма первых n байт данных,
 *  rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед,
 *  используйте Integer.rotateLeft), bn b_n bn​ — n-ный байт данных.
 */