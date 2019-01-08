/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo.entity;

/**
 *
 * @author aduar
 */
public class Person {
    
    private String nama;
    private String lahir;
    private String jk;
    private String kota;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getLahir() {
        return lahir;
    }

    public String getJk() {
        return jk;
    }

    public String getKota() {
        return kota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }
    
    
    

}