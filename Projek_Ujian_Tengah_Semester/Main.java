/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek_Ujian_Tengah_Semester;

import java.util.Scanner;

/**
 *
 * @author X1
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        System.out.println("\t\t\t     FLASH SALE TIKET LAST CHILD");
        System.out.println("\t\t\t      BLITAR, 25 DESEMBER 2023");
        System.out.println("\t\t\t   LOKASI: KANTOR KABUPATEN BLITAR");
        System.out.println("\t\t\tReguler : 100k, VIP : 250k, VVIP : 500k");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Pilih jenis tiket (1. Reguler, 2. VIP, 3. VVIP): ");
        int pilih = scanner.nextInt();

        Tiket tiket = null;

        switch (pilih) {
            case 1:
                tiket = createTiket("Reguler", 100000);
                break;
            case 2:
                tiket = createTiket("VIP", 250000);
                break;
            case 3:
                tiket = createTiket("VVIP", 500000);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                System.exit(0);
        }

        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahPesan = scanner.nextInt();
        System.out.println("----------------------------------------------------------------------------------------");
        tiket.bookingtiket(jumlahPesan);
        tiket.DetailTiket(jumlahPesan);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t     DATA PEMESANAN");
        System.out.println("Nama : ");
        String namapemesan = scanner.next();
        System.out.println("Email : ");
        String email =scanner.next();
        System.out.println("Nomor HP : ");
        String nomor = scanner.next();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("\t Untuk pembayaran silahkan melalui rek BCA 012347564 a.n Sri handayani");
        System.out.println("\t\t\t Kirim bukti pembayaran melalui WA 085891370788");
        System.out.println("Jika pembayaran sudah di terima akan kami kirim tiket melalui email yang sudah tercantum");
        
}
    private static Tiket createTiket(String jenis, double harga) {
        return new Tiket("Lastchild - " + jenis, harga);
    }

    }

