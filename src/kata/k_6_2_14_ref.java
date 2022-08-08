package kata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class k_6_2_14_ref {
    public static void main(String[] args) throws FileNotFoundException {
//        Reader reader = new FileReader("F:\\_Yand\\small\\_java\\step_bas_java\\_01\\src\\kata\\test.txt");
        Reader reader = new FileReader("C:\\_ya\\small\\_java\\step_bas_java\\_01\\src\\kata\\test.txt");
        System.out.println(getSalesMap(reader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> mapResult = new HashMap<>();
        Scanner in = new Scanner(reader);
        if (in.hasNext()) {
            String line = in.nextLine();
            mapResult.put(line.split(" ")[0], Long.valueOf(line.split(" ")[1]));
        }
        while (in.hasNext()) {
            String line = in.nextLine();
            mapResult.merge(line.split(" ")[0], Long.valueOf(line.split(" ")[1]), (v1, v2) -> v1 + v2);
        }
        return mapResult;
    }
}
