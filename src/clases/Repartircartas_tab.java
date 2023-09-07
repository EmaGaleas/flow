package clases;

public class Repartircartas_tab {

    private Cartas_conf carta[];
    private int posionsigcart;
    public static final int numcarts = 104;

    public Repartircartas_tab() {

        this.carta = new Cartas_conf[numcarts];
        this.posionsigcart = 0;
        crearbarajear();
        barajar();
        
    }

    public void crearbarajear() {

        String[] palos = Cartas_conf.TIPO;
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < Cartas_conf.limitecart_palo; j++) {
                
                carta[i *(Cartas_conf.limitecart_palo) + j] = new Cartas_conf(j + 1, palos[i]);
              //  System.out.println("ver que hay en carta"+  carta[i *(Cartas_conf.limitecart_palo) + j] );
          
            }
        }
    }

    public void barajar() {
        int posicionaleatoria = 0;
        Cartas_conf cart;
        for (int i = 0; i < carta.length; i++) {

            posicionaleatoria = generaNumeroEnteroAleatorio(0, 103);
            cart = carta[i];
            carta[i] = carta[posicionaleatoria];
          carta[posicionaleatoria] = cart;
          while(carta[posicionaleatoria] ==null){
            posicionaleatoria = generaNumeroEnteroAleatorio(0, 103);
            cart = carta[i];
            carta[i] = carta[posicionaleatoria];
            carta[posicionaleatoria] = cart;
              
          }
            System.out.println(i+""+ carta[posicionaleatoria]);

        }
    }

//Va devolver una carta
    public Cartas_conf siguienteCarta() {

        Cartas_conf cartas = null;
        if (posionsigcart == numcarts) {
            System.out.println("ya no hay mas cartas barajear otra vez");
        } else {
            cartas = this.carta[posionsigcart++];

        }
        return cartas;

    }

    public Cartas_conf[] darcartas(int numcartas) {
        if (numcartas > numcarts) {
            System.out.println("no hay esa cantidad de cartas");

        } else {
            if (cartasDisponible() < numcarts) {
                System.out.println("No hay suficientes cartas que moestrar");

            } else {
                Cartas_conf[] cartdar = new Cartas_conf[numcarts];
                for (int i = 0; i < cartdar.length; i++) {
                    cartdar[i] = siguienteCarta();
                }
                return cartdar;
            }
        }

        return null;

    }

    //va adevolver el numero de cartas disponible
    public int cartasDisponible() {
        return numcarts - posionsigcart;
    }

    //esta funcion es para mostrar las cartas que ya han salido o si no han salido
    public void cartasmonton() {

        if (cartasDisponible() == numcarts) {
            System.out.println("no se ha sacado ni una carta");
        } else {
            for (int i = 0; i < posionsigcart; i++) {
                System.out.println(carta[i]);
            }
        }

    }

    public void mostrarbaraja() {
        if (cartasDisponible() == 0) {
            System.out.println("ya no quedan mas cartas");
        } else {
            for (int i = posionsigcart; i < carta.length; i++) {
                System.out.println(i+""+carta[i]);
            }
        }

    }

    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

}
