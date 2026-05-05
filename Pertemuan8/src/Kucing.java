/* File : Kucing.java
  Deskripsi : Kelas Kucing untuk implementasi Inclusion
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 23 April 2026  */

public class Kucing extends Anabul {
  /* Atribut */
  protected double bobot;

  /* Konstruktor */
  public Kucing(){
    super("");
    this.bobot = 0.0;
  }

  public Kucing(String nama, double bobot) {
    super(nama);
    this.bobot = bobot;
  }

  /* Selektor */
  public double getBobot(){
    return this.bobot;
  }

  /* Mutator */
  public void setBobot(double bobot) {
    this.bobot = bobot;
  }

  /* Method */
  public void printBobot(){
    System.out.println("Bobot: " + getBobot() + " kg");
  }

  @Override
  public void gerak() {
    System.out.println("Kucing " + getNama() + " melata");
  }

  @Override
  public void bersuara() {
    System.out.println("Kucing " + getNama() + " berbunyi meong");
  }
}

