/* File : Datum.java
  Deskripsi : Atribut dan Metode Kelas Datum 
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 30 April 2026  */

public class Datum<T> {
  /* Atribut */
  private T isi;

  /* Konstruktor */
  public Datum(T isi) {
    this.isi = isi;
  }

  /* Selektor */
  public T getIsi() {
    return isi;
  }

  /* Mutator */
  public void setIsi(T isi) {
    this.isi = isi;
  }

  /* Method */
  public void tampilkanAnabul(Anabul anabul){
    anabul.gerak();
    anabul.bersuara();

    if(anabul instanceof Kucing){
      ((Kucing) anabul).printBobot();
    }
  }
}
