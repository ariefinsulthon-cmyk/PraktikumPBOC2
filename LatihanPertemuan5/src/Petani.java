import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
  private String asal_kota;
  private static int counterPetani = 0;

  //KONSTRUKTOR
  public Petani() {
    counterPetani++;
  }

  public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.asal_kota = asal_kota;
    counterPetani++;
  }

  //SELEKTOR
  public String getasal_kota() {
    return asal_kota;
  }

  public static int getCounterPetani() {
    return counterPetani;
  }

  //MUTATOR
  public void setasal_kota(String asal_kota){
    this.asal_kota = asal_kota;
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
    System.out.println("Asal Kota: " + asal_kota);
    System.out.println("Pajak: " + hitungPajak());
    System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
  }
}
