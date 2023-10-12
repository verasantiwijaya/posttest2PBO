/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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


