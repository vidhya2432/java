import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int rollNO = in.nextInt();
            String dept = in.next();

            switch(rollNO){
                case 1 -> System.out.println("260");
                case 2 -> System.out.println("215");
                case 3 -> {
                    System.out.println("Roll Number 3");

                    switch(dept){
                        case "AI&DS" -> System.out.println("AI&DS Department");
                        case "IT" -> System.out.println("IT Department");
                        default -> System.out.println("No Department Entered!!!!"); 
                    }
                }

                    
                default -> System.out.println("Invalid Roll Number!!!!");


            }
            in.close();
        }
    }
}
