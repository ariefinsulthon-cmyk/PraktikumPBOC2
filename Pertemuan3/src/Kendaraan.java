/*  Nama File : Kendaraan.java
    Deskripsi : Berisi atribut dan method dalam class Kendaraan
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 5 Mar 2026 */


    public class Kendaraan {
        /* ATRIBUT */
        private String noPlat; 
        private String jenis;
    
        /* Konstruktor */
        public Kendaraan(){
            noPlat = "";
            jenis = "";
        }

        public Kendaraan(String x,String y){
            noPlat = x;
            jenis = y;
        }
    
        /* Selektor */
        public String getNoPlat(){
            return noPlat;
        }
    
        public String getJenis(){
            return jenis;
        }

    
        /* Mutator */
        public void setNoPlat(String x){
            noPlat = x;
        }
    
        public void setJenis(String y){
            jenis = y;
        }
        //end class Titik
    }
