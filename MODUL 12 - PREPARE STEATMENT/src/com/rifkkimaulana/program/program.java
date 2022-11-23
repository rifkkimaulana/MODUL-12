

package com.rifkkimaulana.program;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author Rifki Maulana
 */

public class program {
//main string
    public static void main(String[] args) {
       
        //connection
    
        Connection koneksi = KoneksiDatabase.getKoneksi();
        PreparedStatement prepare = null;
        
        try {
            String sql="SELECT * FROM barang";
            prepare = koneksi.prepareStatement(sql);
            System.out.println("Prepare statement berhasil dibuat");
            
        } catch(SQLException ex) {
            System.out.println("Prepare steatment gagal dibuat");
            System.out.println("Pesan : " + ex.getMessage());
        } finally {
            
            if (prepare != null){
            try {
                prepare.close();
                System.out.println("Prepare steatment berhasil ditutup");
            } catch (SQLException ex){
                System.out.println("Pesan : " +ex.getMessage());
                
            }
            }
        }
    }  
}
