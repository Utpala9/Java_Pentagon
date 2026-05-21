public public class pattern4 {

    public static void main (String[] args){
        int row = 5;
        int col = 5;
        int space = 4;
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            space--;
            System.out.println();
        }
    }

}
 {
    
}
