import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        long last = scanner.nextLong();
        long result = 1;

        for (long i = first; i < last; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}