# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data smartphone menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa informasi detail tentang smartphone, seperti IMEI, nama, asal produksi, tahun produksi, dan seri. Aplikasi ini kemudian menampilkan informasi lengkap tentang smartphone yang telah diinput.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Smartphone`, `Series`, dan `Main` adalah contoh dari class.
   
---



    ```java
    public class Smartphone {
        ...
    }

    public class Series extends Smartphone {
        ...
    }

    public class Main {
        ...
    }
    ```

2. **Object** adalah instance dari class. Pada kode ini, `DaftarSmartphone[i] = new Series(...)` adalah contoh pembuatan object.

    ```java
    DaftarSmartphone[i] = new Series(ImeiSmartphone, NamaSmartphone, AsalProduksi, TahunProduksi, series);
    ```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `ImeiSmartphone`, `NamaSmartphone`, `AsalProduksi`, `TahunProduksi`, dan `series` adalah contoh atribut.

    ```java
    private String ImeiSmartphone;
    private String NamaSmartphone;
    private String AsalProduksi;
    private int TahunProduksi;
    private String series;
    ```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Smartphone` dan `Series`.

    ```java
    public Smartphone(String ImeiSmartphone, String NamaSmartphone, String AsalProduksi, int TahunProduksi) {
        ...
    }

    public Series(String ImeiSmartphone, String NamaSmartphone, String AsalProduksi, int TahunProduksi, String series) {
        ...
    }
    ```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setImeiSmartphone`, `setNamaSmartphone`, `setAsalProduksi`, `setTahunProduksi`, dan `setSeries` adalah contoh method mutator.

    ```java
    public void setImeiSmartphone(String ImeiSmartphone) {
        this.ImeiSmartphone = ImeiSmartphone;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    ```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getImeiSmartphone`, `getNamaSmartphone`, `getAsalProduksi`, `getTahunProduksi`, dan `getSeries` adalah contoh method accessor.

    ```java
    public String getImeiSmartphone() {
        return ImeiSmartphone;
    }

    public String getSeries() {
        return series;
    }
    ```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `ImeiSmartphone`, `NamaSmartphone`, `AsalProduksi`, `TahunProduksi`, dan `series` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

    ```java
    private String ImeiSmartphone;
    private String NamaSmartphone;
    private String AsalProduksi;
    private int TahunProduksi;
    private String series;
    ```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Series` mewarisi `Smartphone` dengan sintaks `extends`.

    ```java
    public class Series extends Smartphone {
        ...
    }
    ```

9. **Overriding** adalah konsep di mana sebuah method pada superclass di-override di subclass untuk memberikan implementasi yang berbeda. Pada kode ini, method `DisplayInfo` di `Smartphone` di-override oleh `DisplayInfoLengkap` di `Series`.

    ```java
    @Override
    public void DisplayInfo() {
        ...
    }

    public void DisplayInfoLengkap() {
        super.DisplayInfo();
        System.out.println("Series: " + series);
    }
    ```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dan `switch` untuk validasi input dan memilih series smartphone.

    ```java
    if (!ImeiSmartphone.matches("\\d+")) {
        throw new NumberFormatException("Kode Imei Harus Berupa Angka.");
    }

    switch (pilihan) {
        case 1:
            series = "14";
            break;
        case 2:
            series = "14 Plus";
            break;
        ...
    }
    ```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

    ```java
    for (int i = 0; i < JumlahSmartphone; i++) {
        ...
    }
    ```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

    ```java
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Nama Smartphone : ");
    String NamaSmartphone = scanner.nextLine();
    ```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Series[] DaftarSmartphone = new Series[JumlahSmartphone];` adalah contoh penggunaan array.

    ```java
    Series[] DaftarSmartphone = new Series[JumlahSmartphone];
    ```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

    ```java
    try {
        // code that might throw an exception
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    ```

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad ihsan  
NPM: 2210010286

---
