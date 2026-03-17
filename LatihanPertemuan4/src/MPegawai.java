import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        
        System.out.println("<=== DATA PEGAWAI PERGURUAN TINGGI ===>\n");

        // 1. Implementasi Dosen Tetap
        DosenTetap dosen1 = new DosenTetap(
            "198005152010011001", 
            "Dr. Mohammad Sulthon", 
            LocalDate.of(1980, 5, 15), 
            LocalDate.of(2010, 1, 1), 
            5000000, 
            "0015058001", 
            "Fakultas Teknik"
        );
        System.out.println("--- Informasi Dosen Tetap ---");
        dosen1.printInfoDosenTetap();
        System.out.println();

        // 2. Implementasi Dosen Tamu
        DosenTamu dosen2 = new DosenTamu(
            "999001122", 
            "Ariefin M.Sc.", 
            LocalDate.of(1990, 10, 20), 
            LocalDate.of(2023, 8, 1), 
            4000000, 
            "8810209001", 
            "Fakultas Ekonomi", 
            LocalDate.of(2026, 8, 1)
        );
        System.out.println("--- Informasi Dosen Tamu ---");
        dosen2.printInfoDosenTamu();
        System.out.println();

        // 3. Implementasi Tenaga Kependidikan (Tendik)
        Tendik staf1 = new Tendik(
            "198503102015052002", 
            "Siti Aminah", 
            LocalDate.of(1985, 3, 10), 
            LocalDate.of(2015, 5, 12), 
            3500000, 
            "Akademik"
        );
        System.out.println("--- Informasi Tendik ---");
        staf1.printInfoTendik();
        System.out.println();

        System.out.println("=====================================");
    }
}