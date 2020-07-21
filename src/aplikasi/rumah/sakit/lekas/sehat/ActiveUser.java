/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.rumah.sakit.lekas.sehat;

import java.util.Date;

/**
 *
 * @author dipo
 */
public class ActiveUser {
    
    private int id;
    private String nrm, nama, jenis_kelamin, no_telpon, alamat, email;
    private Date tanggal_lahir;
    
    private static volatile ActiveUser instance;
    
    public ActiveUser(){
        
    }
    
    public static ActiveUser getInstance() {
        if (instance == null) {
            instance = new ActiveUser();
        }
        
        return instance;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNrm() {
        return nrm;
    }
    
    public void setNrm(String nrm) {
        this.nrm = nrm;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJekel() {
        return jenis_kelamin;
    }
    
    public void setJekel(String jekel) {
        this.jenis_kelamin = jekel;
    }
    
    public String getTelpon() {
        return no_telpon;
    }
    
    public void setTelpon(String telpon) {
        this.no_telpon = telpon;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Date getLahir() {
        return tanggal_lahir;
    }
    
    public void setLahir(Date lahir) {
        this.tanggal_lahir = lahir;
    }
}
