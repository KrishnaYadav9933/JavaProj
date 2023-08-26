public class compressString {

        public static StringBuilder compress(char[] chars) {
            int n = chars.length;
            StringBuilder s = new StringBuilder();
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (chars[i] != chars[i - 1]) {
                    s.append(chars[i - 1]);
                    if (count > 1) s.append(count);
                    count = 1;
                } else count++;
            }
            if (count > 1) {
                s.append(chars[n - 1]);
                s.append(count);
            } else {
                s.append(chars[n - 1]);
            }
            return s;
        }

    public static void main(String[] args) {
        char [] ch = {'a','a','a','b','c','c','d','e','f'};
        System.out.println(compress(ch));
    }
}
