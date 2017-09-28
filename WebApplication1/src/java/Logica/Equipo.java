/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author Alejandro
 */
public class Equipo implements Serializable {
    private static final long serialVersionUID = 8799656478674716638L;
    protected int id;
    protected int calificaciones;
    protected float promedio;

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCalificaciones() {
        return calificaciones;
    }
 
    public int getId() {
        return id;
    }
    protected String nombre;

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.puntos != other.puntos) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    protected int puntos;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Equipo() {
        calificaciones=1;
         }

    
    public void reset()
    {
        nombre="";
        
    }
public int getPuntos()
{
    return puntos;
}

    public String getNombre() {
        return nombre;
    }

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
       
        
    }

   public void aumentarPtos(int i)
   {
       puntos+=i;
   }
   public void aumentarCalificaciones()
   {
       calificaciones++;
   }
}
