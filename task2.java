
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        input.close();
    }
}
