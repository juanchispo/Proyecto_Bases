/*
 * Panel para poner la imagen del logo de Aventureros
 */
package Modelo.imagenes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Dyl
 */
public class PanelLogo extends JPanel{
    private Image imagen;

    public PanelLogo(String ruta) {
        imagen = new ImageIcon(ruta).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(
            imagen,
            0, 0,
            getWidth(),   // ancho del panel
            getHeight(),  // alto del panel
            this
        );
    }
}
