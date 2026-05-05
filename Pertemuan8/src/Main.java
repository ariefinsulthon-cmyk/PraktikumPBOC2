/* File : Main.java
  Deskripsi : Kelas Main untuk implementasi Generik
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 5 Mei 2026  */
public class Main {

  public static void main(String[] args) {
    //Kelas Generik
    Datum<Anabul> data = new Datum<>(new Kucing("Mimi",3.5));

    data.tampilkanAnabul(data.getIsi());
    System.out.println();

    //METHOD GENERIK

    /* Tukar Anabul */
    System.out.println("Prosedur Tukar");
    Datum<Anabul> hewan1 = new Datum<>(new Kucing("Doraemon", 4.0));
    Datum<Anabul> hewan2 = new Datum<>(new Anjing("Heri"));

    System.out.println("\nSebelum Tukar:");
    hewan1.tampilkanAnabul(hewan1.getIsi());
    System.out.println();
    hewan2.tampilkanAnabul(hewan2.getIsi());

    OperatorGenerik.Tukar(hewan1, hewan2);

    System.out.println("\nSetelah Tukar:");
    hewan1.tampilkanAnabul(hewan1.getIsi());
    System.out.println();
    hewan2.tampilkanAnabul(hewan2.getIsi());

    /* Tukar Integer */
    Datum<Integer> angka1 = new Datum<>(3);
    Datum<Integer> angka2 = new Datum<>(6);

    System.out.println("\nSebelum Tukar:");
    System.out.println("Angka 1: " + angka1.getIsi());
    System.out.println("Angka 2: " + angka2.getIsi());

    OperatorGenerik.Tukar(angka1, angka2);

    System.out.println("\nSetelah Tukar:");
    System.out.println("Angka 1: " + angka1.getIsi());
    System.out.println("Angka 2: " + angka2.getIsi());

    /* Tukar String */
    Datum<String> teks1 = new Datum<>("Hello");
    Datum<String> teks2 = new Datum<>("World");

    System.out.println("\nSebelum Tukar:");
    System.out.println("Teks 1: " + teks1.getIsi());
    System.out.println("Teks 2: " + teks2.getIsi());

    OperatorGenerik.Tukar(teks1, teks2);

    System.out.println("\nSetelah Tukar:");
    System.out.println("Teks 1: " + teks1.getIsi());
    System.out.println("Teks 2: " + teks2.getIsi());

    /* Bobot Turunan Kucing */
    Datum<Anggora> K1 = new Datum<Anggora>(new Anggora("Siti", 4.0));
    Datum<Kembangtelon> K2 = new Datum<Kembangtelon>(new Kembangtelon("Budi", 3.0));

    System.out.println("\nBobot Kucing:");
    System.out.println("Bobot K1: " + K1.getIsi().getBobot());
    System.out.println("Bobot K2: " + K2.getIsi().getBobot());
    System.out.println("Total Bobot: " + OperatorGenerik.Bobot2(K1.getIsi(), K2.getIsi()));

    //LARIK GENERIK
    Data<Anabul> dataAnabul = new Data<>();

    Anabul a1 = new Kucing("Mimi", 3.5);
    Anabul a2 = new Anjing("Heri");
    Anabul a3 = new Burung("Tweety");
    Anabul a4 = new Anggora("Luna", 3.8);
    Anabul a5 = new Kembangtelon("Nina", 2.5);

    dataAnabul.setIsi(1, a1);
    dataAnabul.setIsi(2, a2);
    dataAnabul.setIsi(3, a3);
    dataAnabul.setIsi(4, a4);
    dataAnabul.setIsi(5, a5);

    int size = dataAnabul.getSize();
    System.out.println("\nJumlah Data: " + size);

    System.out.println("\nData Anabul:");
    for (int i = 1; i <= size; i++) {
      System.out.println("Data ke-" + i + ": " + dataAnabul.getIsi(i).getNama());
    }
  }
}
