import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum1();
        System.out.println(ans);
    }
    static int sum1() {
        //Q: take input of 2 numbers and print the sum
        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter number 1 :");
            int num1 = in.nextInt();
            System.out.println("Enter number 2 :");
            int num2 = in.nextInt();

            int sum = num1 + num2;
            return sum;
        }
    }
}
    /*  
    Methods are to access the function through modifiers.
    access modifier(we ll look in OOPs) return_type, name(), parameters, return statement;
    
    return_type name(){
    // body of the function
    return statement;
    }
    */

