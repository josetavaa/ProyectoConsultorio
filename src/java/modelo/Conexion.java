/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author joset
 */
public class Conexion {
    Connection con;



    public Connection getConnection(){
       if(con != null){
			return con;
       }else{
           generareConnection();
           return con;
       }

    }    


private void generareConnection(){
	 try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/consultorio","root","realmadridcf");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
}

    
}
