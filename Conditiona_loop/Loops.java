import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        syntax of for loop:
        for(initialization; condition; increment/decrement){
            //body
        }
        */
        // print number from1 to 5
        for (int num =1; num <=10; num+=2){
           System.out.println(num);
       }

        //print number from 1 to n
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();

      for(int num = 1; num <=n;num++){
            System.out.print(num + " ");

          in.close();
       }

        //while loops
        /*
        Syntax:
        while(condition){
            //body
        }
         */

        int num =1 ;
        while (num <= 5){
            System.out.println(num);
            num +=1;
        }

        // do while loop
        /* 
        do{
            //body
        }while(condition);
         */
        
        int num1 =1 ;
        do{
            System.out.println(num1);
            num1++;
        }while (num1 <= 5);
    }
}