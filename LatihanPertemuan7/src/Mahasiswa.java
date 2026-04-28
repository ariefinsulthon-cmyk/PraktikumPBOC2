/* Nama file  : Mahasiswa.java
   Deskripsi  :berisi atribut dan method dalam class Mahasiswa
   pembuat : Mohammad Sulthon Ariefin/24060124130104
   tanggal : 28 April 2026
 */

public class Mahasiswa extends Civitasakademika {
  /* Atribut */
  private String nim;
  private Dosen dosenWali;

  /* Konstruktor */
  public Mahasiswa(){}

  public Mahasiswa(String nama,String nim,Dosen dosenWali){
    super(nama);
    this.nim = nim;
    this.dosenWali = dosenWali;
  }

  /* Selektor */
  @Override
  public String getNomor(){
    return nim;
  }

  public Dosen getDosenWali(){
    return dosenWali;
  }

  /* Mutator */
  public void setNim(String nim){
    this.nim = nim;
  }

  public void setWali(Dosen dosenWali){
    this.dosenWali = dosenWali;
  }

  /* Method */
  public void tampilDataMahasiswa(){
    System.out.println("NIM: " + getNomor());
    System.out.println("Nama: " + getNama());
    System.out.println("Dosen Wali: " + getDosenWali().getNama());
  }
}
