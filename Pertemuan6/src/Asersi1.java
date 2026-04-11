/* Nama File : Asersi1.java
    Deskripsi : Main program untuk mengimplementasikan Asersi
    Pembuat   : Mohammad Sulthon Ariefin
    Tanggal   : 26 Mar 2026 */
public class Asersi1 {
    public static void main(String[] args) throws Exception {
        int x=0;
        if(x>0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) :  "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
