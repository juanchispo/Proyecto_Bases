/*
 * Clase Abstracta de la que todos los controladores van a heredar
 * 
 */
package Controlador;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/**
 *
 * @author Dyl
 */
public abstract class Controlador implements ActionListener{    
    public void inicializarBotones(Container contenedor) {
        for (Component c : contenedor.getComponents()) {
            if(c instanceof JButton){
                ((JButton) c).addActionListener(this);
            }else if (c instanceof JToggleButton){
                ((JToggleButton) c).addActionListener(this);
            }else if (c instanceof JComboBox){
                ((JComboBox) c).addActionListener(this);
            }else if (c instanceof JRadioButton){
                ((JRadioButton) c).addActionListener(this);
            }else if (c instanceof Container){
                inicializarBotones((Container) c);
            }
        }
    }
    public abstract void iniciar();
}
