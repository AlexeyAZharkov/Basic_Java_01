public class q {

    public static void main(String[] args) throws Exception {
        System.out.println(booleanExpression(false, true, false, true));
        System.out.println(leapYearCount(100));
        System.out.println(doubleExpression(0.1, 0.23, 0.3));
        System.out.println(flipBit(5, 3));
        System.out.println(charExpression(32));
        System.out.println(isPowerOfTwo(64));
        System.out.println(isPalindrome("Madam, I'm Adam!"));
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

}
