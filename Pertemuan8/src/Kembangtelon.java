/* File : Kembangtelon.java
  Deskripsi : Atribut dan Metode Kelas Kembangtelon 
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 30 April 2026  */

public class Kembangtelon extends Kucing {
  public Kembangtelon(){
    super(" ", 0.0);
  }
  public Kembangtelon(String nama, double bobot){
    super(nama, bobot);
  }

  public void printBobot(){
    System.out.println("Bobot: " + getBobot() + " kg");
  }
  
  @Override
  public void gerak(){
    System.out.println(getNama() + " lincah melompat");
  }

  @Override
  public void bersuara(){
    System.out.println(getNama() + " bersuara: Meong lembut");
  }
}
