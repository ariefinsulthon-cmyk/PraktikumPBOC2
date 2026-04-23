public class Anabul {
  private String nama;

  public Anabul(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  // Method
  public void gerak() {
    System.out.println("Anabul " + nama + " bergerak...");
  }

  public void bersuara() {
    System.out.println("Anabul " + nama + " bersuara...");
  }

}
