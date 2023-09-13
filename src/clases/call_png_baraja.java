
package clases;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
public class call_png_baraja {

     private static final Map<String, ImageIcon> carta = new HashMap<>();//debe recibir algo como DIAMANTE2
    
    static{
         carta.put("ESQUINAS",           new ImageIcon("src/images/esquinas.png"));
         //pendiente de instanciar corazon
         carta.put("CORAZON1",            new ImageIcon("src/images/corazon/as_corazon.png"));
         carta.put("CORAZON2",            new ImageIcon("src/images/corazon/2_corazon.png"));
         carta.put("CORAZON3",            new ImageIcon("src/images/corazon/3_corazon.png"));
         carta.put("CORAZON4",            new ImageIcon("src/images/corazon/4_corazon.png"));
         carta.put("CORAZON5",            new ImageIcon("src/images/corazon/5_corazon.png"));
         carta.put("CORAZON6",            new ImageIcon("src/images/corazon/6_corazon.png"));
         carta.put("CORAZON7",            new ImageIcon("src/images/corazon/7_corazon.png"));
         carta.put("CORAZON8",            new ImageIcon("src/images/corazon/8_corazon.png"));
         carta.put("CORAZON9",            new ImageIcon("src/images/corazon/9_corazon.png"));
         carta.put("CORAZON10",           new ImageIcon("src/images/corazon/10_corazon.png"));
         carta.put("CORAZON11",           new ImageIcon("src/images/corazon/q_corazon.png"));
         carta.put("CORAZON12",           new ImageIcon("src/images/corazon/k_corazon.png"));
         carta.put("CORAZON13",           new ImageIcon("src/images/corazon/j_corazon.png"));
         //pendiente de instanciar diamante
         carta.put("DIAMANTE1",           new ImageIcon("src/images/diamante/as_diamante.png"));
         carta.put("DIAMANTE2",           new ImageIcon("src/images/diamante/2_diamante.png"));
         carta.put("DIAMANTE3",           new ImageIcon("src/images/diamante/3_diamante.png"));
         carta.put("DIAMANTE4",           new ImageIcon("src/images/diamante/4_diamante.png"));
         carta.put("DIAMANTE5",           new ImageIcon("src/images/diamante/5_diamante.png"));
         carta.put("DIAMANTE6",           new ImageIcon("src/images/diamante/6_diamante.png"));
         carta.put("DIAMANTE7",           new ImageIcon("src/images/diamante/7_diamante.png"));
         carta.put("DIAMANTE8",           new ImageIcon("src/images/diamante/8_diamante.png"));
         carta.put("DIAMANTE9",           new ImageIcon("src/images/diamante/9_diamante.png"));
         carta.put("DIAMANTE10",          new ImageIcon("src/images/diamante/10_diamante.png"));
         carta.put("DIAMANTE11",          new ImageIcon("src/images/diamante/q_diamante.png"));
         carta.put("DIAMANTE12",          new ImageIcon("src/images/diamante/k_diamante.png"));
         carta.put("DIAMANTE14",          new ImageIcon("src/images/diamante/j_diamante.png"));
         //pendiente de instanciar pica
         carta.put("PICA1",               new ImageIcon("src/images/pica/as_pica.png"));
         carta.put("PICA2",               new ImageIcon("src/images/pica/2_pica.png"));
         carta.put("PICA3",               new ImageIcon("src/images/pica/3_pica.png"));
         carta.put("PICA4",               new ImageIcon("src/images/pica/4_pica.png"));
         carta.put("PICA5",               new ImageIcon("src/images/pica/5_pica.png"));
         carta.put("PICA6",               new ImageIcon("src/images/pica/6_pica.png"));
         carta.put("PICA7",               new ImageIcon("src/images/pica/7_pica.png"));
         carta.put("PICA8",               new ImageIcon("src/images/pica/8_pica.png"));
         carta.put("PICA9",               new ImageIcon("src/images/pica/9_pica.png"));
         carta.put("PICA10",              new ImageIcon("src/images/pica/10_pica.png"));
         carta.put("PICA11",              new ImageIcon("src/images/pica/q_pica.png"));
         carta.put("PICA12",              new ImageIcon("src/images/pica/k_pica.png"));
         carta.put("PICA13",              new ImageIcon("src/images/pica/j_pica.png"));
         //pendiente de instanciar trebol
         carta.put("TREBOL1",             new ImageIcon("src/images/trebol/as_trebol.png"));
         carta.put("TREBOL2",             new ImageIcon("src/images/trebol/2_trebol.png"));
         carta.put("TREBOL3",             new ImageIcon("src/images/trebol/3_trebol.png"));
         carta.put("TREBOL4",             new ImageIcon("src/images/trebol/4_trebol.png"));
         carta.put("TREBOL5",             new ImageIcon("src/images/trebol/5_trebol.png"));
         carta.put("TREBOL6",             new ImageIcon("src/images/trebol/6_trebol.png"));
         carta.put("TREBOL7",             new ImageIcon("src/images/trebol/7_trebol.png"));
         carta.put("TREBOL8",             new ImageIcon("src/images/trebol/8_trebol.png"));
         carta.put("TREBOL9",             new ImageIcon("src/images/trebol/9_trebol.png"));
         carta.put("TREBOL10",            new ImageIcon("src/images/trebol/10_trebol.png"));
         carta.put("TREBOL11",            new ImageIcon("src/images/trebol/q_trebol.png"));
         carta.put("TREBOL12",            new ImageIcon("src/images/trebol/k_trebol.png"));
         carta.put("TREBOL14",            new ImageIcon("src/images/trebol/j_trebol.png"));
    }
    public static ImageIcon obtenerFicha(String tipoCarta) {
        ImageIcon icono = carta.get(tipoCarta.toUpperCase());
        if (icono == null) {
            icono = carta.get("ESQUINAS");//si hay un error al cargar va a retornar esta
        }
        return icono;
    }
    //codigo trasera
    
   
//codigo esquinas   
    public static ImageIcon imagenEsquinas() {
        ImageIcon icono=new ImageIcon("src/images/esquinas.png");
        return icono;
    }
    public static ImageIcon imagenTrasera() {
        ImageIcon icono=new ImageIcon("src/images/trasera.png");
        return icono;
    }
}