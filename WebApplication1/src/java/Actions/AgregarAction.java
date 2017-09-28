/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import Forms.EquipoForm;
import Logica.Equipo;
import Logica.TablaEquipos;
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
public class AgregarAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    
   private boolean comprobarEntero (String cadena)
{
try
{
float num = Integer.parseInt(cadena);
}
catch (Exception e)
{
return false;
}
return true;

}
    
    
    
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
      
        
        
        
        
        EquipoForm eForm = (EquipoForm)form;
        
        
        
        
        TablaEquipos te=new TablaEquipos();
        
        String ruta = this.getServlet().getServletConfig().getServletContext().getRealPath("/");
        
        ArrayList<Equipo> lista = te.leerEnArchivo(ruta);
        
        String nombre=eForm.getName();
        
         String p=eForm.getPuntos();
        
        int ptos=Integer.parseInt(p);
        
        if ((nombre.equals(" ")==false) && ((ptos>=0) && (ptos<=5)) )
        {
       
        
        if (te.estaEquipo(ruta, lista, nombre))
        {
            
            Equipo e=te.obtenerEquipo(ruta, lista, nombre);
            e.aumentarCalificaciones();
            e.aumentarPtos(ptos);
            System.out.println("le agrego y queda "+e.getPuntos());
            System.out.println("la cantidad de calificaciones es: "+e.getCalificaciones());
            float promedio=(e.getPuntos())/(e.getCalificaciones());
            System.out.println("el promedio: "+promedio);
            e.setPromedio(promedio);
            te.escribirEnArchivo(ruta, lista);
        }
        else
        {   
        Equipo eq =new Equipo();
      
        eq.setNombre(nombre);
        eq.setPuntos(ptos);
        eq.setId(lista.size());
        eq.setPromedio(ptos);
       
            
        lista.add(eq);
        te.escribirEnArchivo(ruta, lista);
        
        }
        getServlet().getServletContext().setAttribute("li", lista);
        }
        return mapping.findForward(SUCCESS);
}
}