/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

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

