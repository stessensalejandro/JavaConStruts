/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;



import Forms.NombreForm;
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
public class BorrarPorEquipoAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
               String ruta = this.getServlet().getServletConfig().getServletContext().getRealPath("/");
        TablaEquipos te=new TablaEquipos();
        ArrayList<Equipo> Lista=new ArrayList<>();
        
       
        
        
        Lista=te.abroParaEscribir(ruta);
        
        NombreForm efo = (NombreForm)form;
       
               
        
        String nombre=efo.getName();
       
        System.out.println("el nombre que capturo es: "+nombre);
            
        
        te.eliminarPorNombre(ruta, Lista,nombre);

        
        getServlet().getServletContext().setAttribute("li",Lista);
        
                
                
       
        
        return mapping.findForward(SUCCESS);
    }
}
