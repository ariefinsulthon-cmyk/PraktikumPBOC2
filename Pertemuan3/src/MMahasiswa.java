/*  Nama File : MMahasiswa.java
    Deskripsi : Berisi implementasi dari class seputar Mahasiswa
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 5 Mar 2026 */

public class MMahasiswa {
        public static void main(String[] args) {
            /* Dosen */
            Dosen D1 = new Dosen("123","Sulthon","Informatika");
            // System.out.println(D1.getnip()+D1.getnama()+D1.getProdi());
            D1.setNip("124");
            D1.setNama("Ariefin");
            D1.setProdi("Filsafat");
            // System.out.println(D1.getnip()+" "+D1.getnama()+" "+D1.getProdi());

            /* MataKuliah */
            MataKuliah PBO = new MataKuliah();
            MataKuliah MBD = new MataKuliah("MBD","Manajemen Basis Data",3);
            // System.out.println(MBD.getIdMatkul()+MBD.getnama()+MBD.getSks());
            PBO.setidMatkul("PBO");
            PBO.setNama("Pemrograman Berorientasi Objek");
            PBO.setSks(3);
            // System.out.println(PBO.getIdMatkul()+" "+PBO.getnama()+" "+PBO.getSks());

            /* Kendaraan */
            Kendaraan K1 = new Kendaraan();
            K1.setNoPlat("BK1234AB");
            K1.setJenis("Motor");
            // System.out.println("Kendaraan Motor: " + K1.getNoPlat());
            // System.out.println("Jenis Kendaraan: "+ K1.getJenis());
           

            /* Mahasiswa */
            Mahasiswa M1 = new Mahasiswa("079","Haikal","Informatika");
            M1.setDosen(D1);
            M1.setKendaraan(K1);
            M1.addMatkul(MBD);
            M1.addMatkul(PBO);
            M1.printDetailMhs();
            System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
            System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
        }
    }
