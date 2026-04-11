/* Nama File : MBangunDatar.java
    Deskripsi : Main program untuk mengimplementasikan class BangunDatar, Persegi, dan Lingkaran
    Pembuat   : Mohammad Sulthon Ariefin
    Tanggal   : 26 Mar 2026 */

public class MBangunDatar {
    public static void main(String[] args) {
        
        Persegi P1 = new Persegi(6.0, "Merah", "Tebal");
        Lingkaran P2 = new Lingkaran(5.0, "Biru", "Tipis");
        // System.out.println("Luas P1: " + P1.getLuas());
        // System.out.println("Luas P2: " + P2.getLuas());
        // System.out.println("Apakah luas P1 dan P2 sama? " + P1.isEqualLuas(P2));
        System.out.println("Sisi sebelum zoom: " + P1.getSisi());
        System.out.println("Jari-jari sebelum zoom: " + P2.getJari());
        P1.zoom(50);
        P2.zoom(50);
        System.out.println("Sisi setelah zoom: " + P1.getSisi());
        System.out.println("Jari-jari setelah zoom: " + P2.getJari());
    }
}