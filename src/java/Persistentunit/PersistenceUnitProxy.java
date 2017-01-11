/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistentunit;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
*
* @author Jon
*/
public class PersistenceUnitProxy {
   
   private static EntityManagerFactory emf;
   
   static public void init(){
       emf = Persistence.createEntityManagerFactory("gamestore");
   }
   
   static public void close(){
       emf.close();
   }
   
   static public EntityManagerFactory getEntityManagerFactory(){
       return emf;
   }
   
}