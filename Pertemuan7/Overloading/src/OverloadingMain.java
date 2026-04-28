/* File : OverloadingMain.java
  Deskripsi : Kelas Main untuk implementasi Overloading
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 23 April 2026  */
  
public class OverloadingMain {
    public static void main(String[] args) {

        // Konstruktor Tanpa Parameter
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.printInfo(mhs1);

        // Konstruktor dengan Parameter
        Mahasiswa mhs2 = new Mahasiswa("67890", "John Doe", "Teknik Informatika");
        mhs2.printInfo(mhs2);

        // Mutator
        mhs1.setNim("12345");
        mhs1.setNama("Sherlock Holmes");
        mhs1.setProgramStudi("Perikanan");

        // Selektor
        System.out.println("NIM: " + mhs1.getNim());
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Program Studi: " + mhs1.getProgramStudi());

        // Konstruktor Kloning
        Mahasiswa mhs3 = new Mahasiswa(mhs2);
        mhs3.printInfo(mhs3);
    }
}

