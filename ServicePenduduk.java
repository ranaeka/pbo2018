/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo.service;

import tubespbo.entity.Penduduk;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aduar
 */
public interface ServicePenduduk {
    
    public void insertPenduduk(Penduduk m) throws SQLException;
    public void updatePenduduk(Penduduk m) throws SQLException;
    public void deletePenduduk(Penduduk m) throws SQLException;
    public Penduduk getPendudukByNik(String nik) throws SQLException;
    public ArrayList<Penduduk> getPenduduk() throws SQLException;
    
}
