/*  Nama File : BangunDatar.java
    Deskripsi : Berisi atribut dan method dalam class BangunDatar
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 12 Mar 2026 */

public class BangunDatar {
  /* Atribut */
  private int jmlsisi;
  private String warna;
  private String border;
  private static int counterBangunDatar = 0;

  /* Konstruktor */
  public BangunDatar() {
    counterBangunDatar++;
  }

  public BangunDatar(int jmlsisi, String warna, String border) {
    this.jmlsisi = jmlsisi;
    this.warna = warna;
    this.border = border;
    counterBangunDatar++;
  }

  /* Selektor */
  public int getJmlsisi() {
    return jmlsisi;
  }
  
  public String getWarna() {
    return warna;
  }

  public String getBorder() {
    return border;
  }

  /* Mutator */
  public void setJmlsisi(int jmlsisi) {
    this.jmlsisi = jmlsisi;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public void setBorder(String border) {
    this.border = border;
  }

  /* Method */
  public void printInfo() {
    System.out.println("Jumlah Sisi: " + jmlsisi);
    System.out.println("Warna: " + warna);
    System.out.println("Border: " + border);
  }

  /* Implementasi Final Keyword */
  // public final void printInfo() {
  //   System.out.println("Jumlah Sisi: " + jmlsisi);
  //   System.out.println("Warna: " + warna);
  //   System.out.println("Border: " + border);
  // }

  public static void printCounterBangunDatar() {
    System.out.println("Total Bangun Datar: " + counterBangunDatar);
  }
}
