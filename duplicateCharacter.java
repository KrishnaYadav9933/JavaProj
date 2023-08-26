public class duplicateCharacter {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("aaabbc eefggh iijjkk llmmmmm");
        for (int i = 0; i < sb.length() - 1; i++) {
            int count = 1;
            while (i<sb.length()-1 && sb.charAt(i) == sb.charAt(i + 1)) {
                count++;
                sb.deleteCharAt(i);
            }
            if (count > 1) {
            sb.insert(i+1, count);
            }


        }
        System.out.println(sb);


    }
}
