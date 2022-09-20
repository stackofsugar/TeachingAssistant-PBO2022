import java.util.Scanner;

public class StatementIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilai = scan.nextInt();
        if (nilai >= 75) {
            System.out.println("Anda Lolos!");
        }

        scan.close();
    }
}
