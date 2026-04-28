import java.util.ArrayList;
/* File : InclusionMain.java
  Deskripsi : Program implementasi Inclusion
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 23 April 2026  */

public class InclusionMain {
    public static void main(String[] args) throws Exception {
        Anabul anabul1 = new Anjing("Budi");
        Anabul anabul2 = new Kucing("Apin");
        Anabul anabul3 = new Burung("Alok");

        ArrayList<Anabul> anabul = new ArrayList<>();
        anabul.add(anabul1);
        anabul.add(anabul2);
        anabul.add(anabul3);

        for (Anabul a : anabul) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}

