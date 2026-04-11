import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
  private String npwp;
  private static int counterPengusaha = 0;

  //KONSTRUKTOR
  public Pengusaha() {
    counterPengusaha++;
  }

  public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.npwp = npwp;
    counterPengusaha++;
  }

  //SELEKTOR
  public String getNpwp() {
    return npwp;
  }

  public static int getCounterPengusaha() {
    return counterPengusaha;
  }

  //MUTATOR
  public void setNpwp(String npwp){
    this.npwp = npwp;
  }

  //Method
  @Override
  public int hitungMasaKerja() {
    //NIM: 24060124130104
    return  LocalDate.now().getYear() - super.tgl_mulai_kerja.getYear() + 4;
  
  }

  @Override
  public double hitungPajak() {
    return super.pendapatan * 0.10;
  }

  public void cetakInfo() {
    super.cetakInfo();
    System.out.println("NPWP: " + npwp);
    System.out.println("Pajak: " + hitungPajak());
    System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
  }
}
