import java.util.Scanner;
public class Ex1_1_Lab2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n < 0 || n > 15) {
                System.out.println("Введено  неправильное число!");
            }
            else {
                int result = 1;
                int count = 1;
                while (count <= n) {
                    result *= count;
                    count++;
                }
                System.out.println("Factorial is " + result);
            }
        }
        else {
            System.out.println("Введено не число!");
        }
    }
}
