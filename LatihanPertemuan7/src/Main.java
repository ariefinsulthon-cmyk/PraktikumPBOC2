public class Main {
  public static void main(String[] args) {
    Civitasakademika D1 = new Dosen("Shifu", "3001");
    Civitasakademika D2 = new Dosen("Fushi", "3002");

    Seminar S1 = new Seminar();

    Civitasakademika M1 = new Mahasiswa("Albert","2001",(Dosen)D1);
    Civitasakademika M2 = new Mahasiswa("Sherlock","2002",(Dosen)D1);
    Civitasakademika M3 = new Mahasiswa("Khrisna","2003",(Dosen)D2);
    Civitasakademika M4 = new Mahasiswa("Genji","2004",(Dosen)D2);
    Civitasakademika M5 = new Mahasiswa("Bluey","2005",(Dosen)D2);
  
    S1.registrasi(D1);
    S1.registrasi(D2);
    S1.registrasi(M1);
    S1.registrasi(M2);
    S1.registrasi(M3);
    S1.registrasi(M4);
    S1.registrasi(M5);

    S1.tampilPeserta();
    System.out.println("Jumlah mahasiswa : " + S1.countMahasiswa());
    System.out.println("Jumlah Peserta : " + S1.countPeserta());
    
    System.out.println();

    System.out.println("Sebelum Data Dosen diubah:");
    ((Mahasiswa)M3).tampilDataMahasiswa();
    ((Mahasiswa)M3).setWali((Dosen)D1);
    System.out.println("\nSetelah Data Dosen diubah:");
    ((Mahasiswa)M3).tampilDataMahasiswa();
  }
    
}
