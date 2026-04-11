/**
 * File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
    Pembuat   : Mohammad Sulthon Ariefin
    Tanggal   : 26 Mar 2026 */
public class AngkaSialException extends Exception {
    public AngkaSialException() {
      super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
