public class number {
    public static void main(String[] args) {

            String s1 ="abcdefab";
        for (int p = 0; p < s1.length(); p++) {
            for (int q = p + 1; q < s1.length(); q++) {
                if (s1.charAt(p) == s1.charAt(q)) {
                    System.out.println(false);
                    break;
                }

            }
        }
    }
}



