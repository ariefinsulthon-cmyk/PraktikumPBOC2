/* File : Anggora.java
  Deskripsi : Atribut dan Metode Kelas Anggora 
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 30 April 2026  */

public class Anggora extends Kucing {
  /* Konstruktor */
  public Anggora(){
    super(" ", 0.0);
  }

  public Anggora(String nama, double bobot){
    super(nama, bobot);
  }

  /* Method */
  @Override
  public void gerak(){
    System.out.println(getNama() + " lincah melompat");
  }

  @Override
  public void bersuara(){
    System.out.println(getNama() + " bersuara: Meong lembut");
  }

}
