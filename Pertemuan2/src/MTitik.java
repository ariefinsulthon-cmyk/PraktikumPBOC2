/*  Nama File : MTitik.java
    Deskripsi : Berisi atribut dan method dalam class Titik
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 19 Feb 2026 */

public class MTitik {
        public static void main(String[] args) {
            Titik T1 = new Titik();
            T1.printTitik();
            T1.geser(3,4);
            T1.printTitik();
            Titik T2 = new Titik(6,8);
            Titik T3 = new Titik();
            T2.printTitik();
            T1.setAbsis(10);
            T1.setOrdinat(10);
            T2.printTitik();
            System.out.println(T1.getKuadran());
            System.out.println(T2.getJarakPusat());
            T2.refleksiX();
            T2.printTitik();
            T2.refleksiY();
            T2.printTitik();
            T1.getRefleksiX().printTitik();
        }
    }
