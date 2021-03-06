package bal23;

public class kata2_4_17 {

    public static void main(String[] args) throws Exception {
        mergeArrays(new int[]{1, 2, 4, 6}, new int[]{1, 3, 5, 7, 8} );
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int [a1.length + a2.length];
        int i = 0; int j = 0;

        while (i < a1.length & j < a2.length) {
            result[i + j] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
        }
        while (i < a1.length) {
            result[i + j] = a1[i++];
        }
        while (j < a2.length) {
            result[i + j] = a2[j++];
        }
        return result;
    }
}