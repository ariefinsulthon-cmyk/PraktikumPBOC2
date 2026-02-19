/*  Nama File : Titik.java
    Deskripsi : Berisi atribut dan method dalam class Titik
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 19 Feb 2026 */


    public class Titik {
        double absis; double ordinat;
    
        Titik(){
            absis = 0;
            ordinat= 0;
        }
    
        double getAbsis(){
            return absis;
        }
    
        double getOrniat(){
            return ordinat;
        }
    
        void setAbsis(double x){
            absis = x;
        }
    
        void setOrdinat(double y){
            ordinat = y;
        }
    
        void geser(double x,double y){
            absis = absis + x;
            ordinat += x;
        }
    
        void printTitik(){
            System.out.println("Titik(" + absis + "," + ordinat + ")");
        }
        //end class Titik
    }
    
