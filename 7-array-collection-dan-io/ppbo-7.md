# PPBO - 7

> Array, Collection, dan File I/O

## 1. Array dan Collection

### Definisi

Array adalah sebuah tipe data yang dapat terdiri dari sejumlah elemen. Elemen-elemen yang dapat diisi ke dalam array dapat berupa `int`, `String`, `float`, dan tipe-tipe data lainnya, termasuk

### Mendefinisikan sebuah array

#### Cara 1

```java
String[] students = new String[3];

students[0] = "James";
students[1] = "Bambang";
students[2] = "Monica";
```

> Mendeklarasikan `array`, lalu mendefinisikan isinya satu-persatu

#### Cara 2

```java
String[] other_students = {
    "Joko", "Charles", "Elizabeth"
};
```

> Secara langsung mendefinisikan isi array ketika dideklarasikan

### Mengakses sebuah array

#### Menggunakan indeks

```java
System.out.println(students[2]);
System.out.println(other_students[1]);
```

#### Menggunakan looping dan indeks

Ada banyak jenis looping yang dapat kalian lakukan menggunakan Java untuk mengakses array. Intinya simpel, kalian meng-iterate sebuah variabel dari 0 (atau dari titik awal yang kalian inginkan) hingga satu kurangnya dari kapasitas array kalian.

```java
for (int i = 0; i < students.length; i++) {
    System.out.println(students[i]);
}

for (String student : students) {
    System.out.println(student);
}

int i = 0;
while (i < students.length) {
    System.out.println(students[i]);
    i++;
}
```

### Array of objects

Seperti yang sudah dijelaskan sebelumnya, elemen-elemen dalam array tidak hanya dapat diisi menggunakan tipe data primitif saja, namun juga bisa diisi dengan objek dari kelas yang didefinisikan sebelumnya.

#### Deklarasi class

```java
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getInfo() {
        return "I am " + name + " aged " + String.valueOf(age);
    }
}
```

#### Penggunaan

```java
Person[] people = new Person[3];

people[0] = new Person("Jessica", 21);
people[1] = new Person("Amanda", 19);
people[2] = new Person("Jack", 26);

for (Person person : people) {
    System.out.println(person.getInfo());
}
```

## 2. File I/O

### Definisi

File I/O merupakan sebuah metode yang dapat kita gunakan untuk menyimpan teks ke dalam sebuah file. Teks yang ingin kita simpan ke dalam sebuah file dapat kita buat di dalam kode Java kita.

### Penggunaan

```java
File file = new File("out/file.txt");

try {
    FileOutputStream fileOutputStream = new FileOutputStream(file);
    PrintWriter printWriter = new PrintWriter(fileOutputStream);
    printWriter.println("Hello World!");
    printWriter.close();
} catch (Exception e) {
    System.out.println("Terjadi exception:");
    e.printStackTrace();
```

### Praktek mandiri: Membuat wrapper class

Sebagai praktek mandiri untuk penguasaan materi, silakan membuat sebuah wrapper class File I/O supaya kalian dapat mencetak tulisan ke sebuah file dengan lebih mudah.

Class yang kalian buat dapat dinamai `FileWrapper` dan dapat memiliki method seperti `tulisKalimat(String kalimat)` untuk menulis `kalimat` di berkas. Path berkas dapat kalian definisikan di constructor kelas `FileWrapper`
