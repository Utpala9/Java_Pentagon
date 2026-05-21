public class star {
    static int row = 5;
    static int col = 5;

    public static void pattern1() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i + j == 6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == j || i + j == 6)  // Missing closing parenthesis fixed
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5 || i == j || i + j == 6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Pattern 1 - Diagonal:");
        pattern1();

        System.out.println("\nPattern 2 - Anti-Diagonal:");
        pattern2();

        System.out.println("\nPattern 3 - X Shape:");
        pattern3();

        System.out.println("\nPattern 4 - Box with X:");
        pattern4();
    }
}