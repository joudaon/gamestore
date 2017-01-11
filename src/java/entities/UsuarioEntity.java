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
public class UsuarioEntity implements Serializable 
{
    
    
    @Id private String nombre;
    private String password;
    @OneToMany List <VideojuegoEntity> listavideojuegos;
    
    public UsuarioEntity()
    {
    
    }
    
    public UsuarioEntity(String nombre, String password)
    {
        super();
        this.nombre=nombre;
        this.password=password;
        listavideojuegos = new ArrayList<VideojuegoEntity>();
    }
   
    /**
     * Añadimos un nuevo videojuegoentity a la lista del usuario
     * @param ve
     */
    public void añadirJuego(VideojuegoEntity ve)
    {
        this.listavideojuegos.add(ve);
    }
    
    /**
     * Tras realizar la compra vaciamos la lista de videojuegos del usuario
     */
    public void eliminarlista()
    {
        listavideojuegos.clear();
    }

    /**
     * @return the listavideojuegos
     */
    public List <VideojuegoEntity> getListavideojuegos() {
        return listavideojuegos;
    }

    /**
     * @param listavideojuegos the listavideojuegos to set
     */
    public void setListavideojuegos(List <VideojuegoEntity> listavideojuegos) {
        this.listavideojuegos = listavideojuegos;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
}
