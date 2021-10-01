public class SwapNumbers {

    public static void main(String[] args) {
        swapNumbers(5, 9);
    }

    public static void swapNumbers(int x, int y) {
        System.out.println("Before swap: x=" + x + ", y=" + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap: x=" + x + ", y=" + y);
    }
}
