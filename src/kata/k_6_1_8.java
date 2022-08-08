package kata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class k_6_1_8 {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new FileReader("F:\\_Yand\\small\\_java\\step_bas_java\\_01\\src\\kata\\test.txt");
        System.out.println(getSalesMap(reader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> mapResult = new HashMap<>();
        Scanner in = new Scanner(reader);
        while (in.hasNext()) {
            String[] inp = in.nextLine().split(" ");
            if (mapResult.get(inp[0]) != null) {
                mapResult.put(inp[0], mapResult.get(inp[0]) + Long.valueOf(inp[1]));
            } else {
                mapResult.put(inp[0], Long.valueOf(inp[1]));
            }
        }
        return mapResult;
    }
}
