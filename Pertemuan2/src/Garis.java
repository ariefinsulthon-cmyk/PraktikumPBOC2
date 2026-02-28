/*  Nama File : Garis.java
    Deskripsi : Berisi implementasi dari class Garis
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 28 Feb 2026 */

public class Garis {
  private Titik awal; private Titik akhir;
  private static int counterGaris = 0;

  public Garis(Titik T1, Titik T2){
    awal = new Titik(T1.getAbsis(),T1.getOrdinat());
    akhir = new Titik(T2.getAbsis(),T2.getOrdinat());
    counterGaris++;
  }

  public Garis(){
    awal = new Titik();
    akhir = new Titik();
    counterGaris++;
  }

  public static int getCounterGaris(){
    return counterGaris;
  }

  public void setAwal(double x, double y){
    awal.setAbsis(x);
    awal.setOrdinat(y);
  }

  public void setAkhir(double x, double y){
    akhir.setAbsis(x);
    akhir.setOrdinat(y);
  }
  
  public Titik getAwal(){
    return awal;
  }

  public Titik getAkhir(){
    return akhir;
  }

  public double panjangGaris(){
    return awal.getJarak(akhir);
  }

  public double getGradien(){
    return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
  }

  public Titik titikTengah(){
    return new Titik((awal.getAbsis() + akhir.getAbsis())/2,(awal.getOrdinat() + akhir.getOrdinat())/2);
  }

  public boolean isSejajar(Garis G){
    return this.getGradien() == G.getGradien();
  }

  public boolean isTegakLurus(Garis G){
    return this.getGradien() * G.getGradien() == -1;
  }

  public void printGaris(){
    System.out.println("{" + "Awal(" + awal.getAbsis() + "," + awal.getOrdinat() + ")" + "," + "Akhir(" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")" + "}");
  }
  
  public void printPersamaan(){
    System.out.println("y = " + getGradien() + "x + " +  (awal.getOrdinat()-getGradien()*awal.getAbsis()));
  }
}
