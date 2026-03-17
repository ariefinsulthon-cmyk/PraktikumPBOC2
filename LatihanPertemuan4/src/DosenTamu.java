import java.time.LocalDate;

public class DosenTamu extends Dosen {
  private String Nidk;
  private LocalDate TglBerakhir;
  
  /* Konstruktor */
  public DosenTamu(String Nip, String Nama, LocalDate TanggalLahir, LocalDate Tmt, int GajiPokok, String Nidk, String Fakultas, LocalDate TglBerakhir) {
    super(Nip, Nama, TanggalLahir, Tmt, GajiPokok, Fakultas);
    this.Nidk = Nidk;
    this.TglBerakhir = TglBerakhir;
  }

  public DosenTamu() {}

  /* Selektor */
  public String getNidk() {
    return Nidk;
  }

  public LocalDate getTglBerakhir() {
    return TglBerakhir;
  }

  /* Mutator */
  public void setNidk(String Nidk) {
    this.Nidk = Nidk;
  }

  public void setTglBerakhir(LocalDate TglBerakhir) {
    this.TglBerakhir = TglBerakhir;
  }

  /* Method */
  public int getTunjanganDosenTamu() {
    return (int) (0.25 * getGajiPokok());
  }

  public void printInfoDosenTamu() {
    printInfoDosen();
    System.out.println("NIDK: " + getNidk());
    System.out.println("Jabatan: Dosen Tamu");
    printMasaKerjaDetail();
    System.out.println("Masa Kontrak Berakhir: " + formatTanggal(getTglBerakhir()));
    System.out.println("Tunjangan: " + getTunjanganDosenTamu());
  }
}
