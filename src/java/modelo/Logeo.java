/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joset
 */
public class Logeo {
    int id;
    String Usuario;
    String Contra;

    public Logeo() {
    }

    public Logeo(int id, String usuario, String Contra) {
        this.id = id;
        this.Usuario = usuario;
        this.Contra = Contra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }
    
    
   
}
    

