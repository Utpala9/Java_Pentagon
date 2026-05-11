package may11_26;

public class problem {

    public static void main( String arg[]){
        int a = 20 ;
        int b = 15;
        int c = 10;
        a = a++ - --b + --c - --a ;
        b = --b - --a + ++c + --c;
        c = a++ - --b + --c - --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
   
}
