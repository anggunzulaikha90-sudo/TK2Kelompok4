/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMakanan;

/**
 *
 * @author ThinkPad
 */
public class pisangGoreng extends makanan{
    protected String jenis_pisang;

    public String getJenis_pisang() {
        return jenis_pisang;
    }

    public void setJenis_pisang(String jenis_pisang) {
        this.jenis_pisang = jenis_pisang;
    }

    public pisangGoreng(){
        namaMakanan = "";
        harga = "";
        kategori = "";
    }
    public pisangGoreng(String namaMakanan, String harga, String kategori) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    
}
