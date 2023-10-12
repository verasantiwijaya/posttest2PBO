# Nama : Vera Santi Wijaya
# NIM : 2209116007
Kelas : A 2022

## 📌PENJELASAN PROGRAM
### DataKaryawan.java
deklarasi kelas DataKaryawan. Kita menggunakannya sebagai kelas yang berisi data karyawan. Kata kunci final digunakan untuk menunjukkan bahwa kelas ini tidak dapat diwariskan (tidak bisa di-extend).
Di dalam kelas ini, ada dua variabel anggota (member variables), yaitu nama dan jabatan. Ini adalah properti yang digunakan untuk menyimpan informasi tentang karyawan, yaitu nama dan jabatan.
Konstruktor ini menerima dua parameter: nama dan jabatan, dan digunakan untuk menginisialisasi variabel nama dan jabatan dengan nilai yang diberikan saat objek DataKaryawan dibuat.
Metode get yang digunakan untuk mengakses nilai variabel nama. Kata kunci final digunakan di sini untuk menunjukkan bahwa metode ini tidak dapat di-override dalam subkelas.
Metode get yang digunakan untuk mengakses nilai variabel jabatan. Kata kunci final digunakan di sini untuk menunjukkan bahwa metode ini tidak dapat di-override dalam subkelas.

```
package alattulis.kelas;

/**
 *
 * @author HP
 */
public final class DataKaryawan {
    public String nama;
    public String jabatan;

    public DataKaryawan(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }
    
    public final String getNama() {
        return nama;
    }

    public final String getJabatan() {
        return jabatan;
    }  
}
```

### DataBarang.java
kode yang mendefinisikan package (paket) tempat kelas DataBarang berada. Kode ini menempatkan kelas DataBarang dalam package bernama alattulis.kelas.
kelas Java dengan nama DataBarang. Kata kunci final yang ditempatkan di depan kelas berarti bahwa kelas ini tidak dapat diwariskan (inheritance).
variabel anggota (field) kelas. DataBarang memiliki dua field, yaitu nama yang memiliki tipe data String dan harga yang memiliki tipe data double. Field-field ini digunakan untuk menyimpan informasi tentang nama dan harga barang.
objek dari kelas DataBarang. Konstruktor ini mengambil dua parameter, yaitu nama (tipe data String) dan harga (tipe data double), dan menginisialisasi field nama dan harga dengan nilai yang diberikan saat objek dibuat.
metode-metode akses (getter) untuk mengakses nilai dari field nama dan harga. Kata kunci final yang ditempatkan di depan metode-metode ini berarti bahwa metode-metode ini tidak dapat di-override oleh subkelas. Dengan demikian, metode getNama() akan mengembalikan nilai field nama dan metode getHarga() akan mengembalikan nilai field harga.

```
package alattulis.kelas;

/**
 *
 * @author HP
 */
public final class DataBarang {
    public String nama;
    public double harga;

    public DataBarang (String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public final String getNama() {
        return nama;
    }

    public final double getHarga() {
        return harga;
    }    
}
```

### crudkaryawan.java

1. **Import Library**
   
   Kode dimulai dengan mengimpor beberapa pustaka (library) yang diperlukan:

   - `import alattulis.kelas.DataKaryawan;`: Mengimpor kelas `DataKaryawan` yang digunakan untuk merepresentasikan data karyawan.
   - `import java.util.ArrayList;`: Mengimpor kelas `ArrayList` dari pustaka Java untuk menyimpan daftar karyawan.
   - `import java.util.Scanner;`: Mengimpor kelas `Scanner` untuk membaca input dari pengguna.

2. **Deklarasi Kelas `crudkaryawan`**

   Selanjutnya, ada deklarasi kelas `crudkaryawan`. Ini adalah kelas utama yang berisi metode-metode untuk mengelola data karyawan.

3. **Variabel Kelas**

   - `private final static ArrayList<DataKaryawan> daftarKaryawan = new ArrayList<>();`: Ini adalah variabel untuk menyimpan daftar karyawan. Menggunakan `ArrayList` untuk menyimpan objek `DataKaryawan`.
   - `private final static Scanner scanner = new Scanner(System.in);`: Inisialisasi objek `Scanner` untuk menerima input dari pengguna.

