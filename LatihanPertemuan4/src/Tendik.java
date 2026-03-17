import java.time.LocalDate;

public class Tendik extends Pegawai {
  private String bidang;
  private int Bup = 55;

  /* Konstruktor */
  public Tendik(String Nip, String Nama, LocalDate TanggalLahir, LocalDate Tmt, int GajiPokok, String bidang) {
    super(Nip, Nama, TanggalLahir, Tmt, GajiPokok);
    this.bidang = bidang;
  }

  public Tendik() {

  }

  /* Selektor */
  public String getBidang() {
    return bidang;
  }

  /* Mutator */
  public void setBidang(String bidang) {
    this.bidang = bidang;
  }

  /* Method */
  public int getTunjanganTendik() {
    return (int) (0.1 * getMasaKerja() * getGajiPokok());
  }

  public LocalDate getTglPensiunTendik() {
    LocalDate BUP = getTanggalLahir().plusYears(Bup);
    return BUP.plusMonths(1).withDayOfMonth(1);
  }

  public void printInfoTendik() {
    printInfo();
    System.out.println("Jabatan: Tendik");
    System.out.println("Bidang Tempat Kerja: " + getBidang());
    printMasaKerjaDetail();
    System.out.println("Tgl Pensiun: " + formatTanggal(getTglPensiunTendik()));
    System.out.println("Tunjangan: " + getTunjanganTendik());
  }
}
