/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMakanan;

/**
 *
 * @author LENOVO
 */
public class batagor {
    private String namaMakanan;
    private String harga;
    private String kategori;

    public String getNamaMakanan() {
        return namaMakanan;
    }
    public batagor(){
        namaMakanan = "";
        harga = "";
        kategori = "";
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public batagor(String namaMakanan, String harga, String kategori) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
    }
}
