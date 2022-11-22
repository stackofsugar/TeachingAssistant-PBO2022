# PPBO - 9

> (Materi ke-9) - Thread

## Thread

### Definisi

Thread adalah sebuah "unit kerja" dalam sebuah sistem komputer. Thread bertugas untuk mengeksekusi baris-baris kode yang diberikan paralel dengan thread lainnya, yang berarti jika kita membuat 2 thread untuk mengerjakan 2 pekerjaan yang berbeda, kedua thread dapat mulai berjalan bersama-sama, tanpa harus menunggu yang satu selesai.

Setiap kali kalian membuat program Java, paling tidak kalian telah membuat sebuah thread, yaitu main thread. Main thread adalah thread yang dibuat untuk mengeksekusi metode `main` dari program kalian, dan secara otomatis dibuat oleh compiler tanpa harus kalian buat secara manual.

Namun, jika kalian ingin membuat lebih banyak thread, misalkan, untuk mengerjakan banyak pekerjaan secara paralel, kalian dapat membuat thread kalian sendiri.

### Mendefinisikan dan Menjalankan Thread

Kalian dapat mendefinisikan thread kalian dalam 2 cara. Asisten akan menggunakan salah satu cara, yaitu dengan membuat sebuah class yang extends class `Thread` dari Java. Pertama, definisikanlah class tersebut seperti di bawah ini.

```java
class MyThread extends Thread {
    public void run() {
        // Definisikan pekerjaan Thread kalian disini
    }
}
```

Setelah itu, kalian dapat menjalankan thread yang kalian buat lewat fungsi `main`. Kalian dapat meng-invoke metode `start` untuk menjalankan pekerjaan thread tersebut, dan `join`, untuk menunggu thread tersebut menyelesaikan pekerjaannya.

```java
public class Threading {
    public static void main(String[] args) {
        MyThread thread_obj = new MyThread();
        thread_obj.start();
        thread_obj.join();
    }
}
```

### Belajar Mandiri

Dalam folder ini, terdapat source code `Threading.java`. Source code tersebut adalah implementasi multithreading untuk menghitung angka Fibonacci dari sebuah range yang diberikan.

Program akan membandingkan perhitungan semua angka Fibonacci dari 0 hingga 350000 dengan satu thread dan dengan 5 thread. Kelima thread tersebut akan membagi range bilangan Fibonacci tersebut, dan membandingkan waktu yang digunakan untuk menyelesaikan hitungan bilangan Fibonacci 0 - 350000 tersebut. Silakan kalian mempelajari source code tersebut dengan mencoba menjalankannya.

### Tugas

Tugas yang harus kalian kerjakan merupakan pendalaman akan materi thread, yang bertujuan untuk memperdalam pemahaman kalian mengenai thread.

Silakan kalian mengisi hasil belajar mandiri kalian [di sini](https://docs.google.com/forms/d/e/1FAIpQLSfA6v2-q6zl2piRU9SgDaBx7NGP6Wh2Q9_fOsIhe3lDcgM0dw/viewform). Setelah itu, silakan buat implementasi threading sesuai dengan kemampuan kalian sendiri. Kalian **tidak diperkenankan** menggunakan cara yang sama persis dengan contoh pada `Threading.java`. Kalian harus menggunakan kreatifitas kalian sendiri. Kalian dibebaskan untuk membuat fungsi apapun yang harus dijalankan oleh thread tersebut, namun pastikan perbandingan 5 thread vs 1 thread dapat terlihat. Lalu, kalian kumpulkan **satu** file source code dengan judul `Thread-NamaKalian.java` pada form di atas.
