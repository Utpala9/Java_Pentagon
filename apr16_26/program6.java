public class program6{
       public static void mul(int a, int b){
              System.out.println(a*b);   
      }
       public static void mul(int a, int b, int c){
               System.out.println(a*b*c); 
      }
       public static void mul(int a, int b , int c , int d){
               System.out.println(a*b*c*d); 
      }
        public static void mul(int a, int b, int c , int d, int e){
               System.out.println(a*b*c*d*e); 
      }
       public static void mul(int a, int b , int c , int d , int e , int f){
               System.out.println(a*b*c*d*e*f); 
      }

         public static void main(String[] args){
             mul(10,20);
             mul(10,20,30);
             mul(10,20,30,40);
             mul(10,20,30,40,50);
             mul(10,20,30,40,50,60);
     }



}