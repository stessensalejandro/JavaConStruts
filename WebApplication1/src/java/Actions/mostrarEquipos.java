/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import Forms.EquipoForm;
import Logica.Equipo;
import Logica.TablaEquipos;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Alejandro
 */
public class mostrarEquipos extends org.apache.struts.action.Action implements Serializable
{

  private static final String SUCCESS = "success";
    
  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
     
        String loguin= "false";
        ArrayList<Equipo> lista;
        lista = new ArrayList<Equipo>();
         String ruta = this.getServlet().getServletConfig().getServletContext().getRealPath("/");
        TablaEquipos te=new TablaEquipos();
        lista = te.leerEnArchivo(ruta);
        
        getServlet().getServletContext().setAttribute("li", lista);
        
        if ((loguin.equals("false"))){
        request.getSession().setAttribute("logueado", loguin);
        }
        return mapping.findForward(SUCCESS);
    }
}
