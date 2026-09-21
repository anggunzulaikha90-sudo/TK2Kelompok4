/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        nasiPadang m1 = new nasiPadang("Nasi Padang", 12000, "Makanan Berat");
        System.out.println("Nama Makanan\t: " + m1.getNamaMakanan()+ "\nHarga\t\t: " + m1.getHarga() +"\nKategori\t: " +  m1.getKategori());
    }
    
}
