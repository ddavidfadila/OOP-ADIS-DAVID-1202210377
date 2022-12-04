/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmodul2_david;

/**
 *
 * @author HP
 */
public class MainApp {
    
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Transcend 25M3", 750, 5.7F);
        perangkat.informasi();
        
        System.out.println();

        Laptop laptop = new Laptop("Western Digital – WD Element Portable 1 TB", 64, 8.8F, true);
        laptop.informasi();
        laptop.bukaGame("Mobile Legend");

        laptop.kirimEmail("davidfadillla1@gmail.com");
        laptop.kirimEmail("davidfadillla1@gmail.com", "satudua@gmail.com");
        
        System.out.println();

        Handphone handphone = new Handphone("Vivo", 64, 8.8F, false);
        handphone.informasi();

        handphone.telfon(628128858);
        handphone.kirimSMS(628128858);
        handphone.kirimSMS(628128858, 62815678);
    
    }
    
}
