package bal23;

public class kata2_4_18 {

    public static void main(String[] args) throws Exception {

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