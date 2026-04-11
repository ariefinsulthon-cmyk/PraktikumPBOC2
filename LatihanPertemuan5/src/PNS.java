import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
  private String nip;
  private static int counterPNS = 0;

  //KONSTRUKTOR
  public PNS() {
    counterPNS++;
  }

  public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.nip = nip;
    counterPNS++;
  }

  //SELEKTOR
  public String getNip() {
    return nip;
  }

  public static int getCounterPNS() {
    return counterPNS;
  }

  //MUTATOR
  public void setNip(String nip){
    this.nip = nip;
  }

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
    System.out.println("NIP: " + nip);
    System.out.println("Pajak: " + hitungPajak());
    System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
  }
}
