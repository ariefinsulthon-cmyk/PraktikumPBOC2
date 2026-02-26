/*  Nama File : Titik.java
    Deskripsi : Berisi atribut dan method dalam class Titik
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 19 Feb 2026 */


    public class Titik {
        double absis; double ordinat;   
        static int CounterTitik = 0;
    
        public Titik(){
            this(0,0);
            CounterTitik++;
        }

        static int getCounterTitik(){
            return CounterTitik;
        }

        Titik(double x,double y){
            this.absis = x;
            this.ordinat = y;
        }
    
        double getAbsis(){
            return absis;
        }
    
        double getOrdinat(){
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

        double getKuadran(){
            if(absis > 0){
                if(ordinat > 0){
                    return 1;
                }
                return 4;
            }
            else{
                if(ordinat > 0){
                    return 2;
                }
            }
            return 3;
        }

        double getJarakPusat(){
            double x = absis*absis;
            double y = ordinat*ordinat;
            return Math.sqrt(x+y);
        }

        double getJarak(Titik T){
            return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
        }

        void refleksiX(){
            ordinat *= -1;
        }

        void refleksiY(){
            absis *= -1;
        }

        
        Titik getRefleksiX(){
            return new Titik(absis,ordinat*-1);
        }

        Titik getRefleksiY(){
            return new Titik(absis*-1,ordinat);
        }

        //end class Titik
    }
    
