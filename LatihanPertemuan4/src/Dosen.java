import java.time.LocalDate;

public class Dosen extends Pegawai {
  private String Fakultas;

  /* Konstruktor */
  public Dosen(String Nip, String Nama, LocalDate TanggalLahir, LocalDate Tmt, int GajiPokok, String Fakultas) {
    super(Nip, Nama, TanggalLahir, Tmt, GajiPokok);
    this.Fakultas = Fakultas;
  }

  public Dosen() {

  }

  /* Selektor */
  public String getFakultas() {
    return Fakultas;
  }

  /* Mutator */
  public void setFakultas(String Fakultas) {
    this.Fakultas = Fakultas;
  }

  /* Method */
  public void printInfoDosen() {
    printInfo();
    System.out.println("Fakultas: " + getFakultas());
  }
}
