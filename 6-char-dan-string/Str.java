public class Str {
    public static void main(String[] args) {
        String str = "Indonesia Raya";

        System.out.println("indexOf(Raya): " + str.indexOf("Raya"));
        System.out.println("indexOf(Jaya): " + str.indexOf("Jaya"));
        System.out.println("indexOf(s): " + str.indexOf('s'));
        System.out.println("indexOf(a): " + str.indexOf('a'));

        System.out.println(str.toUpperCase());
    }
}
