package may26_26;

public class PrimeNum {

    public static boolean isPrime1stWay(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int num = 15;
        if (isPrime1stWay(num))
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}