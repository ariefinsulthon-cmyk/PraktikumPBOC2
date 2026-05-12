/* File : Anabul.java
  Deskripsi : Kelas Anabul untuk implementasi Inclusion
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 23 April 2026  */

public class Anabul {
  /* Atribut */
  private String panggilan;
  
  /* Konstruktor */
  public Anabul(String panggilan) {
    this.panggilan = panggilan;
  }

  /* Selektor */
  public String getNama() {
    return panggilan;
  }

  /* Mutator */
  public void setNama(String nama){
    panggilan = nama;
  }

  // Method
  public void gerak() {
    System.out.println("Anabul " + panggilan + " bergerak...");
  }

  public void bersuara() {
    System.out.println("Anabul " + panggilan + " bersuara...");
  }

}

