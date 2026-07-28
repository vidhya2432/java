public class Main {
    public static void main(String[] args) {
        /*
        syntax of if statement:
        if(boolean expression true or false){
        //body
        }else{
            //do this
        }
        */
       int salary =25400;
       if(salary > 10000){
        salary = salary +2000;
       }
       else{
        salary = salary +1000;
       }

       System.out.println(salary);
    
       // multi if else statement

       if(salary > 10000){
        salary = salary +2000;
       }else if(salary < 10000){
        salary = salary +500;
       }
       else{
        salary = salary +1000;
       }

       System.out.println(salary);
    }
}
