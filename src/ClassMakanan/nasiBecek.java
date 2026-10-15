/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMakanan;

/**
 *
 * @author ThinkPad
 */
public class nasiBecek extends makanan{

    public String getToping() {
        return toping;
    }

    public void setToping(String toping) {
        this.toping = toping;
    }
    private String toping;
    
    public nasiBecek(){
        namaMakanan = "";
        harga = "";
        kategori = "";
        toping = "";
    }
    
    public nasiBecek(String namaMakanan, String harga, String kategori, String toping) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
        this.toping = toping;
    }
    
    
}
