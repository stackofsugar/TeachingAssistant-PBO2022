import java.util.Scanner;

public class StatementIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilai = scan.nextInt();
        if (nilai >= 75) {
            System.out.println("Anda Lolos!");
        } else {
            System.out.println("Anda Tidak Lolos!");
        }

        scan.close();
    }
}
