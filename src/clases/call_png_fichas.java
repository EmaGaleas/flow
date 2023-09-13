/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class call_png_fichas {
        private static final Map<String, ImageIcon> colorFicha = new HashMap<>();

    static {
        colorFicha.put("AZUL",           new ImageIcon("src/images/azul.png"));
        colorFicha.put("AMARILLO",       new ImageIcon("src/images/amarillo.png"));
        colorFicha.put("VERDE",          new ImageIcon("src/images/oliva.png"));
        colorFicha.put("ROJO",           new ImageIcon("src/images/rojo.png"));
        colorFicha.put("AQUA",           new ImageIcon("src/images/aqua.png"));
        colorFicha.put("AZUL ELECTRICO", new ImageIcon("src/images/azul_electrico.png"));
        colorFicha.put("BORGOÑA",        new ImageIcon("src/images/borgoña.png"));
        colorFicha.put("CELESTE",        new ImageIcon("src/images/celeste.png"));
        colorFicha.put("CEREZA",         new ImageIcon("src/images/cereza.png"));
        colorFicha.put("FUSCIA",         new ImageIcon("src/images/fuscia.png"));
        colorFicha.put("LILA",           new ImageIcon("src/images/lila.png"));
        colorFicha.put("LIMA",           new ImageIcon("src/images/lima.png"));
        colorFicha.put("MANGO",          new ImageIcon("src/images/mango.png")); 
        colorFicha.put("MORADO",         new ImageIcon("src/images/morado.png"));
        colorFicha.put("MOSTAZA",        new ImageIcon("src/images/mostaza.png"));
        colorFicha.put("NARANJA",        new ImageIcon("src/images/naranja.png"));
        colorFicha.put("OLIVA",          new ImageIcon("src/images/oliva.png"));
        colorFicha.put("ROSA",           new ImageIcon("src/images/rosa.png"));
        colorFicha.put("TURQUESA",       new ImageIcon("src/images/turquesa.png"));
        colorFicha.put("VINO",           new ImageIcon("src/images/vino.png"));
        colorFicha.put("ZAFIRO",         new ImageIcon("src/images/zafiro.png"));
                
    }

    public static ImageIcon obtenerFicha(String nombreColor) {
        ImageIcon icono = colorFicha.get(nombreColor.toUpperCase());
        if (icono == null) {
            icono = colorFicha.get("MOSTAZA");
        }
        return icono;
    }
    public static ImageIcon imagenTrasera() {
        ImageIcon icono=new ImageIcon("src/images/trasera.png");
        return icono;
    }
}
