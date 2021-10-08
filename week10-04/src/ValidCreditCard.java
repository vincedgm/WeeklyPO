public class ValidCreditCard {

    public static void main(String[] args) {
        System.out.println(checkCreditCard("1234567890123456")); //false
        System.out.println(checkCreditCard("1234567890123452")); //true
    }

    public static boolean checkCreditCard(String cc) {
        if (cc.length() > 19 || cc.length() < 14) return false;

        int check = Integer.parseInt(cc.substring(cc.length()-1));
        boolean alternate = true;
        int sum = 0;
        for (int i = cc.length()-2; i >= 0; i--) {
            int n = Integer.parseInt(cc.substring(i, i+1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }

        return ((10 - (sum % 10)) == check);
    }
}
