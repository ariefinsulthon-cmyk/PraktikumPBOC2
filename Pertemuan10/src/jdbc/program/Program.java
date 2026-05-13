/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    public static void displayAll(){
        System.out.println("--- Daftar Mahasiswa Saat Ini ---");
        List<Mahasiswa> list = service.getAll();
        for(Mahasiswa mhs : list){
            System.out.println(mhs);
        }
        System.out.println("---------------------------------");
    }
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        System.out.println("");

        // insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
}