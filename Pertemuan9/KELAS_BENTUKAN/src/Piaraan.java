import java.util.LinkedList;
/* File : Piaraan.java
  Deskripsi : Kelas Piaraan untuk implementasi koleksi kelas bentukan
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 7 Mei 2026  */

public class Piaraan {
  /* Atribut */
  private int nbelm;
  private final LinkedList<Anabul> Lanabul;

  /* Konstruktor */
  public Piaraan() {
    this.nbelm = 0;
    this.Lanabul = new LinkedList<>();
  }

  /* Selektor */
  //b. i
  public int getNbelm() {
    return this.nbelm;
  }

  /* Method */
  //b. ii
  public void enqueueAnabul(Anabul anabul) {
    this.Lanabul.addLast(anabul);
    this.nbelm++;
  }

  //b. iii
  public boolean isMember(Anabul anabul){
    return this.Lanabul.contains(anabul);
  }

  //b. iv
  public Anabul getAnabul() {
    return this.Lanabul.peekFirst();
  }

  //b. v 
  public Anabul dequeueAnabul() {
    Anabul anabul = this.Lanabul.poll();
    this.nbelm--;
    return anabul;
  }

  //c. showAnabul()
  public void showAnabul() {
    for (Anabul anabul : this.Lanabul) {
      System.out.println(anabul.getNama());
    }
  }

  //d. countKucing()
  public int countKucing() {
    int count = 0;
    for(Anabul anabul : Lanabul){
      if(anabul instanceof Kucing) {
        count++;
      }
    }
    return count;
  }

  //e. bobotKucing
  public int bobotKucing() {
    int totalBobot = 0;
    for(Anabul anabul : Lanabul) {
      if(anabul instanceof Kucing) {
        totalBobot += ((Kucing) anabul).getBobot();
      }
    }
    return totalBobot;
  }

  //f. showJenisAnabul
  public void showJenisAnabul() {
    for(Anabul anabul : Lanabul){
      System.out.println("Panggilan: " + anabul.getNama() + ", Jenis: " + anabul.getClass().getName());
    }
  }
}
