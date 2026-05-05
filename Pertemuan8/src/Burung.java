/* File : Burung.java
  Deskripsi : Kelas Burung untuk implementasi generik
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 23 April 2026  */

public class Burung extends Anabul {
  public Burung(){
    super("");
  }

  public Burung(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println("Burung " + getNama() + " terbang");
  }

  @Override
  public void bersuara() {
    System.out.println("Burung " + getNama() + " berbunyi cuit");
  }
}

