/* File : Anjing.java
  Deskripsi : Kelas Anjing untuk implementasi Inclusion
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 23 April 2026  */

public class Anjing extends Anabul {
  /* Konstruktor */
  public Anjing(){
    super("");
  }

  public Anjing(String nama) {
    super(nama);
  }

  /* Method */
  @Override
  public void gerak() {
    System.out.println("Anjing " + getNama() + " melata");
  }

  @Override
  public void bersuara() {
    System.out.println("Anjing " + getNama() + " bersuara guk-guk");
  }
}

