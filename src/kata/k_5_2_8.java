package kata;

import java.io.*;

public class k_5_2_8 {
    public static void main(String[] args) throws IOException {
        byte[] data = {1, 2, 4, 11};
        InputStream inputStream = new ByteArrayInputStream(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException  {
        int read;
        boolean isFirst = true;
        while ((read = inputStream.read()) != -1) {
            if (read % 2 == 0) {
                if (isFirst) {
                    System.out.print(read);
                    isFirst = false;
                } else {
                    System.out.print(", " + read);
                }
                outputStream.write(read);
            }
        }
//        inputStream.close();
        outputStream.flush();
//        byte[] result = outputStream.;
    }

}

/**
 *  Cn+1=rotateLeft(Cn) xor bn+1 C_{n+1}=\mathrm{rotateLeft}(C_n)\ \mathrm{xor}\ b_{n+1}
 *  Cn+1​=rotateLeft(Cn​) xor bn+1​ , где Cn C_n Cn​ — контрольная сумма первых n байт данных,
 *  rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед,
 *  используйте Integer.rotateLeft), bn b_n bn​ — n-ный байт данных.
 */