import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a = 2000;
        int b = 200;

        System.out.println(div(a, b));
        System.out.println(sub(a, b));
    }

    public static int div(int a, int b) { return a / b; }
    public static int sub(int a, int b) { return a - b; }
}
