/* File : MainTeman.java
  Deskripsi : Kelas MainTeman untuk implementasi koleksi kelas dasar berdasarkan kelas Teman
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 7 Mei 2026  */

public class MainTeman {
  public static void main(String[] args) throws Exception {
    Teman t = new Teman();

    //Implementasi d. addNama
    t.addNama("Zaidan");
    t.showTeman();

    //Implementasi a. getNbelm
    System.out.println("Jumlah teman: " + t.getNbelm());

    //Implementasi b. getNama
    System.out.println("Isi elemen ke-0: " + t.getNama(0));

    //Implementasi c. setNama
    t.setNama(0, "Sulthon");
    t.showTeman();

    //Implementasi e. delNama
    t.delNama("Sulthon");
    t.showTeman();
    
    //Implementasi f. isMember
    t.addNama("Haikal");
    System.out.println("Apakah Haikal adalah teman? " + t.isMember("Haikal"));

    //Implementasi g. gantiNama
    t.gantiNama("Haikal", "Rafli");
    t.showTeman();

    //Implementasi h. countNama
    t.addNama("Rafli");
    System.out.println("Jumlah Teman bernama Rafli: " + t.countNama("Rafli"));

    //Implementasi i. showAll
    System.out.println("Semua Teman:");
    t.showTeman();
  }
}
