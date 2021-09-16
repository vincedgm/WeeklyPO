public class DecimalToOctal {

    public static void main(String[] args) {
        int x = 81;
        System.out.println(toOctalString(x));
    }

    public static String toOctalString(int decimal) {
        return Integer.toOctalString(decimal);
    }
}
