/* Nama file  : Seminar.java
   Deskripsi  :berisi atribut dan method dalam class Seminar
   pembuat : Mohammad Sulthon Ariefin/24060124130104
   tanggal : 28 April 2026
 */

public class Seminar {
  /* Atribut */
  Civitasakademika[] pesertas = new Civitasakademika[100];
  private int banyakpeserta;

  /* Konstruktor */
  public Seminar(){
    this.banyakpeserta = 0;
  }

  /* Selektor */
  public int countPeserta(){
    return this.banyakpeserta;
  }

  /* Method */
  public void registrasi(Civitasakademika peserta){
    if(banyakpeserta < 100){
      pesertas[banyakpeserta++] = peserta;
    }
  }
  
  public void tampilPeserta(){
    for(int i = 0;i<banyakpeserta;i++){
      System.out.println("Nomor: " + pesertas[i].getNomor() + ", Nama: " + pesertas[i].getNama());
    }
  }
  
  public int countMahasiswa(){
    int total = 0;
    for(int i=0;i<banyakpeserta;i++){
      if(pesertas[i] instanceof Mahasiswa){
        total++;
      }
    }
    return total;
  }
}
