public class Main {
    public static void main(String[] args) {
        int a=5;
        int b = 3;
        System.out.println("Hello world!");
        doAll(a,b);
        doAll(10,5);
        doAll(34,12);
    }

    public static void doAll(int a,int b) {
        int c = add(a, b);
        System.out.println("c value is: " + c);
        int d = subtract(a, b);
        System.out.println("d value is: " + d);
        int e = multiply(a, b);
        System.out.println("e value is: " + e);
        double f =division(a,b);
        System.out.println("f value is:" + f);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float division(int a, int b) {
        return (float)a / b;
    }
}