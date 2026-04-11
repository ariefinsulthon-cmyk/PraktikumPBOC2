/*  Nama File : Persegi.java
    Deskripsi : Berisi atribut dan method dalam class Persegi
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 26 Mar 2026 */
public class Persegi extends BangunDatar implements IResize {
  /* Atribut */
  private double sisi;

  /* Konstruktor */
  public Persegi() {
    setJmlsisi(4);
  }

  public Persegi(double sisi, String warna, String border) {
    super(4,warna, border);
    this.sisi = sisi;
  }

  /* Implementasi Access Modifier Superclass Atribut Protected */
  // public Persegi(double sisi, String warna, String border) {
  //   this.jmlhSisi = 4;
  //   this.warna = warna;
  //   this.border = border;
  //   this.sisi = sisi;
  // }

  /* Selektor */
  public double getSisi() {
    return sisi;
  }

  /* Mutator */
  public void setSisi(double sisi) {
    this.sisi = sisi;
  }

  /* Method */
  public double getLuas() {
    return sisi * sisi;
  }

  public double getKeliling() {
    return 4 * sisi;
  }

  public double getDiagonal() {
    return sisi * Math.sqrt(2);
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Sisi: " + sisi);
  }

  public void zoomIn() {
    sisi *= 1.1;
  }

  public void zoomOut() {
    sisi *= 0.9;
  }

  public void zoom(int percent) {
    sisi = sisi * percent / 100.0;
  }

  /* Method Hiding */
  // @Override
  // public void printCounterBangunDatar() {
  //   super.printCounterBangunDatar();
  // }
}
