/*
 * Clase para que Cliente y Conductor Hereden y asi tratar de forma sencilla sus
 * Telefonos
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Dyl
 */
public abstract class Persona {
    protected int id;
    protected String direccion;
    protected Nacionalidad nacionalidad;
    protected Genero genero;
    protected String nombre;
    protected ArrayList<String> telefonos;

    public Persona(int id, String direccion, Nacionalidad nacionalidad, Genero genero, String nombre, ArrayList<String> telefonos) {
        this.id = id;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.nombre = nombre;
        this.telefonos = telefonos;
    }
    
    public Persona() {
        this.id = 0;
        this.direccion = "";
        this.nacionalidad = new Nacionalidad();
        this.genero = new Genero(0, "");
        this.nombre = "";
        this.telefonos = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    
    public abstract Object[] getDatos();
    
}
