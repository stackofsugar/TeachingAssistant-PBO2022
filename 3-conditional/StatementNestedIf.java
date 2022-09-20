import java.util.Scanner;

public class StatementNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilai = scan.nextInt();
        if (nilai >= 75) {
            if (nilai >= 90) {
                System.out.println("Nilaimu sangat baik!");
            } else if (nilai >= 82) {
                System.out.println("Nilaimu baik!");
            } else {
                System.out.println("Anda Lolos!");
            }
        } else if (nilai >= 65) {
            System.out.println("Kurang sedikit! Tetap semangat");
        } else if (nilai >= 55) {
            System.out.println("Perbanyak belajarmu!");
        } else {
            System.out.println("dahlah");
        }

        scan.close();
    }
}
