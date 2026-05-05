/* File : Data.java
  Deskripsi : Kelas Data untuk implementasi Larik Generik
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 4 Mei 2026  */

public class Data<T> {
  /* Atribut */
  private Object[] ruang;
  private int banyak;

  /* Konstruktor */
  public Data() {
    ruang = new Object[100];
    banyak = 0;
  }

  /* Selektor */
  @SuppressWarnings("unchecked")
  public T getIsi(int i) {
    if(i > 0 && i <= 100 && ruang[i-1] != null){
      return (T) ruang[i-1];
    }
    return null;
  }

  public int getSize(){
    return banyak;
  }

  /* Mutator */
  public void setIsi(int i, T elemen) {
    if(i > 0 && i <= 100){
      if(ruang[i-1] == null && elemen != null){
        banyak++;
      }
      else if(ruang[i-1] != null && elemen == null){
        banyak--;
      }
      ruang[i-1] = elemen;
    }
    else{
      System.out.println("Indeks tidak valid");
    }
  }
}
