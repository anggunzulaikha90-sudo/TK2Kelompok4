/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMakanan;

/**
 *
 * @author LENOVO
 */
public class batagor extends makanan {
    private String jenisKulit;

    public String getJenisKulit() {
        return jenisKulit;
    }

    public void setJenisKulit(String kulit) {
        this.jenisKulit = jenisKulit;
    }

    public batagor(){
        namaMakanan = "";
        harga = "";
        kategori = "";
        jenisKulit = "";
    }

    public batagor(String namaMakanan, String harga, String kategori, String jenisKulit) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
        this.jenisKulit = jenisKulit;
    }
}
