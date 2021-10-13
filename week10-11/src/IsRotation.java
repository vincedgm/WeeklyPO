public class IsRotation {

    public static void main(String[] args) {
        System.out.println(isRotation("ABCD", "CDAB")); //true
        System.out.println(isRotation("ABAD", "ADAB")); //true
        System.out.println(isRotation("ABCD", "ACBD")); //false
    }

    public static boolean isRotation(String s1, String s2) {
        return ((s1.length() == s2.length()) && ((s1 + s1).contains(s2)));
    }
}
