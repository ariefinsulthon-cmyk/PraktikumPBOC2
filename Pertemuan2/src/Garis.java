/*  Nama File : Garis.java
    Deskripsi : Berisi atribut dan method dalam class Garis
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 26 Feb 2026 */

public class Garis {
  Titik awal; Titik akhir;
  static int counterGaris = 0;

  Garis(){
    awal = new Titik();
    akhir = new Titik();
    counterGaris++;
  }

  static int getCounterGaris(){
    return counterGaris;
  }

  void setAwal(double x, double y){
    awal.absis = x;
    awal.ordinat = y;
  }

  void setAkhir(double x, double y){
    akhir.absis = x;
    akhir.ordinat = y;
  }
  
}
