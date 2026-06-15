package may26_26;

public class PrimeNum2 {

    public static boolean isPrime2ndtWay(int n) {
        if (n < 2) {
            System.out.println("Not a prime number");
            return;
        }
        for (int i = 2; i <= n/2;i++){
            System.out.println("Not a prime number");
            return;
        }
        System.out.println("Is a prime number");
    }
   public static void main(String[] args) {
        int num = 15;
        isPrime2ndtWay(num);
    }
}