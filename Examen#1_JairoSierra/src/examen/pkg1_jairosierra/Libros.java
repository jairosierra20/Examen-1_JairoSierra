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
public class Libros {
    private String titulo;
    private String descripcion;
    private String puntaje;
    private String copias;
    private String genero;
    private String valor;
    private String edicion;
    private String autor;
    private Date fecha;

    public Libros() {
    }

    public Libros(String titulo, String descripcion, String puntaje, String copias, String genero, String valor, String edicion, String autor, Date fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copias = copias;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        if(puntaje.equals("1") || puntaje.equals("2") || puntaje.equals("3") || puntaje.equals("4") || puntaje.equals("5")){
        this.puntaje = puntaje;
        }
    }

    public String getCopias() {
        return copias;
    }

    public void setCopias(String copias) {
        this.copias = copias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if(genero.equals("Fantasia") || genero.equals("Romance") || genero.equals("Accion") || genero.equals("Historia")){
        this.genero = genero;
        }
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", puntaje=" + puntaje + ", copias=" + copias + ", genero=" + genero + ", valor=" + valor + ", edicion=" + edicion + ", autor=" + autor + ", fecha de publicacion=" + fecha + '}';
    }
    
}
