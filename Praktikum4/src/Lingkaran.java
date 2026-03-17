/*  Nama File : Lingkaran.java
    Deskripsi : Berisi atribut dan method dalam class Lingkaran
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 12 Mar 2026 */

public class Lingkaran extends BangunDatar {
  /* Atribut */
  private float jari;

  /* Konstruktor */
  public Lingkaran() {
    setJmlsisi(0);
  }

  public Lingkaran(float jari, String warna, String border) {
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
  public float getJari() {
    return jari;
  }

  /* Mutator */
  public void setJari(float jari) {
    this.jari = jari;
  }

  /* Method */
  public float getLuas() {
    return (float) (Math.PI * jari * jari);
  }

  public float getKeliling() {
    return (float) (2 * Math.PI * jari);
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
}
