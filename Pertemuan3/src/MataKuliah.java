/*  Nama File : MataKuliah.java
    Deskripsi : Berisi atribut dan method dalam class Mata Kuliah
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 5 Mar 2026 */


    public class MataKuliah {
        /* Atribut */
        private String idMatkul; 
        private String nama;
        private int sks;
    
        /* Konstruktor */
        public MataKuliah(){
            idMatkul = "";
            nama = "";
            sks = 0;
        }

        public MataKuliah(String x,String y,int z){
            idMatkul = x;
            nama = y;
            sks = z;
        }
    
        /* Selektor */
        public String getIdMatkul(){
            return idMatkul;
        }
    
        public String getnama(){
            return nama;
        }

        public int getSks(){
            return sks;
        }
    
        /* Mutator */
        void setidMatkul(String x){
            idMatkul = x;
        }
    
        void setNama(String y){
            nama = y;
        }

        void setSks(int y){
            sks = y;
        }
        //end class Titik
    }
    
