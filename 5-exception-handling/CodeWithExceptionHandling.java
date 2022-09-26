public class CodeWithExceptionHandling {
    public static void main(String[] args) {
        String nullptr = null;
        String str = null;
        try {
            str = new String(nullptr);
        } catch (Exception e) {
            System.out.println("An exception has been caught!");
            e.printStackTrace();
        }
        System.out.println(str);
    }
}
