/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
