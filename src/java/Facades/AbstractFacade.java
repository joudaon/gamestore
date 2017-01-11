package Facades;

/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

import Persistentunit.PersistenceUnitProxy;
import java.util.List;
import javax.persistence.EntityManager;

/**
*
* @author Ivan Pretel
*/
public class AbstractFacade<T> {

   private Class<T> entityClass;
   private EntityManager em;

   public AbstractFacade(Class<T> entityClass) {
       em = PersistenceUnitProxy.getEntityManagerFactory().createEntityManager();
       this.entityClass = entityClass;
   }
   
   public void create(T entity) {
       System.out.println("Creando entity "+entityClass.getName());
       getEntityManager().getTransaction().begin();
       getEntityManager().persist(entity);
       getEntityManager().getTransaction().commit();
   }
   
   protected EntityManager getEntityManager(){
       return em;
   }
   
   public void edit(T entity) {
       getEntityManager().getTransaction().begin();
       getEntityManager().merge(entity);
       getEntityManager().getTransaction().commit();
   }

   public void remove(T entity) {
       
       getEntityManager().getTransaction().begin();
       getEntityManager().remove(getEntityManager().merge(entity));
       getEntityManager().getTransaction().commit();
   }
   
   public int count() {
       return ((Long) getEntityManager().createQuery("select count(o) from " + entityClass.getSimpleName() + " as o").getSingleResult()).intValue();
   }

   public T find(Object id) {
       return getEntityManager().find(entityClass, id);
   }
   
   public T reference(Object id) {
       return getEntityManager().getReference(entityClass, id);
   }

   public List<T> findAll() {
       return getEntityManager().createQuery("select object(o) from " + entityClass.getSimpleName() + " as o").getResultList();
   }

   public List<T> findRange(int[] range) {
       javax.persistence.Query q = getEntityManager().createQuery("select object(o) from " + entityClass.getSimpleName() + " as o");
       q.setMaxResults(range[1] - range[0]);
       q.setFirstResult(range[0]);
       return q.getResultList();
   }

}