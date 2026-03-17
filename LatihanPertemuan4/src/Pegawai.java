import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
  private String Nip;
  private String Nama;
  private LocalDate TanggalLahir;
  private LocalDate Tmt;
  private int GajiPokok;

  /* Konstruktor */
  public Pegawai(String Nip, String Nama, LocalDate TanggalLahir, LocalDate Tmt, int GajiPokok) {
    this.Nip = Nip;
    this.Nama = Nama;
    this.TanggalLahir = TanggalLahir;
    this.Tmt = Tmt;
    this.GajiPokok = GajiPokok;
  }

  public Pegawai() {

  }

  /* Selektor */
  public String getNip() {
    return Nip;
  }

  public String getNama() {
    return Nama;
  }

  public LocalDate getTanggalLahir() {
    return TanggalLahir;
  }

  public LocalDate getTmt() {
    return Tmt;
  }

  public int getGajiPokok() {
    return GajiPokok;
  }

  /* Mutator */
  public void setNip(String Nip) {
    this.Nip = Nip;
  }
  public void setNama(String Nama) {
    this.Nama = Nama;
  }
  public void setTanggalLahir(LocalDate TanggalLahir) {
    this.TanggalLahir = TanggalLahir;
  }
  public void setTmt(LocalDate Tmt) {
    this.Tmt = Tmt;
  }
  public void setGajiPokok(int GajiPokok) {
    this.GajiPokok = GajiPokok;
  }

  /* Method */
  public static String formatTanggal(LocalDate tanggal) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
    return tanggal.format(formatter);
  }

  public int getMasaKerja(){
    LocalDate now = LocalDate.now();
    int MasaKerja = now.getYear() - Tmt.getYear();
    if(now.getMonthValue() < Tmt.getMonthValue()){
      MasaKerja--;
    }
    return MasaKerja;
  }

  public void printMasaKerjaDetail(){
    LocalDate now = LocalDate.now();
    int years = now.getYear() - Tmt.getYear();
    int months = now.getMonthValue() - Tmt.getMonthValue();
    if (months < 0) {
      years--;
      months += 12;
    }
    System.out.println("Masa Kerja: " + years + " tahun " + months + " bulan");
  }

  public void printInfo(){
    System.out.println("Nip: " + Nip);
    System.out.println("Nama: " + Nama);
    System.out.println("Tanggal Lahir: " + formatTanggal(TanggalLahir));
    System.out.println("Tmt: " + formatTanggal(Tmt));
    System.out.println("Gaji Pokok: " + GajiPokok);
  }
}
