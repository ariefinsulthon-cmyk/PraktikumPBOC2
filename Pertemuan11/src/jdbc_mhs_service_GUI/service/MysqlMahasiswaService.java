package jdbc_mhs_service_GUI.service;

import jdbc_mhs_service_GUI.model.Mahasiswa;
import jdbc_mhs_service_GUI.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (nama) VALUES (?)";

        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();

            System.out.println("Data berhasil ditambahkan");
        } catch (SQLException e) {
            System.out.println("Gagal add: " + e.getMessage());
        }
    }

    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Data berhasil diupdate");
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }

    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement s = koneksi.createStatement();
             ResultSet rs = s.executeQuery(sql)) {
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return list;
    }
    
    public void indexReset() {
        String sqlTruncate = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try (Statement s = koneksi.createStatement()) {
            s.executeUpdate(sqlTruncate);
            System.out.println("Index berhasil direset ke 1");
        } catch (SQLException e) {
            System.out.println("Gagal indexReset: " + e.getMessage());
        }
    }
    
    public boolean isEmpty() {
        String sql = "SELECT COUNT(*) FROM mahasiswa";
        try (Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(sql)) {
        if (rs.next()) {
            int count = rs.getInt(1);
            return count == 0;
        }
    } catch (SQLException e) {
        System.out.println("Gagal isEmpty: " + e.getMessage());
    }
        return true;
    }
    
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi berhasil ditutup");
            }
        } catch (SQLException e) {
            System.out.println("Gagal closeConnection: " + e.getMessage());
        }
    }
}