/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author joset
 */
public class LogeoDao implements Validar{
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;

    @Override
    public int validar(Logeo log) {
        String sql="Select * from usuarios where usuario=? and contraseña=?";
        
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, log.Usuario);
            ps.setString(2, log.Contra);
            rs=ps.executeQuery();
            while(rs.next()){
                r=r+1;
                log.setUsuario(rs.getString("usuario"));
                log.setContra(rs.getString("contraseña"));
            }
            if(r==1){
                return 1;
            }else{
            return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    } 
    
    
    
    
}
