import java.util.Scanner;

public class Switch_case{
    public static void main(String[] args){
        try(Scanner in = new Scanner (System.in)){
            String fruit = in.next();

            switch (fruit){
                case "Mango" -> System.out.println("King of fruits.....!!!");
                case "Apple" -> System.out.println("A sweet red fruit....!!!");
                case "Orange" -> System.out.println("Round fruit.....!!!");
                case "Grapes" -> System.out.println("Small fruit...!!!");
                default -> System.out.println("Please enter a valid fruit!!!!");
            }
            in.close();
        }
    }
}

// Alternative way 
/* 

// days

switch(day){
case 1,2,3,4,5 -> System.out.println("Weekday");
case 6,7 -> System.out.println("Weekend");
}

//fruits

switch (fruit){
                case "Mango":
                    System.out.println("King of fruits.....!!!");
                    break;
                case "Apple":
                    System.out.println("A sweet red fruit....!!!");
                    break;
                case "Orange":
                    System.out.println("Round fruit.....!!!");
                    break;
                case "Grapes":
                    System.out.println("Small fruit...!!!");
                    break;
                default:
                    System.out.println("Please enter a valid fruit!!!!");
            }
*/