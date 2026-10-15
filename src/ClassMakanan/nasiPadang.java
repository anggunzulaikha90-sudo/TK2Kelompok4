/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMakanan;

/**
 *
 * @author ANGGUN Z
 */
public class nasiPadang extends makanan{
   private String jenisKuah;

    public String getJenisKuah() {
        return jenisKuah;
    }

    public void setJenisKuah(String jenisKuah) {
        this.jenisKuah = jenisKuah;
    }
    
    public nasiPadang(){
        namaMakanan = "";
        harga = "";
        kategori = "";
        jenisKuah = "";
    }

    public nasiPadang(String namaMakanan, String harga, String kategori, String jenisKuah) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
        this.jenisKuah = jenisKuah;
    }

    
}
