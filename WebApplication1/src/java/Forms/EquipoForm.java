/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Alejandro
 */
public class EquipoForm extends org.apache.struts.action.ActionForm {
    
    private String name;
    
    private String puntos;
    
  private String promedio;

  private String calificaciones;

    public String getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(String calificaciones) {
        this.calificaciones = calificaciones;
    }
  
    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getPromedio() {
        return promedio;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     * @return
     */
    public String getPuntos() {
        return puntos;
    }

    /**
     * @param i
     */
    public void setPuntos(String i) {
        puntos = i;
    }

    /**
     *
     */
    public EquipoForm() {
        super();
        // TODO Auto-generated constructor stub
    }
 public void reset()
     {
         puntos="";
         name="";
     }
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
