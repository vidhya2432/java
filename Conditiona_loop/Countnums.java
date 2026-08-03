import java.util.Scanner;

public class Countnums {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int count = 0;

        while(n > 0) {
            int rem =n%10;
            if (rem == 0) { // Count numbers 
                count++;
            }
            n=n/10;
        }

            System.out.println(count);
        }
    }
}

