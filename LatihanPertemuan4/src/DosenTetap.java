import java.time.LocalDate;

public class DosenTetap extends Dosen {
  private String Nidn;
  private int Bup = 65;
  
  /* Konstruktor */
  public DosenTetap(String Nip, String Nama, LocalDate TanggalLahir, LocalDate Tmt, int GajiPokok, String Nidn, String Fakultas) {
    super(Nip, Nama, TanggalLahir, Tmt, GajiPokok, Fakultas);
    this.Nidn = Nidn;
  }

  public DosenTetap() {

  }

  /* Selektor */
  public String getNidn() {
    return Nidn;
  }

  /* Mutator */
  public void setNidn(String Nidn) {
    this.Nidn = Nidn;
  }

  /* Method */
  public LocalDate getTglPensiunDosenTetap() {
    LocalDate BUP = getTanggalLahir().plusYears(Bup);
    return BUP.plusMonths(1).withDayOfMonth(1);
  }

  public int getTunjanganDosenTetap(){
    return (int) (0.2 * getMasaKerja() * getGajiPokok());
  }

  public void printInfoDosenTetap() {
    printInfoDosen();
    System.out.println("NIDN: " + getNidn());
    System.out.println("Jabatan: Dosen Tetap");
    printMasaKerjaDetail();
    System.out.println("Tgl Pensiun: " + formatTanggal(getTglPensiunDosenTetap()));
    System.out.println("Tunjangan: " + getTunjanganDosenTetap());
  }
}
