/*  Nama File : Dosen.java
    Deskripsi : Berisi atribut dan method dalam class Dosen
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 5 Mar 2026 */

    
    public class Dosen {
        /* ATRIBUT */
        private String nip; 
        private String nama;
        private String prodi;
    
        /* Konstruktor */
        public Dosen(){
            nip = "";
            nama = "";
            prodi = "";
        }

        public Dosen(String x,String y,String z){
            nip = x;
            nama = y;
            prodi = z;
        }
    
        /* Selektor */
        public String getnip(){
            return nip;
        }
    
        public String getnama(){
            return nama;
        }

        public String getProdi(){
            return prodi;
        }
    
        /* Mutator */
        public void setNip(String x){
            nip = x;
        }
    
        public void setNama(String y){
            nama = y;
        }

        public void setProdi(String y){
            prodi = y;
        }
        //end class Titik
    }
    
