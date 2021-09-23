import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int num1 = num / 1000; //first number
        int num2 = num % 1000 / 100; //second number
        int num3 = num % 100 / 10; //third number
        int num4 = num % 10; //fourth number

        if (num1 == num4 && num2 == num3) {
            System.out.print(1);
        } else {
            System.out.print(2);
        }
    }
}