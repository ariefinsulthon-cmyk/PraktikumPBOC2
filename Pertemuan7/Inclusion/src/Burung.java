public class Burung extends Anabul {
  public Burung(){
    super("");
  }

  public Burung(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println("Burung " + getNama() + " terbang");
  }

  @Override
  public void bersuara() {
    System.out.println("Burung " + getNama() + " berbunyi cuit");
  }
}
