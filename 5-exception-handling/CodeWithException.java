public class CodeWithException {
    public static void main(String[] args) {
        String nullptr = null;
        String str = new String(nullptr);
        System.out.println(str);

        // Exception in thread "main"
        // java.lang.NullPointerException
    }
}
