
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int p = input.nextInt(); // Laptop price
        // Current savings
        int s = input.nextInt();
        int m = input.nextInt(); // Weekly savings

        int k = 0;

        while (s < p) {
            s = s + m;
            k++;
        }

        System.out.println("k = " + k);

        input.close();
    }
}
