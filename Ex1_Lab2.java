import java.util.Scanner;
public class Ex1_Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n < 0 || n > 15) {
                System.out.println("Введено неправильное число!");
            }
            else {
                int result = 1;
                for (int i = n; i > 0; i--) {
                    result *= i;
                }
                System.out.println("Результат " + result);
            }
        }
        else {
                System.out.println("Введено не число!");
            }
    }
}