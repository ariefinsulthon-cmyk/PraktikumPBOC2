/* Nama File : MBangunDatar.java
    Deskripsi : Main program untuk mengimplementasikan class BangunDatar, Persegi, dan Lingkaran
    Pembuat   : Mohammad Sulthon Ariefin
    Tanggal   : 12 Mar 2026 */

public class MBangunDatar {
    public static void main(String[] args) {
        
        // Membuat objek Persegi
        System.out.println("<=== Implementasi Persegi ===>");

        Persegi P1 = new Persegi(5.0, "Merah", "Tebal");
        P1.printInfo();
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Keliling Persegi: " + P1.getKeliling());
        System.out.println("Diagonal Persegi: " + P1.getDiagonal());

        System.out.println("");

        // Membuat objek Lingkaran
        System.out.println("<=== Implementasi Lingkaran ===>");

        Lingkaran L1 = new Lingkaran(7.0f, "Biru", "Tipis");
        L1.printInfo();
        System.out.println("Luas Lingkaran: " + L1.getLuas());
        System.out.println("Keliling Lingkaran: " + L1.getKeliling());
        
        System.out.println("");

        BangunDatar.printCounterBangunDatar();
    }
}