/*  Nama File : Lingkaran.java
    Deskripsi : Berisi atribut dan method dalam class Lingkaran
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 26 Mar 2026 */

public class Lingkaran extends BangunDatar implements IResize{
  /* Atribut */
  private double jari;

  /* Konstruktor */
  public Lingkaran() {
    setJmlsisi(0);
  }

  public Lingkaran(double jari, String warna, String border) {
    setBorder(border);
    setWarna(warna);
    setJmlsisi(0);
    this.jari = jari;
  }

  /* Implementasi Access Modifier Superclass Atribut Protected */
  // public Lingkaran(float jari, String warna, String border) {
  //   this.jmlhSisi = 0;
  //   this.warna = warna;
  //   this.border = border;
  //   this.jari = jari;
  // }

  /* Selektor */
  public double getJari() {
    return jari;
  }

  /* Mutator */
  public void setJari(double jari) {
    this.jari = jari;
  }

  /* Method */
  public double getLuas() {
    return Math.PI * jari * jari;
  }

  public double getKeliling() {
    return 2 * Math.PI * jari;
  }
  
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Jari-jari: " + jari);
  }

  /* Methode Hiding */
  // @Override
  // public void printCounterBangunDatar() {
  //   super.printCounterBangunDatar();
  // }
  public void zoomIn() {
    jari *= 1.1;
  }

  public void zoomOut() {
    jari *= 0.9;
  }

  public void zoom(int percent) {
    jari = jari * percent / 100.0;
  }
}
