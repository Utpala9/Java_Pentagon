public class Assignment4 {

    public static int OddOrEven(int a) {
        if (a % 2 == 0) {
            System.out.print("True ");
            return a;
        } else {
            System.out.print("False");
            return a;
        }
    }  // method band hua!

    public static void main(String[] args) {
        int result = OddOrEven(7);
        System.out.println(result);
    }
}  // class band hui!