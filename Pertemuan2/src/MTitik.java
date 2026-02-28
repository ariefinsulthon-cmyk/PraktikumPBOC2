/*  Nama File : MTitik.java
    Deskripsi : Berisi implementasi dari class Titik
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 19 Feb 2026 */

public class MTitik {
        public static void main(String[] args) {
            Titik T1 = new Titik();
            T1.printTitik();
            Titik.getCounterTitik();
            T1 = new Titik(2,0);
            T1.printTitik();
            System.err.println(T1.getAbsis());
            System.err.println(T1.getOrdinat());
            T1.setAbsis(4);
            T1.setOrdinat(6);
            T1.printTitik();
            T1.geser(2,2);
            T1.printTitik();
            System.out.println("Kuadran: " + T1.getKuadran());
            System.out.println("Jarak Ke Pusat: " + T1.getJarakPusat());
            Titik T2 = new Titik(8,8);
            System.out.println("Jarak Ke Titik T2: " + T1.getJarak(T2));
            T1.refleksiX();
            T1.printTitik();
            T1.refleksiY();
            T1.printTitik();
            T1.getRefleksiX().printTitik();
            T1.getRefleksiY().printTitik();
        }
    }
