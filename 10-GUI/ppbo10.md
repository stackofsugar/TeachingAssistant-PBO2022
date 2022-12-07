# PPBO - 9

> (Materi ke-9) - Graphical User Interface (GUI)

# GUI

## Definisi

GUI atau Graphical User Interface merupakan antarmuka dari sebuah aplikasi/program yang memberikan pengalaman secara visual ke pengguna. Pada praktikum-praktikum sebelumnya, kita hanya menggunakan CLI (Command Line Interface) yang terkadang sulit dipahami untuk sebagian besar orang. Sekarang, kita akan mencoba untuk membuat sebuah program Java menggunakan GUI.

## Java Swing Framework

Dalam praktikum kali ini, kita akan menggunakan framework Java Swing, yang merupakan salah satu library standar Java. Jadi, kalian tidak perlu menginstall modul untuk melanjutkan.

> Dalam praktikum ini tidak akan dicantumkan foto contoh window GUI yang dibuat. Oleh karena itu, kalian harus mencoba semua praktik yang dicontohkan oleh asisten.

### Container Class

Swing menggunakan konsep container class. Container class adalah class yang dapat memiliki komponen lain didalamnya. Untuk membuat sebuah GUI Java, kita harus memiliki paling tidak satu container. Ada 3 tipe container Swing:

-   **Panel** merupakan container murni dan tidak merupakan sebuah window. Fungsi dari sebuah **panel** adalah menyusun komponen sebuah window.
-   **Frame** adalah sebuah window yang fungsional dengan judul dan iconnya.
-   **Dialog** merupakan sebuah window "pop-up" yang dapat dipanggil ketika ada pesan yang harus dikirimkan. Window ini bukan merupakan sebuah window yang fungsional.

### Membuat Sebuah Window

```java
import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
```

Potongan kode di atas merupakan cara untuk membuat sebuah window yang kosong pada Java. Pertama, kita mendefinisikan sebuah frame dengan class `JFrame` seperti di atas. Kita dapat menuliskan judul dari frame yang kita buat. Selanjutnya, dengan `Jframe::setDefaultCloseOperation()` kita dapat menentukan operasi yang dilakukan ketika user ingin keluar dari window kita. Terakhir, kita dapat mengatur ukuran dari window kita, dan terakhir membuat window kita terlihat oleh user.

### Menambah Sebuah Button pada Window

Setelah bisa membuat sebuah window, kini kita akan mencoba menambahkan sebuah button pada window kita. Perhatikan potongan kode di bawah.

```java
import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        /* Baru! */ JButton button = new JButton("Press");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Baru! */ frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
```

Potongan kode di atas menghasilkan sebuah window Java dengan sebuah button di tengah-tengah window.

### Java Layout Manager

Java layout manager merupakan sebuah library yang digunakan untuk mengatur layout pada window Java yang dibuat baik menggunakan Java Swing maupun AWT. Ada banyak jenis Java Layout Manager yang dapat dilihat [di sini](https://www.javatpoint.com/java-layout-manager). Namun pada praktikum kali ini, kita akan membuat window sederhana dengan layout yang sederhana pula, menggunakan `BorderLayout`. Perhatikan contoh kode di bawah ini.

```java
import javax.swing.*;
import java.awt.*;

public class LayoutGui {
    public static void main(String[] args) {
        // Definisi standar window
        JFrame frame = new JFrame("My Layout App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        // Mengatur panel bagian bawah
        JPanel bottomPanel = new JPanel();
        JButton helloButton = new JButton("Hello");
        JButton worldButton = new JButton("World");
        bottomPanel.add(helloButton);
        bottomPanel.add(worldButton);

        // Mengatur panel bagian atas
        JPanel topPanel = new JPanel();
        JTextField textField = new JTextField(15);
        JLabel label = new JLabel("Tulis disini");
        topPanel.add(label);
        topPanel.add(textField);

        // Menambahkan panel yang dibuat dan mengaktifkan window
        frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        frame.setVisible(true);
    }
}
```

Pada potongan kode di atas, dibuat sebuah window dengan dua button di bawah, dan sebuah text field dan label di atas. Seperti yang sudah dijelaskan sebelumnya, semua komponen (label, textfield, dan button) akan di-wrap menggunakan panel, untuk kemudian layoutnya di atur sebagai satu kesatuan dalam panel tersebut.

## Tugas

Untuk menguji kemampuan kalian dalam GUI Java, silakan membuat sebuah aplikasi GUI Java yang menirukan sebuah chatroom (misal chatroom WhatsApp). GUI yang kalian buat harus **merupakan buatan kalian sendiri**. Tidak diperkenankan untuk meniru pekerjaan teman kalian, dan kesamaan **persis** dengan pekerjaan temannya akan dikenakan **potongan nilai**. Silakan buat menggunakan imajinasi, kreatifitas, dan modifikasi kalian.

Kalian dapat mengumpulkan pekerjaan kalian [di sini](https://docs.google.com/forms/d/e/1FAIpQLSd1cd56H2WrZNpR63sl8CfXkjVLGvy7h1bmwlGfXHn-90ifUA/viewform?usp=sf_link).