4. **Metode `tambahKaryawan`**

   - Metode ini digunakan untuk menambahkan data karyawan baru ke dalam daftar.
   - Pengguna diminta untuk memasukkan nama dan jabatan karyawan.
   - Objek `DataKaryawan` dibuat dengan data yang dimasukkan dan ditambahkan ke `daftarKaryawan`.

5. **Metode `lihatSemuaKaryawan`**

   - Metode ini digunakan untuk menampilkan seluruh data karyawan yang ada dalam daftar.
   - Jika daftar kosong, pesan "No employees found" akan ditampilkan.
   - Jika daftar tidak kosong, daftar karyawan akan ditampilkan dengan nomor urut, nama, dan jabatan masing-masing karyawan.

6. **Metode `editKaryawan`**

   - Metode ini digunakan untuk mengedit data karyawan yang ada dalam daftar.
   - Daftar karyawan ditampilkan terlebih dahulu, dan pengguna diminta untuk memilih nomor karyawan yang ingin diedit.
   - Setelah pengguna memilih karyawan, mereka diminta untuk memasukkan nama dan jabatan baru.
   - Data karyawan yang dipilih diubah sesuai dengan input baru.

7. **Metode `hapusKaryawan`**

   - Metode ini digunakan untuk menghapus data karyawan dari daftar.
   - Daftar karyawan ditampilkan, dan pengguna diminta untuk memilih nomor karyawan yang ingin dihapus.
   - Data karyawan yang dipilih dihapus dari daftar.

8. **Metode `menu2`**
   
   - Ini adalah metode utama program yang menjalankan loop tak terbatas untuk menampilkan menu dan mengelola data karyawan.
   - Pengguna diminta untuk memilih opsi dari menu yang ditampilkan.
   - Opsi-opsi meliputi: menambahkan karyawan, melihat semua data karyawan, mengedit data karyawan, menghapus data karyawan, dan keluar dari program.
   - Setiap opsi memanggil metode yang sesuai untuk menjalankan tindakan yang diperlukan.
   - Program hanya akan keluar jika pengguna memilih opsi "5".

```
package alattulis.alattulis;

import alattulis.kelas.DataKaryawan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public final class crudkaryawan {
    private final static ArrayList<DataKaryawan> daftarKaryawan = new ArrayList<>();
    private final static Scanner scanner = new Scanner(System.in);
    
    private final static void tambahKaryawan() {
        System.out.print("Enter employee name     : ");
        String nama = scanner.next();
        System.out.print("Enter employee position : ");
        String jabatan = scanner.next();

        DataKaryawan karyawan = new DataKaryawan(nama, jabatan);
        daftarKaryawan.add(karyawan);

        System.out.println("Employee data successfully added.");
    }

    private final static void lihatSemuaKaryawan() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("\nEMPLOYEE LIST:");
            for (int i = 0; i < daftarKaryawan.size(); i++) {
                DataKaryawan karyawan = daftarKaryawan.get(i);
                System.out.println((i + 1) + ". " + karyawan.getNama() + " menjabat sebagai " + karyawan.getJabatan());
            }
        }
    }

    private final static void editKaryawan() {
        lihatSemuaKaryawan();
        System.out.print("Select the number     : ");
        int nomor = scanner.nextInt();

        if (nomor >= 1 && nomor <= daftarKaryawan.size()) {
            DataKaryawan karyawan = daftarKaryawan.get(nomor - 1);

            System.out.print("Enter the new name    : ");
            String namaBaru = scanner.next();
            karyawan.nama = namaBaru;

            System.out.print("Enter the new position: ");
            String jabatanbaru = scanner.next();
            karyawan.jabatan = jabatanbaru;

            System.out.println("Employee data successfully updated.");
        } else {
            System.out.println("Invalid employee number.");
        }
    }

    private final static void hapusKaryawan() {
        lihatSemuaKaryawan();
        System.out.print("Select the employee number to delete: ");
        int nomor = scanner.nextInt();

        if (nomor >= 1 && nomor <= daftarKaryawan.size()) {
            daftarKaryawan.remove(nomor - 1);
            System.out.println("Employee data successfully deleted.");
        } else {
            System.out.println("Invalid employee number.");
        }
    }
    public final static void menu2() {
        while (true) {
            System.out.println("\nEmployee Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employee Data");
            System.out.println("3. Edit Employee Data");
            System.out.println("4. Delete Employee Data");
            System.out.println("5. Exit");

            System.out.print("Select a menu (1-5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahKaryawan();
                    break;
                case 2:
                    lihatSemuaKaryawan();
                    break;
                case 3:
                    editKaryawan();
                    break;
                case 4:
                    hapusKaryawan();
                    break;
                case 5:
                    System.out.println("Thank you, the program has finished.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        }
    }
}
```
### crudbarang.java
1. **Import Library**
   
   Kode dimulai dengan mengimpor beberapa pustaka (library) yang diperlukan:

   - `import alattulis.kelas.DataKaryawan;`: Mengimpor kelas `DataBarang` yang digunakan untuk merepresentasikan data barang.
   - `import java.util.ArrayList;`: Mengimpor kelas `ArrayList` dari pustaka Java untuk menyimpan daftarbarang.
   - `import java.util.Scanner;`: Mengimpor kelas `Scanner` untuk membaca input dari pengguna.

