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
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jon
 */

@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable
{
   private UsuarioEntity usuarioEntity;
   private String userUsernameInserted = "";
   private String userPasswordInserted = "";
   private boolean userLoged = false;

    
   public UsuarioBean()
   {
   }
   
   
   public String closeSession()
   {
       System.out.println("Sesión cerrada");
       return "success";
   }
   
   
   public String createUser()
   {
       UsuarioEntity ue = new UsuarioEntity();
       ue.setNombre(this.userUsernameInserted);
       ue.setPassword(hash256(this.userPasswordInserted));
       UsuarioFacade uf = new UsuarioFacade();
       boolean userFind = uf.checkUserCreated(userUsernameInserted);
       if (!userFind)
       {
           uf.create(ue);
           FacesContext context = FacesContext.getCurrentInstance();
           context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro realizado",  "Te has registrado satisfactoriamente. Por favor vuelve e inicia sesión nuevamente."));
           return "failure";
       }
       boolean userCreated = uf.checkUserCreated(this.userUsernameInserted);
       if (userFind == false && userCreated == true)
       {
            setUsuarioEntity(ue);
            this.setUserLoged(true);
           return "failure";
       }
       else if (userFind)
       {
           FacesContext context = FacesContext.getCurrentInstance();
           context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nombre en uso",  "El nombre de usuario que has introducido ya se encuentra en uso"));
           return "failure";
       }
        return "failure";
   }
   
   public String login()
   {
       System.out.println("hola");
       UsuarioFacade uf = new UsuarioFacade();
       String username = this.getUserUsernameInserted();
       String password = this.getUserPasswordInserted();
       password = hash256(password);
       System.out.println("Username: "+username);
       System.out.println("Password sin encriptar: "+password);
       boolean usuarioRegistrado = uf.checkUserCreated(username);
       boolean passwordCorrecta = checkUserPassword(new UsuarioEntity(username, password));
       if (usuarioRegistrado && passwordCorrecta)
       {
           System.out.println("Usuario Registrado!!!!!!!!!!!!!!!!");
            setUsuarioEntity(uf.find(username));
            this.setUserLoged(true);
           return "success";
       }
       else if (username.trim() != null && usuarioRegistrado)
       {
           System.out.println("Error, datos incorrectos");
           FacesContext context = FacesContext.getCurrentInstance();
           context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",  "Datos incorrectos"));
       }
       else if (username.trim() != null && !usuarioRegistrado)
       {
           FacesContext context = FacesContext.getCurrentInstance();
           context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error",  "El usuario no existe. Registrese por favor."));
       }
    return "failure";
   }
   
       public boolean checkUserPassword(UsuarioEntity ue){
        System.out.println("Comprobando password admin registrado...");
        UsuarioFacade uf = new UsuarioFacade();
        boolean usuarioRegistrado = uf.checkUserCreated(ue.getNombre());
        if(usuarioRegistrado == true)
        {
        System.out.println("USER PASSWORD: "+ue.getPassword());
        UsuarioEntity entity = uf.find(ue.getNombre());
        System.out.println("ENTITY PASSWORD: "+entity.getPassword());
        if(entity.getPassword().equals(ue.getPassword()))
        {
            System.out.println("Contraseña correcta");
            return true;
        }
        else
        {
            System.out.println("Contraseña erronea");
            return false;
        }
        }
        else
            return false;
    }
   
       
    private static String hash256(String data) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(data.getBytes());
            return bytesToHex(md.digest());
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }      
    
    private static String bytesToHex(byte[] bytes) 
    {
        StringBuilder result = new StringBuilder();
        for (byte byt : bytes) result.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));
        return result.toString();
    }
       
   public String prueba()
   {
       System.out.println("LOGIN");
       VideojuegoFacade vf = new VideojuegoFacade();
       vf.create(new VideojuegoEntity("GTAV", 23, "sandbox", "AAA", "http://images6.fanpop.com/image/photos/32700000/GTA5-grand-theft-auto-32732256-410-500.jpg", "PS3", "https://www.youtube.com/watch?v=DoVHAxqlm28"));
       System.out.println("¿Usuario registrado?");
       return "success";
   }
   
   public String prueba1()
   {
       VideojuegoFacade vf = new VideojuegoFacade();
       vf.find("gtav");
       return null;
   }

    /**
     * @return the userUsernameInserted
     */
    public String getUserUsernameInserted() {
        return userUsernameInserted;
    }

    /**
     * @param userUsernameInserted the userUsernameInserted to set
     */
    public void setUserUsernameInserted(String userUsernameInserted) {
        this.userUsernameInserted = userUsernameInserted;
    }

    /**
     * @return the userPasswordInserted
     */
    public String getUserPasswordInserted() {
        return userPasswordInserted;
    }

    /**
     * @param userPasswordInserted the userPasswordInserted to set
     */
    public void setUserPasswordInserted(String userPasswordInserted) {
        this.userPasswordInserted = userPasswordInserted;
    }

    /**
     * @return the usuarioEntity
     */
    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    /**
     * @param usuarioEntity the usuarioEntity to set
     */
    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    /**
     * @return the userLoged
     */
    public boolean isUserLoged() {
        return userLoged;
    }

    /**
     * @param userLoged the userLoged to set
     */
    public void setUserLoged(boolean userLoged) {
        this.userLoged = userLoged;
    }


    
}
