import java.math.BigInteger;

public class q {

    public static void main(String[] args) throws Exception {
//        System.out.println(booleanExpression(false, true, false, true));
//        System.out.println(leapYearCount(100));
//        System.out.println(doubleExpression(0.1, 0.23, 0.3));
//        System.out.println(flipBit(5, 3));
//        System.out.println(charExpression(32));
//        System.out.println(isPowerOfTwo(64));
//        System.out.println(isPalindrome("Madam, I'm Adam!"));
//        System.out.println(factorial(51));
//        System.out.println(mergeArrays(new int[]{1, 2, 3, 5}, new int[]{1, 4}));
        String [] roles= {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович", "Лука Лукич"};
        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
        }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a ^ b) & (c ^ d)) || ((a ^ c) & (b ^ d)) || ((a ^ d) & (b ^ c));
    }

    public static int leapYearCount(int year) {
        return year / 4 + year/400 - year / 100;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }

    public static int flipBit(int value, int bitIndex) {
        int index = (int) (Math.pow(2.0, bitIndex - 1));
        if ((value & index) == index) return value & ~index;
        else return value + index;
        // better
        //return value ^ 1 << --bitIndex;
    }

    public static char charExpression(int a) {
        char x = '\\';
        return (char) (x + a);
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        int x = java.lang.Integer.bitCount(Math.abs(value));
        if (x == 1) return true;
        else return false;
    }

    /**
     * Checks if given <code>text</code> is a palindrome.
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        String text1 = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder textBuilder = new StringBuilder(text1);
        String text2 = String.valueOf(textBuilder.reverse());
        return text1.equalsIgnoreCase(text2);
    }

    /**
     * Calculates factorial of given <code>value</code>.
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++){
            BigInteger sec = BigInteger.valueOf(i);
            res =  res.multiply(sec);
        }
        return res;
        //return  value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial (value-1));
    }

    /**
     * Merges two given sorted arrays into one
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int [a1.length + a2.length];
        int j = 0;
        int k = 0;
        boolean a1NotEnd = true;
        boolean a2NotEnd = true;
        for (int i = 0; i < a1.length + a2.length; ++i){
            if (a1[j] <= a2[k] && a1NotEnd || !a2NotEnd){
                res[i] = a1[j];
                if (j < a1.length - 1){
                    j++;
                } else {
                    a1NotEnd = false;
                }
            } else if (a2NotEnd){
                res[i] = a2[k];
                if (k < a2.length - 1){
                    k++;
                } else {
                    a2NotEnd = false;
                }
            }
        }
//        for (int a : res){
//            System.out.println(a);
//        }
        return res;
        // best one
//        while (i < a1.length && j < a2.length)
//            res[i + j] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
//        while (i < a1.length)
//            res[i + j] = a1[i++];
//        while (j < a2.length)
//            res[i + j] = a2[j++];
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder("");
        for (String r : roles){
            res.append(r + ":\n");
            for (int i = 1; i <= textLines.length; ++i){
                if (textLines[i-1].startsWith(r + ":")){
                    String substr1 = textLines[i-1].substring(r.length() + 2);
                    res.append(i + ") " + substr1 + "\n");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }

}
