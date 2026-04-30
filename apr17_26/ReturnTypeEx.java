public class ReturnTypeEx{
       public static void demo(){
              System.out.println("Demo method executed");
              return;//optional    
       }
       public static void main(String[] args){
              System.out.println("Main Starts");
              demo();
              System.out.println("Main Ends");

       }
}