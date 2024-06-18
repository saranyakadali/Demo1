public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int c = add (5, 6);
        System.out.println("c value is: " + c);
        int d = subtract(10, 4);
        System.out.println("d value is: " + d);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a -b;
    }
}