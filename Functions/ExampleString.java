import java.util.Scanner;

public class ExampleString {
    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter your name :");
            String name =in.next();
            String greeting = myGreet(name);
            System.out.println(greeting);
        }
    }

    static String myGreet(String name) {
        String greet = "Hello " + name;
        return greet;
    }

}
