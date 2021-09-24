public class ActualMemorySize {

    public static void main(String[] args) {
        System.out.println(actualMemorySize("32GB"));
        System.out.println(actualMemorySize("2GB"));
        System.out.println(actualMemorySize("512MB"));
    }

    public static String actualMemorySize(String mem) {
        String type = mem.substring(mem.length()-2);

        double amountInMB = Integer.parseInt(mem.substring(0, mem.length()-2));
        if (type.equals("GB")) amountInMB *= 1000;
        amountInMB *= .93;

        if (type.equals("GB") && amountInMB >= 1000) {
            double roundedAmount = Math.round((amountInMB/1000)*100.0)/100.0;
            return roundedAmount + type;
        } else {
            return amountInMB + type;
        }
    }
}
