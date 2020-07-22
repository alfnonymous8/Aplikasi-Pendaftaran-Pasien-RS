/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.rumah.sakit.lekas.sehat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 *
 * @author dipo
 */
public class HashSHA256 {
    
    public HashSHA256(){
        
    }
    
    public String hashSHA256(String plainteks){
        StringBuilder sb = new StringBuilder();
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashInBytes = md.digest(plainteks.getBytes(StandardCharsets.UTF_8));
            
            for (byte b : hashInBytes){
                sb.append(String.format("%02x", b));
            }
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return sb.toString();
    }
    
}
