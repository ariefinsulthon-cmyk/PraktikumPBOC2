public class Anjing extends Anabul {
  public Anjing(){
    super("");
  }

  public Anjing(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println("Anjing " + getNama() + " melata");
  }

  @Override
  public void bersuara() {
    System.out.println("Anjing " + getNama() + " bersuara guk-guk");
  }
}