2. **Deklarasi Kelas `crudbarang`**

   Selanjutnya, ada deklarasi kelas `crudbarang`. Ini adalah kelas utama yang berisi metode-metode untuk mengelola data barang.

3. **Variabel Kelas**

   - `private final static ArrayList<DataBarang> daftarbarang = new ArrayList<>();`: Ini adalah variabel untuk menyimpan daftar barang. Menggunakan `ArrayList` untuk menyimpan objek `Databarang`.
   - `private final static Scanner scanner = new Scanner(System.in);`: Inisialisasi objek `Scanner` untuk menerima input dari pengguna.

4. **Metode `tambahbarang`**

   - Metode ini digunakan untuk menambahkan data barang baru ke dalam daftar.
   - Pengguna diminta untuk memasukkan nama dan harga karyawan.
   - Objek `DataBarang` dibuat dengan data yang dimasukkan dan ditambahkan ke `daftarBarang`.

5. **Metode `lihatSemuabarang`**

   - Metode ini digunakan untuk menampilkan seluruh data barang yang ada dalam daftar.
   - Jika daftar kosong, pesan "No Stationery items" akan ditampilkan.
   - Jika daftar tidak kosong, daftar barang akan ditampilkan dengan nomor urut, nama, dan harga masing-masing barang.

6. **Metode `editbarang`**

   - Metode ini digunakan untuk mengedit data barang yang ada dalam daftar.
   - Daftar barang ditampilkan terlebih dahulu, dan pengguna diminta untuk memilih nomor barang yang ingin diedit.
   - Setelah pengguna memilih barang, mereka diminta untuk memasukkan nama dan harga baru.
   - Data barang yang dipilih diubah sesuai dengan input baru.

7. **Metode `hapusBarang`**

   - Metode ini digunakan untuk menghapus data barang dari daftar.
   - Daftar barang ditampilkan, dan pengguna diminta untuk memilih nomor barang yang ingin dihapus.
   - Data barang yang dipilih dihapus dari daftar.

8. **Metode `menu1`**
   
   - Ini adalah metode utama program yang menjalankan loop tak terbatas untuk menampilkan menu dan mengelola data barang.
   - Pengguna diminta untuk memilih opsi dari menu yang ditampilkan.
   - Opsi-opsi meliputi: menambahkan barang, melihat semua data barang, mengedit data barang, menghapus data barang, dan keluar dari program.
   - Setiap opsi memanggil metode yang sesuai untuk menjalankan tindakan yang diperlukan.
   - Program hanya akan keluar jika pengguna memilih opsi "5".

