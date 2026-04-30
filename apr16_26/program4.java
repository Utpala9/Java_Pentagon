public class program4{
       public static void add(int a, int b){
              System.out.println(a+b);   
      }
       public static void add(int a, int b, int c){
               System.out.println(a+b+c); 
      }
       public static void add(int a, int b , int c , int d){
               System.out.println(a+b+c+d); 
      }
        public static void add(int a, int b, int c , int d, int e){
               System.out.println(a+b+c+d+e); 
      }
       public static void add(int a, int b , int c , int d , int e , int f){
               System.out.println(a+b+c+d+e+f); 
      }
    

      public static void main(String[] args){
             add(10,20);
             add(10,20,30);
             add(10,20,30,40);
             add(10,20,30,40,50);
             add(10,20,30,40,50,60);
     }


}