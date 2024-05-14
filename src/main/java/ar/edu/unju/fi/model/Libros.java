/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unju.fi.model;

/**
 *
 * @author 54381
 */
public class Libros {
    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private long cantidadCopias;

    public Libros(){
        
    }
    
    public Libros(Long id, String titulo, String autor, String genero, long cantidadCopias) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.cantidadCopias = cantidadCopias;
    }

    
    @Override
    public String toString() {
        return "Libros{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", cantidadCopias=" + cantidadCopias + '}';
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public long getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(long cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }
    
    
}
