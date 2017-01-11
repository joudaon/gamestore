/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagerBeans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

/**
 *
 * @author Jon
 */

@ManagedBean
@SessionScoped
public class MapBean implements Serializable
{
    private MapModel model;
    
    public MapBean()
    {
        model = new DefaultMapModel();
        model.addOverlay(new Marker(new LatLng(43.271247, -2.93856), "Universidad de Deusto"));
    }
    
    public MapModel getModel()
    {
        return this.model;
    }
    
    public void onMarkerSelect (OverlaySelectEvent event)
    {
        Marker selectedMarker = (Marker) event.getOverlay();
    }
    
}
