package may11_26;

public class problem2 {

    /**
     * @param arg
     */
    public static void main( String arg[]){
        int a = -5 ;
        int b = 36;
        int c = -71;
        a = a++ - --b + --c - --a ;
        b = --b - --a + ++c + --c;
        c = a++ - --b + --c - --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
   
}

