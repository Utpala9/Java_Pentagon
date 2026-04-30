public class NonStaticEx {
    public void demo(){
    System.out.println("demo non static method executed");
    }

    public static void main(String[] args){
    NonStaticEx ns = new NonStaticEx();  //STEP-1
    System.out.println("main started");//ms
    ns.demo();//calling
    System.out.println("main ended");//me
    }
}
    