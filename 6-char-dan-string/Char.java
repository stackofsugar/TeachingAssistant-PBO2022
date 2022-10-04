public class Char {
    public static void main(String[] args) {
        char char1 = 'A';
        System.out.println(char1);

        System.out.println("(char)100: " + (char) 100);
        System.out.println("(char)81: " + (char) 81);

        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i);
        }
        System.out.println();
        System.out.println((char) '\'');
    }
}
