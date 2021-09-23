import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Finding the roots of a cubic equation => ax^3 + bx^2 + cx + d  =0
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int x = 1; x < 1000; x++) {
            if ((a * x * x * x) + (b * x * x) + (c * x) + d == 0) {
                System.out.println(x);
            }
        }
    }
}
