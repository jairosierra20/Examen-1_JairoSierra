/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_jairosierra;

import java.util.Date;

/**
 *
 * @author Jairo Sierra
 */
public class Usuario {

    private String nombre_usa;
    private String contrasena;
    private Date fecha;
    private String telefonico;
    private String electronico;
    private String nombre_com;
    private String genero;

    public Usuario() {
    }

    public Usuario(String nombre_usa, String contrasena, Date fecha, String telefonico, String electronico, String nombre_com, String genero) {
        this.nombre_usa = nombre_usa;
        this.contrasena = contrasena;
        this.fecha = fecha;
        this.telefonico = telefonico;
        this.electronico = electronico;
        this.nombre_com = nombre_com;
        this.genero = genero;
    }

    public String getNombre_usa() {
        return nombre_usa;
    }

    public void setNombre_usa(String nombre_usa) {
        this.nombre_usa = nombre_usa;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefonico() {
        return telefonico;
    }

    public void setTelefonico(String telefonico) {
        this.telefonico = telefonico;
    }

    public String getElectronico() {
        return electronico;
    }

    public void setElectronico(String electronico) {
        this.electronico = electronico;
    }

    public String getNombre_com() {
        return nombre_com;
    }

    public void setNombre_com(String nombre_com) {
        this.nombre_com = nombre_com;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre usario=" + nombre_usa + ", contraseña=" + contrasena + ", fecha de nacimiento=" + fecha + ", telefonico=" + telefonico + ", correo electronico=" + electronico + ", nombre completo=" + nombre_com + ", genero=" + genero + '}';
    }

}
