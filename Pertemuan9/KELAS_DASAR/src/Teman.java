/* File : Teman.java
  Deskripsi : Kelas Teman untuk implementasi koleksi kelas dasar
  Pembuat   : Mohammad Sulthon Ariefin
  Tanggal   : 7 Mei 2026  */

import java.util.ArrayList;

public class Teman {
    /* Atribut */
    private int nbelm;
    private ArrayList<String> Lnama;

    /* Konstruktor */
    public Teman() {
        nbelm = 0;
        Lnama = new ArrayList<String>();
    }

    /* Selektor */
    //a. getNbelm
    public int getNbelm() {
        return nbelm;
    }

    //b. getNama
    public String getNama(int index) {
        return Lnama.get(index);
    }

    /* Mutator */
    //c. setNama
    public void setNama(int index, String nama) {
        Lnama.set(index, nama);
    }

    /* Method */
    //d. addNama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    //e. delNama
    public void delNama(String nama) {
        //remove menghapus elemen yang ditemukan pertama kali, atau tidak melakukan apa-apa jika tidak ditemukan
        Lnama.remove(nama);
        nbelm--;
    }

    //f. isMember
    public boolean isMember(String nama) {
        //contains mengembalikan true jika elemen ditemukan di list, false jika tidak ditemukan
        return Lnama.contains(nama);
    }

    //g. gantiNama
    public void gantiNama(String nama, String namaBaru){
        //indexOf mengembalikan indeks dari elemen yang ditemukan pertama kali, atau -1 jika tidak ditemukan
        int index = Lnama.indexOf(nama);
        if (index != -1){
            setNama(index,namaBaru);
        }
    }

    //h. countNama
    public int countNama(String nama) {
        int count = 0;
        for(String n : Lnama){
            //equals() mengembalikan true jika dua string sama, mengembalikan false jika berbeda
            if(n.equals(nama)){
                count++;
            }
        }
        return count;
    }

    //i. showTeman
    public void showTeman(){
        if(nbelm == 0){
            System.out.println("Tidak ada teman :(");
        }
        for(String nama : Lnama){
            System.out.println(nama);
        }
    }
}
