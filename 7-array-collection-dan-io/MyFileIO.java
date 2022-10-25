import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class MyFileIO {
    public static void main(String[] args) {
        File file = new File("out/file.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.println("Hello World!");
            printWriter.close();
        } catch (Exception e) {
            System.out.println("Terjadi exception:");
            e.printStackTrace();
        }
    }
}
