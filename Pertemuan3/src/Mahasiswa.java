/*  Nama File : Mahasiswa.java
    Deskripsi : Berisi atribut dan method dalam class Mahasiwa
    Pembuat : Mohammad Sulthon Ariefin
    Tanggal : 5 Mar 2026 */

import java.util.ArrayList;

public class Mahasiswa {
  /* ATRIBUT */
  private String nim; 
  private String nama;
  private String prodi;
  ArrayList<MataKuliah> listMatkul;
  private Dosen dosenWali;
  private Kendaraan kendaraan;

  /* Konstruktor */
  public Mahasiswa(){
    this.listMatkul = new ArrayList<>();
  }

  public Mahasiswa(String x,String y,String z){
    nim = x;
    nama = y;
    prodi = z;
  }

  /* Selektor */
  public String getNim(){
    return nim;
  }

  public String getnama(){
    return nama;
  }

  public String getProdi(){
    return prodi;
  }

  public Dosen getDosen(){
    return dosenWali;
  }

  public Kendaraan getKendaraan(){
    return kendaraan;
  }

  /* Mutator */
  public void setNim(String x){
    nim = x;
  }

  public void setNama(String y){
    nama = y;
  }

  public void setProdi(String y){
    prodi = y;
  }

  public void setDosen(Dosen y){
    dosenWali = y;
  }

  public void setKendaraan(Kendaraan y){
    kendaraan = y;
  }

  /* Method */

  /* AddMatkul */
  public void addMatkul(MataKuliah newMatkul){
    listMatkul.add(newMatkul);
  }

   /* getJumlahSKS */
  public int getJumlahSKS(){
    int sks = 0;
    for(int i=0;i<listMatkul.size();i++){
      sks += listMatkul.get(i).getSks();
    }
    return sks;
  }

  /* getJumlahMatkul */
  public int getJumlahMatkul(){
    int M = listMatkul.size();
    return M;
  }

  /* printMhs */
  public void printMhs(){
    System.out.println("NIM: "+nim);
    System.out.println("Nama: "+nama);
    System.out.println("Prodi: "+prodi);
  }

  /* printDetailMhs */
  public void printDetailMhs(){
    System.out.println("NIM: "+nim);
    System.out.println("Nama: "+nama);
    System.out.println("Prodi: "+prodi);
    for(int i=0;i<listMatkul.size();i++){
      System.out.println(listMatkul.get(i).getnama());
    }
    System.out.println("Dosen Wali: "+dosenWali);
    System.out.println("Kendaraan: "+kendaraan);
  }
  //end class Titik
}
    
    

