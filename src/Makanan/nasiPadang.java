/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Makanan;

/**
 *
 * @author ANGGUN Z
 */
public class nasiPadang {
    String namaMakanan;
    int harga;
    String kategori;

    public nasiPadang(String namaMakanan, int harga, String kategori) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
