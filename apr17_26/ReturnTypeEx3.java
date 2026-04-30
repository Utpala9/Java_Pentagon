public class ReturnTypeEx3{
       public static int demo(){
              System.out.println("Demo method executed");
              return 10;  
              System.out.println("Demo method executed");//error(Return should always be                  the                          last statement, therefore compile time error)
 
       }
       public static void main(String[] args){
              System.out.println("Main Starts");
              demo();
              System.out.println("Main Ends");

       }
}