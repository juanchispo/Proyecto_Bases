/*
 * Clase Abstracta de la que todos los controladores van a heredar
 * 
 */
package Controlador;

import java.awt.event.ActionListener;

/**
 *
 * @author Dyl
 */
public abstract class Controlador implements ActionListener{    
    public abstract void inicializarBotones();
    public abstract void iniciar();
}
