public class pattern3 {
    public static void main(String[] args) {
        
        space =9;
    

        for (int i =1; i <= row; i++){
            char ch ='A';
            System.out.print(ch);
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
        }

        

        for (int k =1 ; k < space; k++){

             System.out.println(" ");

        }

        ch--;
        for( int l=1; l<= i; l++){
            if (l!= 5)
                System.out.println(ch);
            ch--;

        }
        space - = 2;
        System.out.println();    
    }

}