/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagerBeans;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Jon
 */
@ManagedBean
public class FileDownloadView {

    private DefaultStreamedContent download;

public void setDownload(DefaultStreamedContent download) {
    this.download = download;
}

public DefaultStreamedContent getDownload() throws Exception {
    System.out.println("GET = " + download.getName());
    return download;
}

public void prepDownload() throws Exception {
    File file = new File("C:\\Users\\Jon\\Documents\\NetBeansProjects\\gamestore\\web\\resources\\condiciones_terminos.pdf");
    InputStream input = new FileInputStream(file);
    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    setDownload(new DefaultStreamedContent(input, externalContext.getMimeType(file.getName()), file.getName()));
    System.out.println("PREP = " + download.getName());
}

}