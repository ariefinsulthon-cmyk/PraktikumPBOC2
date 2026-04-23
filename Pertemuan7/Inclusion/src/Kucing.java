public class Kucing extends Anabul {
  public Kucing(){
    super("");
  }

  public Kucing(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println("Kucing " + getNama() + " melata");
  }

  @Override
  public void bersuara() {
    System.out.println("Kucing " + getNama() + " berbunyi meong");
  }
}
