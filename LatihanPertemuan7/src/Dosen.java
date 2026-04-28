/* Nama file  : Dosen.java
   Deskripsi  :berisi atribut dan method dalam class Dosen
   pembuat : Mohammad Sulthon Ariefin/24060124130104
   tanggal : 28 April 2026
 */

public class Dosen extends Civitasakademika {
  /* Atribut */
  private String nip;

  /* Konstruktor */
  public Dosen(){}

  public Dosen(String nama, String nip){
    super(nama);
    this.nip = nip;
  }

  /* Selektor */
  @Override
  public String getNomor(){
    return nip;
  }

  /* Mutator */
  public void setNip(String nip){
    this.nip = nip;
  }
}
