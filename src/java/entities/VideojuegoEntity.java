/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Jon
 */

@Entity
public class VideojuegoEntity implements Serializable 
{
    @Id private String nombre;
    private int precio;
    private String estilo;
    private String descripcion;
    @OneToMany List<ComentarioEntity> listacomentario;
    private String urlfoto;
    private String plataforma;
    private String urlvideo;
    
    public VideojuegoEntity() 
    {
    }
    
    public VideojuegoEntity(String nombre, int precio, String estilo, String desc, String urlFoto, String plaforma, String urlvideo){
        this.nombre = nombre;
        this.precio = precio;
        this.estilo = estilo;
        this.descripcion = desc;
        this.urlfoto = urlFoto;
        this.listacomentario = new ArrayList<ComentarioEntity>();
        this.plataforma = plaforma;
        this.urlvideo = urlvideo;

        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the estilo
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * @param estilo the estilo to set
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the listacomentario
     */
    public List<ComentarioEntity> getListacomentario() {
        return listacomentario;
    }

    /**
     * @param listacomentario the listacomentario to set
     */
    public void setListacomentario(List<ComentarioEntity> listacomentario) {
        this.listacomentario = listacomentario;
    }

    /**
     * @return the urlfoto
     */
    public String getUrlfoto() {
        return urlfoto;
    }

    /**
     * @param urlfoto the urlfoto to set
     */
    public void setUrlfoto(String urlfoto) {
        this.urlfoto = urlfoto;
    }

    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * @return the urlvideo
     */
    public String getUrlvideo() {
        return urlvideo;
    }

    /**
     * @param urlvideo the urlvideo to set
     */
    public void setUrlvideo(String urlvideo) {
        this.urlvideo = urlvideo;
    }




    
    
}
