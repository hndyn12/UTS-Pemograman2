/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek_Ujian_Tengah_Semester;

/**
 *
 * @author X1
 */ 
class Tiket implements Booking{
    private final  String nama;
    private final  double harga;
public Tiket (String nama,double harga){
    this.nama=nama;
    this.harga=harga;
}

    @Override
    public String getNama() {
        return nama;
    }
    
    public void DetailTiket(int jumlah){
        System.out.println("Jenis tiket: "+nama);
        System.out.println("Harga: "+harga);
        System.out.println("Jumlah Tiket: "+jumlah);
        System.out.println("Total harga: "+getTotalHarga(jumlah));
    }

    private double getTotalHarga(int jumlah) {
        return harga * jumlah;
    }

    @Override
    public void bookingtiket(int jumlah) {
        System.out.println("Tiket " + getNama() + " berhasil dipesan sebanyak " + jumlah + " buah.");
    }
}