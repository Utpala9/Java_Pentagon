public class program {
    public static void demo(){
        System.out.println("demomethod executed");
    }
    public static void main(String[] args){
        System.out.println("Main start");
        demo();
        program.demo();
        System.out.println("Main end");
    }



    
}
