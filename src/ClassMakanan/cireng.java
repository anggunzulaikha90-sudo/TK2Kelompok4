/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMakanan;

/**
 *
 * @author autho
 */
public class cireng {
    private String namaMakanan;
    private String harga;
    private String kategori;

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
    private String isi;

    public String getNamaMakanan() {
        return namaMakanan;
    }
    public cireng(){
        namaMakanan = "";
        harga = "";
        kategori = "";
        isi = "";
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

    public cireng(String namaMakanan, String harga, String kategori, String isi) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
        this.isi = isi;
    }
    
}
