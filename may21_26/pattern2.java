public class pattern2 {
    public static void main(String [] args){
        int row =5;
        int space = 4; 
        for(int i=1;i<=row;i++){
            char ch ='A';
            for(int k = 1; k <= space; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){

                Sytem.out.println(ch);
                ch++;
            }
         }
         space--;
          System.out.println(); 

        }
    
    }
}
