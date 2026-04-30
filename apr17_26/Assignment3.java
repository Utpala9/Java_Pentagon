public class Assignment3{
       public static int SmallNum(int a, int b){
              if (a<b){
                 System.out.println("A is the smallest one");
                 return a;//return for single vale there need to mention every time!
             }
              else {
                 System.out.println("B is the smallest one");
                 return b;return for single vale there need to mention every time!

            }  
          
            
        }
       public static void main(String[] args){
              int result = SmallNum(69,96);//storing thr data in int (name= result)
              System.out.println(result);

              
      }
}