```

package alattulis.alattulis;
import alattulis.kelas.DataBarang;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public final class crudbarang {
    private final static ArrayList<DataBarang> daftarAlatTulis = new ArrayList<>();
    private final static Scanner scanner = new Scanner(System.in);
    
    private final static void tambahAlatTulis() {
        System.out.print("Enter the stationery name  : ");
        String nama = scanner.next();
        System.out.print("Enter the stationery price : ");
        double harga = scanner.nextDouble();

        DataBarang alatTulis = new DataBarang(nama, harga);
        daftarAlatTulis.add(alatTulis);

        System.out.println("Stationery successfully added.");
    }

    private final static void lihatSemuaAlatTulis() {
        if (daftarAlatTulis.isEmpty()) {
            System.out.println("No stationery items.");
        } else {
            System.out.println("\nLIST OF STATIONERY ITEMS");
            for (int i = 0; i < daftarAlatTulis.size(); i++) {
                DataBarang alatTulis = daftarAlatTulis.get(i);
                System.out.println((i + 1) + ". " + "Produk "+ alatTulis.getNama() + " memiliki harga: " + alatTulis.getHarga());
            }
        }
    }

    private final static void editAlatTulis() {
        lihatSemuaAlatTulis();
        System.out.print("Select the number    : ");

        int nomor = scanner.nextInt();

        if (nomor >= 1 && nomor <= daftarAlatTulis.size()) {
            DataBarang alatTulis = daftarAlatTulis.get(nomor - 1);

            System.out.print("Enter the new name   : ");
            String namaBaru = scanner.next();
            alatTulis.nama = namaBaru;

            System.out.print("Enter the price name : ");
            double hargaBaru = scanner.nextDouble();
            alatTulis.harga = hargaBaru;

            System.out.println("Alat tulis berhasil diupdate.");
        } else {
            System.out.println("Nomor alat tulis tidak valid.");
        }
    }

    private final static void hapusAlatTulis() {
        lihatSemuaAlatTulis();
        System.out.print("Select the stationery number to delete: ");
        int nomor = scanner.nextInt();

        if (nomor >= 1 && nomor <= daftarAlatTulis.size()) {
            daftarAlatTulis.remove(nomor - 1);
            System.out.println("Stationery successfully deleted.");
        } else {
            System.out.println("Invalid number..");
        }
    }
    public final static void menu1() {
        while (true) {
            System.out.println("\nSTATIONERY MENU:");
            System.out.println("1. Add Stationery");
            System.out.println("2. View All Stationery");
            System.out.println("3. Edit Stationery");
            System.out.println("4. Delete Stationery");
            System.out.println("5. Back");

            System.out.print("Select a menu (1-5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahAlatTulis();
                    break;
                case 2:
                    lihatSemuaAlatTulis();
                    break;
                case 3:
                    editAlatTulis();
                    break;
                case 4:
                    hapusAlatTulis();
                    break;
                case 5:
                    System.out.println("Thank you, the program has finished.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        }
    }
}
```
### Pbo2Alattulis.java
Kode Java di bawah merupakan bagian dari sebuah program yang merupakan main menu untuk mengelola informasi tentang barang dan karyawan di sebuah toko alat tulis. 

- Program dimulai dengan menampilkan menu dengan opsi 1 (Product Information), opsi 2 (Employee Information), dan opsi 5 (Keluar) yang memungkinkan pengguna memilih tindakan yang ingin diambil.
- Saat pengguna memilih opsi, program akan memanggil metode `menu1` jika pilihan adalah 1, atau `menu2` jika pilihan adalah 2. Ini mengindikasikan bahwa program memiliki dua kelas lain (mungkin `crudbarang` dan `crudkaryawan`) yang memiliki metode `menu1` dan `menu2` untuk mengelola informasi barang dan karyawan.
- Jika pengguna memilih opsi 5, program akan keluar.
- Selain itu, jika pengguna memilih opsi selain 1, 2, atau 5, program akan memberikan pesan bahwa pilihan tidak valid dan meminta pengguna untuk memilih 1-5.
```
package alattulis.alattulis;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public final class Pbo2Alattulis{
    private static Scanner scanner = new Scanner(System.in);

    
    public final static void main(String[] args) {
        while (true) {
            System.out.println("\nStationery Store Menu::");
            System.out.println("1. Product Information");
            System.out.println("2. Employee Information");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    crudbarang.menu1();
                    break;
                case 2:
                    crudkaryawan.menu2();
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }
    }
}
```

## 📌PENJELASAN CODING
