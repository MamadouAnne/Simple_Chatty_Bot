import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= length; i++) {
            int input = scanner.nextInt();
            if (input % 6 == 0) {
                sum += input;
            }
        }
        System.out.println(sum);
    }
}