public class pattern2 {

    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        char ch = 'A';

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j % 2 != 0) {
                    System.out.print(ch + "  ");
                    ch++;                        // only increment here
                } else {
                    System.out.print("   ");     // just print spaces
                }
            }
            System.out.println();
        }
    }
}