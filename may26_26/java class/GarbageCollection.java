public class GarbageCollection {

    public void finalize() {
        System.out.println(this + " object is deleted by Garbage Collector");
    }

    public static void main(String[] args) throws Throwable {
        
        GarbageCollection d = new GarbageCollection();
        System.out.println(d);
        d = null;

        new GarbageCollection();

        GarbageCollection d2 = new GarbageCollection();
        d2 = null;

        for (int i = 0; i < 5; i++) {
            Thread.sleep(3000);
            System.gc();
        }  // ← loop band
    }      // ← main band
}          // ← class band