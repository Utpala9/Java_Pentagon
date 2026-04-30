public class program3{
       public static void demo(){
              System.out.println("Demo method without parameter/argument executed");   
      }
       public static void demo(int i){
               System.out.println("Demo int method with 1 argument executed "); 
      }
       public static void demo(char c){
               System.out.println("Demo char method with 1 argument executed"); 
      }

       public static void main(String[] args){
              demo();
              demo(10);
              demo(10.5);
      }

}

// shows error bcz 10.5 is not int not char , in terms to make this code work we need to add double 