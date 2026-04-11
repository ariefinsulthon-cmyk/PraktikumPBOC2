class Lingkaran {
  private double jari;
  public Lingkaran(double jari){
    this.jari = jari;
  }
  public double hitungKeliling(){
    double keliling = 2*Math.PI*jari;
    return keliling;
  }
}
public class Asersi2 {
  public static void main(String[] args) {
    double jari = 0;
    assert(jari>0) : "Jari-jari tidak boleh nol!!!";
    Lingkaran l = new Lingkaran(jari);
    double kelilingLingkaran = l.hitungKeliling();
    System.out.println("Keliling lingkaran: " + kelilingLingkaran);
  }
}
