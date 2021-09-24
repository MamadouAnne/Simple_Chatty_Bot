import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 4 == 0) {
                sum = sum > num ? sum : num;
            }
        }
        System.out.print(sum);
    }
}