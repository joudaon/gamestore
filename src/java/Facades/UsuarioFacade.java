/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facades;

import entities.UsuarioEntity;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jon
 */

@ManagedBean
@SessionScoped
public class UsuarioFacade extends AbstractFacade<UsuarioEntity>
{

    public UsuarioFacade() {
        super(UsuarioEntity.class);
    }
    public boolean checkUserCreated(String username)
    {
        System.out.println("Comprobando admin registrado...");
        UsuarioEntity entity = find(username);
        System.out.println("USUARIO ->"+entity);
        if(entity==null)
        {
            System.out.println("Usuario no registrado");
            return false;
        }
        else
        {
            System.out.println("Usuario registrado");
            return true;
        }
    }    
}
