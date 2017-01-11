/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistentunit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author Jon
 */

@WebListener()
public class EntityServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        PersistenceUnitProxy.init();
        System.err.println("COMIENZA APP");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        PersistenceUnitProxy.close();
        System.err.println("FINALIZA APP");
    }
}
