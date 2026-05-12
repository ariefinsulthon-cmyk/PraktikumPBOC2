/* File : MainPiaraan.java
  Deskripsi : Kelas MainPiaraan untuk implementasi koleksi kelas bentukan berdasarkan kelas Piaraan
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 7 Mei 2026  */

  public class MainPiaraan {
    public static void main(String[] args) {
        //Objek P1
        Piaraan P1 = new Piaraan();

        //Objek elemen P1
        Anjing Anjing1 = new Anjing("Buddy");
        Anggora Anggora1 = new Anggora("Lesley", 3.0);
        Kembangtelon Kembangtelon1 = new Kembangtelon("Layla", 3.5);

        //b. ii  
        P1.enqueueAnabul(Anjing1);
        P1.enqueueAnabul(Anggora1);
        P1.enqueueAnabul(Kembangtelon1);
        System.out.println("Daftar Anabul:");
        P1.showAnabul();
        
        //b. i
        System.out.println("\nBanyak Anabul: " + P1.getNbelm());

        //b. iii
        System.out.println("\nApakah Buddy adalah anggota Piaraan? " + P1.isMember(Anjing1));

        //b. iv
        System.out.println("\nAnabul pertama: " + P1.getAnabul().getNama());

        //b. v
        P1.dequeueAnabul();
        System.out.println("\nSetelah dequeue:");
        P1.showAnabul();

        //c.
        System.out.println("\nDaftar Anabul:");
        P1.showAnabul();

        //d.
        System.out.println("\nJumlah Kucing: " + P1.countKucing());

        //e.
        System.out.println("\nTotal bobot kucing: " + P1.bobotKucing());
        
        //f.
        System.out.println("\nDaftar Anabul dan jenisnya:");
        P1.showJenisAnabul();
    }
}
