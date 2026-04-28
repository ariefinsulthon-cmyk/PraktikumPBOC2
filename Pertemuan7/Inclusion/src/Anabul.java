/* File : Anabul.java
  Deskripsi : Kelas Anabul untuk implementasi Inclusion
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 23 April 2026  */

public class Anabul {
  private String nama;

  public Anabul(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  // Method
  public void gerak() {
    System.out.println("Anabul " + nama + " bergerak...");
  }

  public void bersuara() {
    System.out.println("Anabul " + nama + " bersuara...");
  }

}
