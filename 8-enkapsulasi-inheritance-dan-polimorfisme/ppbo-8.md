# PPBO - 9

> (Materi ke-8)
>
> Enkapsulasi, inheritance, dan polimorfisme

## Enkapsulasi

### Definisi

Enkapsulasi, yang diambil dari bahasa Inggris "encapsulation", berasal dari kata dasar "capsule" yang dapat diartikan sebagai suatu hal yang melindungi hal lain yang ada didalamnya. Konsep enkapsulasi pada bahasa pemrograman berbasis objek merupakan sebuah konsep dimana kita sebagai programmer menyembunyikan data-data sensitif dari class yang kita buat dari pengguna.

Untuk dapat melakukan hal tersebut, kita dapat melakukan 2 langkah berikut. Pertama, kita **mendeklarasikan atribut sebagai variabel private** dan **membuat metode getter dan setter publik** untuk memperbolehkan akses view dan edit atribut private tersebut.

### Mengapa Enkapsulasi Penting?

Enkapsulasi pada bahasa pemrograman berorientasi objek penting karena beberapa hal.

-   Dapat mengontrol atribut dan metode kelas dengan baik, tidak mudah untuk diubah dengan tidak sengaja
-   Dapat membuat sebuah atribut atau metode kelas `read-only` atau `write-only`
-   Membuat kode lebih modular, dapat mengubah sebuah bagian kode tanpa mengubah bagian lainnya

### Contoh Kelas Ter-enkapsulasi

```java
public class Person {
    private String full_name;
}
```

Pada contoh di atas, dapat dilihat bahwa kelas `Person` memiliki sebuah atribut bertipe `String` bernama `full_name` yang sifatnya `private`. Dengan access modifier private yang kita berikan, kita membuat variabel `full_name` sebuah variabel yang _encapsulated_.

Namun dengan implementasi di atas, pengguna sama sekali tidak bisa menggunakan variabel `full_name`, lalu apa guna variabel tersebut? Lihat contoh di bawah, di mana kita langsung mengakses variabel `full_name` di atas.

```java
public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.full_name);
    }
}

class Person {
    private String full_name;
}
```

```
<< Output >>
error: full_name has private access in Person
        System.out.println(person.full_name);
                                 ^
1 error
```

Dapat dilihat bahwa Java memberikan error yang menjelaskan bahwa atribut `full_name` pada kelas `Person` memiliki akses private yang tidak bisa diakses dari luar kelas tersebut. Oleh karena itu, konsep enkapsulasi memperkenalkan metode **getter** dan **setter**.

### Getter dan Setter

Getter dan setter merupakan dua buah metode konsep yang memberikan akses terbatas untuk mengakses dan memodifikasi atribut kelas yang aksesnya private. Sesuai dengan namanya, metode getter merupakan metode untuk mengakses sebuah atribut private, sedangkan setter untuk memodifikasinya.

Perhatikan sebuah contoh kelas ter-enkapsulasi di bawah ini.

```java
public class Person {
    private String full_name;

    public String getname() {
        return full_name;
    }
    public void setname(String full_name) {
        this.full_name = full_name;
    }
}
```

Dengan konsep di atas, kita bisa mengakses metode `getname()` untuk mengakses variabel `full_name` yang bersifat private dan `setname()` untuk mengubah nilai dari variabel `full_name`

## Inheritance

Dalam banyak bahasa pemrograman berorientasi objek, spesifiknya Java, terdapat sebuah konsep bernama inheritance, yang dapat diterjemahkan ke dalam Bahasa Indonesia sebagai penurunan sifat.

Dalam Java, kita dapat menurunkan "sifat" sebuah fungsi ke fungsi yang lainnya, sehingga fungsi yang diturunkan akan mendapatkan atribut dan metode dari fungsi yang menurunkan sifatnya. Kedua fungsi ini berturut-turut disebut subclass and superclass.

Inheritance merupakan konsep yang sangat penting dalam bahasa pemrograman berorientasi objek karena dapat digunakan untuk mengurangi pengulangan dalam kode kita, di mana kita dapat membuat sebuah kelas utama jika kita harus membuat banyak kelas dengan atribut atau metode yang mirip.

Perhatikan contoh inheritance di bawah ini

```java
class Parent {
    private String name = "Someone";
    private String address = "Somewhere";

    public String introduce() {
        return name + " from " + address;
    }
}

class Child extends Parent {
    public void play() {
        System.out.println("Yay!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.introduce());
        System.out.println(child.introduce());
        child.play();
    }
}
```

```
<< Output >>
Someone from Somewhere
Someone from Somewhere
Yay!
```

Berdasarkan contoh di atas, kelas `Parent` mewariskan semua atribut dan metodenya ke kelas `Child`. Kasus seperti ini sangat berguna ketika kita memerlukan banyak kelas yang harus dibuat, yang memiliki banyak kesamaan atribut atau metode.

Misalkan pada pembuatan game, kita mungkin perlu membuat beberapa kelas seperti `Enemy`, `Player`, `Monster`, `PowerUp`, dan lainnya, disaat mereka memiliki banyak metode yang sama seperti `render()`. Developer yang cermat pasti akan membuat sebuah superclass yang dapat dinamai `Creature`, dan menurunkan atribut serta metodenya untuk kelas-kelas lainnya.

## Polimorfisme

Polimorfisme, yang dapat diterjemahkan menjadi "memiliki banyak wujud", merupakan sifat pada banyak bahasa pemrograman berbasis objek, salah satunya Java. Konsep/sifat ini dapat kita lihat di saat sebuah kelas melakukan pewarisan ke kelas lain, metode atau atribut yang diwariskan dapat memiliki bentuk/wujud yang berbeda-beda.

Sebagai contoh, perhatikan kelas di bawah ini.

```java
class Parent {
    static public String myVariable = "Hello";
}

class Child extends Parent {
    static public int myVariable = 20;
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(Parent.myVariable);
        System.out.println(Child.myVariable);
    }
}
```

```
<< Output >>
Hello
20
```

Pada contoh di atas, kelas `Parent` menurunkan variabel `myVariable`nya ke kelas `Child`. Namun, pada kelas `Child` kita membuat implementasi `myVariable` yang berbeda dengan implementasi pada superclassnya. Oleh karena itu, jika kita memanggil variabel tersebut dari kedua kelas yang berbeda, kita akan mendapatkan hasil yang berbeda pula.

Sifat bahasa pemrograman berbasis objek ini dapat menjadi sangat berguna ketika kita dihadapkan dengan kasus di mana sebuah metode dapat memiliki banyak kegunaan, tergantung dari bagaimana metode itu dipanggil.
