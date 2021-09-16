public class ROT13 {

    public static void main(String[] args) {
        String msg = "I am here";
        System.out.println(rot13(msg));
    }

    public static String rot13(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (!Character.isLetter(c)) {
                sb.append(c);
                continue;
            }

            if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')){
                c += 13;
            } else {
                c -= 13;
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
