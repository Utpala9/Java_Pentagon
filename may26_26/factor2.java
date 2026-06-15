package may26_26;

public class factor2 {
    public static void factor(int num){
        int count = 0;
        for (int i = 1; i<+num;i++){
            if (num%i==0)
               count++;
        }
        System.out.println(count);
        }
        public static void main(String[] args){
            int num = 10;
            factor(10); // factor(num);
        }
    }
}
