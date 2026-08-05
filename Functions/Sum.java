import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

     static void sum() {
        //Q: take input of 2 numbers and print the sum
        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter number 1 :");
            int num1 = in.nextInt();
            System.out.println("Enter number 2 :");
            int num2 = in.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum = " + sum);
            in.close();
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

