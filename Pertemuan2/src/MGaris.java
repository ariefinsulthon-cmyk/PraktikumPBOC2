/*  Nama File : MGaris.java
    Deskripsi : Berisi atribut dan method dalam class Garis
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 28 Feb 2026 */
public class MGaris {
  public static void main(String[] args) {
    Garis G1 = new Garis();
    G1.printGaris();
    Titik T1 = new Titik(2,3);
    Titik T2 = new Titik(4,6);
    G1 = new Garis(T1,T2);
    G1.printGaris();
    System.out.println(Garis.getCounterGaris());
    G1.setAwal(0,0);
    G1.printGaris();
    G1.setAkhir(5,5);
    G1.printGaris();
    G1.getAwal().printTitik();
    G1.getAkhir().printTitik();
    System.out.println("Panjang Gariss: " + G1.panjangGaris());
    System.out.println("Gradien: " + G1.getGradien());
    System.out.print("Titik Tengah: ");
    G1.titikTengah().printTitik();
    T1.setAbsis(2);
    T1.setOrdinat(2);
    T2.setAbsis(7);
    T2.setOrdinat(7);
    Garis G2 = new Garis(T1,T2);
    G2.printGaris();
    System.out.println("Gradien: " + G2.getGradien());
    System.out.println(G1.isSejajar(G2));
    T1.setAbsis(G1.getAwal().getAbsis()*-1);
    T1.setOrdinat(G1.getAwal().getOrdinat());
    T2.setAbsis(G1.getAkhir().getAbsis()*-1);
    T2.setOrdinat(G1.getAkhir().getOrdinat());
    G2.setAwal(T1.getAbsis(),T1.getOrdinat());
    G2.setAkhir(T2.getAbsis(),T2.getOrdinat());
    G2.printGaris();
    System.out.println("Gradien: " + G2.getGradien());
    System.out.println(G1.isTegakLurus(G2));
    G1.printPersamaan();
  }
}
