/* File : OperatorGenerik.java
  Deskripsi : Kelas OperatorGenerik untuk implementasi Generik
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 5 Mei 2026  */
public class OperatorGenerik {
  public static <T> void Tukar(Datum<T> a, Datum<T> b) {
    T temp = a.getIsi();
    a.setIsi(b.getIsi());
    b.setIsi(temp);
  }

  public static <T extends Kucing> double Bobot2(T K1, T K2) {
    return K1.getBobot() + K2.getBobot();
  }
}
