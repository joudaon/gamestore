/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagerBeans;

import Facades.UsuarioFacade;
import Facades.VideojuegoFacade;
import entities.UsuarioEntity;
import entities.VideojuegoEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jon
 */
@ManagedBean
@SessionScoped
public class VideojuegoBean 
{
//    @ManagedProperty("#{UsuarioBean}")
//    private UsuarioBean usuariobean;
    
    private List<VideojuegoEntity> listavideojuegos = new ArrayList<VideojuegoEntity>();
    private VideojuegoEntity ve;
    private UsuarioEntity ue;
    
    private int preciototal=0;
    private int contador=0;
    
    /**
     * Creates a new instance of videojuegoBean
     */
    public VideojuegoBean() 
    {
        System.out.println("constructor videojuegobean llamado");
        VideojuegoFacade vf = new VideojuegoFacade();
        listavideojuegos = vf.findAll();
    }
    
    public String comprayvaciolista(String nombreusuario)
    {
        UsuarioFacade uf = new UsuarioFacade();
        setUe(uf.find(nombreusuario));
        if (getUe().getListavideojuegos().isEmpty())
        {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "No has seleccionado ningún juego", "Selecciona un juego al menos para proceder con la compra"));
        }
        else
        {
            getUe().eliminarlista();
            uf.edit(getUe());
            //Para depurar en consola
            System.out.println("El usuario "+getUe().getNombre()+" tiene los siguientes videojuegos: "+ getUe().getListavideojuegos().toString());
            //redirigir el usuario a singlegame
            ExternalContext context1 = FacesContext.getCurrentInstance().getExternalContext();
            try {
                setContador(0);
                setPreciototal(0);
                context1.redirect(context1.getRequestContextPath() + "/comprarealizada.xhtml");
                //Mostrar PopUp
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Compra Realizada",  "Gracias"));
            } catch (IOException ex) {
              Logger.getLogger(VideojuegoBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    //Al pulsar añadir al carrito en singlegame.xhtml se añade el videojuego al usuario. La lista videojuegousuairo se actualiza con el juego seleccionado
    public String añadiralcarrito(String nombreusuario, String nombrevideojuego)
    {
        VideojuegoFacade vf = new VideojuegoFacade();
        this.setVe(vf.find(nombrevideojuego));
        System.out.println("Nombre videojuego para carrito: " + ve.getNombre());
        System.out.println("Descripcion videojuego para carrito: " + ve.getDescripcion());
        UsuarioFacade uf = new UsuarioFacade();
        setUe(uf.find(nombreusuario));
        getUe().añadirJuego(this.getVe());
        System.out.println("El usuario "+getUe().getNombre()+" tiene los siguientes videojuegos: "+ getUe().getListavideojuegos().toString());
        uf.edit(getUe());
        setContador(getContador() + 1);
        //Mostrar PopUp
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Añadido",  "Su juego ha sido añadido al carrito de compra"));
        return null;
    }
    

    //Al seleccionar un juego en index, se cargan los detalles de dicho juego en singlegame.xhtml
    public String cargarDetallesVideojuegos(String nombrevideojuego) 
    {
        System.out.println("El Bean ha recibido el nombre del videojuego: "+nombrevideojuego);
        VideojuegoFacade vf = new VideojuegoFacade();
        this.setVe(vf.find(nombrevideojuego));
        //redirigir el usuario a singlegame
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        try {
            context.redirect(context.getRequestContextPath() + "/singlegame.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(VideojuegoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @return the listavideojuegos
     */
    public List<VideojuegoEntity> getListavideojuegos() {
        return listavideojuegos;
    }

    /**
     * @param listavideojuegos the listavideojuegos to set
     */
    public void setListavideojuegos(List<VideojuegoEntity> listavideojuegos) {
        this.listavideojuegos = listavideojuegos;
    }

    /**
     * @return the ve
     */
    public VideojuegoEntity getVe() {
        return ve;
    }

    /**
     * @param ve the ve to set
     */
    public void setVe(VideojuegoEntity ve) {
        this.ve = ve;
    }

    /**
     * @return the ue
     */
    public UsuarioEntity getUe() {
        return ue;
    }

    /**
     * @param ue the ue to set
     */
    public void setUe(UsuarioEntity ue) {
        this.ue = ue;
    }

    /**
     * @return the preciototal
     */
    public int getPreciototal() 
    {
        for (int i=0;i<ue.getListavideojuegos().size();i++)
        {
            preciototal += ue.getListavideojuegos().get(i).getPrecio();
        }
        return preciototal;
    }

    /**
     * @param preciototal the preciototal to set
     */
    public void setPreciototal(int preciototal) {
        this.preciototal = preciototal;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
