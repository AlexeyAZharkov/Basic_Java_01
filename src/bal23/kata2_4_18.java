package bal23;

public class kata2_4_18 {

    public static void main(String[] args) throws Exception {
//        System.out.println(priceCalculation(2.3, 5));
//        System.out.println(drawisMonitorsCounter(9, 4));
//        System.out.println(factorial(2));
//        System.out.println(determineGroup(16));
//        mergeArrays(new int[]{1, 2, 4, 6}, new int[]{1, 3, 5, 7, 8} );
    }
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder("");
        for (String role : roles){
            result.append(role).append(":\n");
            for (int i = 1; i <= textLines.length; ++i) {
                if (textLines[i-1].startsWith(role + ":")) {
                    String textRole = textLines[i-1].substring(role.length() + 2);
                    result.append(i).append(") ").append(textRole).append("\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}