/*  Nama File : Titik.java
    Deskripsi : Berisi atribut dan method dalam class Titik
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 19 Feb 2026 */


    public class Titik {
        private double absis; private double ordinat;   
        private static int CounterTitik = 0;
    
        public Titik(){
            this(0,0);
            CounterTitik++;
        }

        public static int getCounterTitik(){
            return CounterTitik;
        }

        public Titik(double x,double y){
            this.absis = x;
            this.ordinat = y;
            CounterTitik++;
        }
    
        public double getAbsis(){
            return absis;
        }
    
        public double getOrdinat(){
            return ordinat;
        }
    
        public void setAbsis(double x){
            absis = x;
        }
    
        public void setOrdinat(double y){
            ordinat = y;
        }
    
        public void geser(double x,double y){
            absis = absis + x;
            ordinat += x;
        }
    
        public void printTitik(){
            System.out.println("Titik(" + absis + "," + ordinat + ")");
        }

        public double getKuadran(){
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

        public double getJarakPusat(){
            double x = absis*absis;
            double y = ordinat*ordinat;
            return Math.sqrt(x+y);
        }

        public double getJarak(Titik T){
            return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
        }

        public void refleksiX(){
            ordinat *= -1;
        }

        public void refleksiY(){
            absis *= -1;
        }

        
        public Titik getRefleksiX(){
            return new Titik(absis,ordinat*-1);
        }

        public Titik getRefleksiY(){
            return new Titik(absis*-1,ordinat);
        }

        //end class Titik
    }
    
