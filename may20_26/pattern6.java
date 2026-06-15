 

public class pattern6{

    public static void main(String[] args) {
        int row = 5;
        int col = 7;
       char ch ='A';

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                for(i=1; i<=space; i++){
                    System.out.println(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print(k);
                }
            }
            System.out.println();
            space -=2;
        }
    }
}