import java.time.LocalDate;

public abstract class Manusia {
  protected String nama;
  protected LocalDate tgl_mulai_kerja;
  protected String alamat;
  protected double pendapatan;
  protected static int counterMns = 0;

  //KONSTRUKTOR
  public Manusia() {
    counterMns++;
  }

  public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
    this.nama = nama;
    this.tgl_mulai_kerja = tgl_mulai_kerja;
    this.alamat = alamat;
    this.pendapatan = pendapatan;
    counterMns++;
  }

  //SELEKTOR
  public String getNama() {
    return nama;
  }

  public LocalDate gettgl_mulai_kerja() {
    return tgl_mulai_kerja;
  }

  public String getAlamat() {
    return alamat;
  }

  public double getPendapatan() {
    return pendapatan;
  }

  public static int getCounterMns() {
    return counterMns;
  }

  //MUTATOR
  public void setNama(String nama) {
    this.nama = nama;
  }

  public void settgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
    this.tgl_mulai_kerja = tgl_mulai_kerja;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public void setPendapatan(double pendapatan) {
    this.pendapatan = pendapatan;
  }

  //Method
  public void cetakInfo() {
    System.out.println("Nama: " + nama);
    System.out.println("tgl Lahir: " + tgl_mulai_kerja);
    System.out.println("Alamat: " + alamat);
    System.out.println("Pendapatan: " + pendapatan);
  }

  public abstract int hitungMasaKerja();
}
