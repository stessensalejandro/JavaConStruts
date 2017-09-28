package Logica;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.lang.ClassCastException;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TablaEquipos implements Serializable{


    public TablaEquipos() {
        
    }


//
public void escribirEnArchivo(String ruta,ArrayList<Equipo> Lista){

    try{
      XMLEncoder e = new XMLEncoder(
                          new BufferedOutputStream(
                              new FileOutputStream(ruta+"e.xml")));
       e.writeObject(Lista);
       e.close();
       
    }
      catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
//
public ArrayList<Equipo> abroParaEscribir(String ruta)
{

        try {
            ArrayList<Equipo> lista1=leerEnArchivo(ruta);
            escribirEnArchivo(ruta,lista1);
            return lista1;
        } catch (IOException ex) {
            Logger.getLogger(TablaEquipos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TablaEquipos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
       
}    
      

  
        
//
     
    public  ArrayList<Equipo> leerEnArchivo(String ruta)throws  IOException, ClassNotFoundException{

    
       ArrayList<Equipo> lista=new ArrayList<Equipo>();
       try{
           try (XMLDecoder d = new XMLDecoder(
                   new BufferedInputStream(
                           new FileInputStream(ruta+"e.xml")))) {
               lista=(ArrayList<Equipo>) d.readObject();
           }
     

        }
     catch (FileNotFoundException | ClassCastException e) {
		}
               

     return lista;
    

    }
    
 
    
     
//    
public void eliminarPorNombre(String ruta,ArrayList<Equipo> Lista, String n){
    try{
      XMLEncoder enc = new XMLEncoder(
                          new BufferedOutputStream(
                              new FileOutputStream(ruta+"e.xml")));
      
      int i=0;
      boolean borre=false;
      while (i<Lista.size() && !borre) 
      {
          if (Lista.get(i).getNombre().equals(n))
      
              borre=true;
          else 
              i++;
      }
      if (borre)
               Lista.remove(i);
      
       enc.writeObject(Lista);
       enc.close();
       
    }
      catch (FileNotFoundException f) {
		}
    
}
//
public boolean estaEquipo(String ruta,ArrayList<Equipo> Lista,String nombre)
{
     int i=0;
      boolean encontre=false;
      while (i<Lista.size() && !encontre) 
      {
          if (Lista.get(i).getNombre().equals(nombre))
      
              encontre=true;
          else 
              i++;
      }
      return encontre;
     
}
//
public Equipo obtenerEquipo(String ruta,ArrayList<Equipo> Lista,String nombre)
{
     int i=0;
      boolean encontre=false;
      while (i<Lista.size() && !encontre) 
      {
          if (Lista.get(i).getNombre().equals(nombre))
      
              encontre=true;
          else 
              i++;
      }
      return Lista.get(i);
     
    
}



  
  }



