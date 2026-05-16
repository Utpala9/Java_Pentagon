public class star {
    public static void pattern1(String[] args){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern2(String[] args){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i+j==6)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void pattern3(String[] args){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==j||i+j==6
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
     public static void pattern4(String[] args){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==5||j==1||j==5||i==j||i+j==6)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
