/* File : Mahasiswa.java
  Deskripsi : Kelas Mahasiswa untuk implementasi Overloading
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 23 April 2026  */

public class Mahasiswa {
  private String Nim;
  private String Nama;
  private String Programstudi;

  public Mahasiswa () {
    this.Nim = "-999";
    this.Nama = "n/a";
    this.Programstudi = "n/a";
  }

  public Mahasiswa(String nim, String nama, String programstudi) {
    this.Nim = nim;
    this.Nama = nama;
    this.Programstudi = programstudi;
  }

  public Mahasiswa(Mahasiswa mhs) {
    this.Nim = mhs.getNim();
    this.Nama = mhs.getNama();
    this.Programstudi = mhs.getProgramStudi();
  }
  
  public String getNim() {
    return this.Nim;
  }

  public String getNama() {
    return this.Nama;
  }
  
  public String getProgramStudi(){
    return this.Programstudi;
  }

  public void setNama(String nama) {
    this.Nama = nama;
  }

  public void setNim(String nim) {
    this.Nim = nim;
  }

  public void setProgramstudi() {
    this.Programstudi = "Kosong";
  }

  public void setProgramStudi(String programstudi) {
    this.Programstudi = programstudi;
  }

  public void setProgramStudi(Mahasiswa M) {
    this.Programstudi = M.getProgramStudi();
  }

  // Method 
  public void printInfo(Mahasiswa mhs) {
    System.out.println("NIM: " + mhs.getNim());
    System.out.println("Nama: " + mhs.getNama());
    System.out.println("Program Studi: " + mhs.getProgramStudi());
  }
}
