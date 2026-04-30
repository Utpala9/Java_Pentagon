public class program5{
       public static void sub(int a, int b){
              System.out.println(a-b);   
      }
       public static void sub(int a, int b, int c){
               System.out.println(a-b-c); 
      }
       public static void sub(int a, int b , int c , int d){
               System.out.println(a-b-c-d); 
      }
        public static void sub(int a, int b, int c , int d, int e){
               System.out.println(a-b-c-d-e); 
      }
       public static void sub(int a, int b , int c , int d , int e , int f){
               System.out.println(a-b-c-d-e-f); 
      }

        public static void main(String[] args){
             sub(10,20);
             sub(10,20,30);
             sub(10,20,30,40);
             sub(10,20,30,40,50);
             sub(10,20,30,40,50,60);
     }



}