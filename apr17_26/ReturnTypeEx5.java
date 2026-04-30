public class ReturnTypeEx5{
       public static int demo(){
              return 60;  
                     }
       public static void main(String[] args){
              //to consume the data returned by the method
              System.out.println(demo());//1st way
              int result = demo();//storing thr data in int (name= result)
              System.out.println(result);//2nd way
       }
}