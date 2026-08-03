import java.util.Scanner;

public class Largest {
    public static void main (String[] args){

       try(Scanner in =new Scanner(System.in)){

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // alternative way to find largest number
//       int max = Math.max(c, Math.max(a,b));
//        System.out.println(max);

        //find largest number of the 3 numbers
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max=c;
        }
        System.out.println(max);
        
    in.close();
    }       
    }
}