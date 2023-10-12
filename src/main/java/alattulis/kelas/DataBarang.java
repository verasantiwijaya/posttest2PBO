/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
