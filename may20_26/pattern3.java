 

public class pattern3{

    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        char ch = 'A';

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i==j){
                    System.out.print(ch + "  ");
                    ch++;
                    num++;
                }                       
                } else {
                    System.out.print(num=" ");     
                    num++;
                }
            }
            System.out.println();
        }
    }
}