package clases;

public class Repartircartas_tab {

    private Cartas_conf carta[];
    private int posionsigcart;
    public static final int numcarts=104;
    
   
    public Repartircartas_tab() {
    
    this.carta=new Cartas_conf[numcarts]; 
    this.posionsigcart=0;
    
    } 
    
    public void crearbarajear(){
     
     String[] palos=Cartas_conf.TIPO;   
     for(int i=0;i<palos.length;i++ ){
      for(int j=0;j<Cartas_conf.limitecart_palo;j++ ){
      
         
         
     }   
         
         
     }   
        
        
        
    }
 
    //Va devolver una carta
//    public cartas siguienteCarta() {
//
//    }
//    
//    public cartas[] darcartas() {
//
//    }
//    //va adevolver el numero de cartas disponible
//    public int cartasDisponible() {
//
//    }
//   
    public void cartasmonton() {

    }

    public void mostrarbaraja() {

    }

    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

}
