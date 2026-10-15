/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMakanan;

/**
 *
 * @author USERR
 */
public class jenangSumSum extends makanan {
   private String varian;

    public String getVarian() {
        return varian;
    }

    public void setVarian(String varian) {
        this.varian = varian;
    }

    public jenangSumSum(String namaMakanan, String harga, String kategori, String varian) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
        this.varian = varian;
        
    }
     public jenangSumSum(){
        namaMakanan = "";
        harga = "";
        kategori = "";
        varian = "";
    }
    
}
