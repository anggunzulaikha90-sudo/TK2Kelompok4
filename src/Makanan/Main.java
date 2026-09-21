/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Makanan;

/**
 *
 * @author ANGGUN Z
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        nasiPadang m1 = new nasiPadang("Nasi Padang", 12000, "Makanan Berat");
        System.out.println("Menu Satu\n"+"Nama Makanan\t: " + m1.getNamaMakanan()+ "\nHarga\t\t: " + m1.getHarga() +"\nKategori\t: " +  m1.getKategori());
        pisangGoreng m2 = new pisangGoreng("Pisang Goreng", 2000, "Makanan Ringan");
        System.out.println("Menu Dua\n"+"Nama Makanan\t: " + m2.getNamaMakanan()+ "\nHarga\t\t: " + m2.getHarga() + "\nKategori\t: " + m2.getKategori());
        nasiBecek m3 = new nasiBecek("Nasi Becek", 20000, "Makanan Berat");
        System.out.println("Menu Tiga\n"+"Nama Makanan\t: " + m3.getNamaMakanan()+ "\nHarga\t\t: " + m3.getHarga() + "\nKategori\t: " + m3.getKategori());
    }
    
}
