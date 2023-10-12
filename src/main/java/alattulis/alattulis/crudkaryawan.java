/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

