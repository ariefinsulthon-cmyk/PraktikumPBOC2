/* nama file  : CivitasAkademika.java
   Deskripsi  :berisi atribut dan method dalam class CivitasAkademika
   pembuat : Mohammad Sulthon Ariefin/24060124130104
   tanggal : 28 April 2026
 */

public class Civitasakademika {
    /* Atribut */
    private String nama;

    /* Konstruktor */
    public Civitasakademika(){}

    public Civitasakademika(String nama){
        this.nama = nama;
    }

    /* Selektor */
    public String getNama(){
        return this.nama;
    }

    /* Mutator */
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNomor(){ return " ";}
}
