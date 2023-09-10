package clases;

import java.util.ArrayList;
import java.util.List;

public class Repartircartas_tab {

    private Cartas_conf carta[];
    private int posionsigcart;
    private int contdiamanete = 0, conttrebol = 0;
    public static final int numcarts = 104;

    public Repartircartas_tab() {

        this.carta = new Cartas_conf[numcarts];
        this.posionsigcart = 0;
       crearbarajear();
       barajar();

    }

    public void crearbarajear() {
        int valorcarta = 1;
        int valor;
        int conttemp=0;
        String[] palos = Cartas_conf.TIPO;
         for (int mazo = 0; mazo < 2; mazo++) {
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < Cartas_conf.limitecart_palo; j++) {

                int posicionaleatoria = generaNumeroEnteroAleatorio(0, 3);
               
                carta[mazo*52+i * (Cartas_conf.limitecart_palo) + j] = new Cartas_conf(j + 1, palos[i], valorcarta++);
               if(valorcarta==14){
                   valorcarta=1;
               }
               // System.out.println((conttemp++)+""+carta[i * (Cartas_conf.limitecart_palo) + j]);
//                  System.out.println((conttemp++)+" ver que hay en carta "+  carta[i *(Cartas_conf.limitecart_palo) + j] );

            }
        }
    }
     for(int i = 0; i < carta.length; i++){
     if(carta[i].getValor()==13&&carta[i].getTipo().equals("DIAMANTE")||carta[i].getValor()==13&&carta[i].getTipo().equals("TREBOL")){
        
        carta[i].setValor(14);
        
     }   
        //System.out.println(""+carta[i]);
    }
         
         
    }

    public void barajar() {
     
        int posicionaleatoria = 0,numrandom;
        Cartas_conf cart;
        for (int i = 0; i < carta.length; i++) {
          
            posicionaleatoria = generaNumeroEnteroAleatorio(0, 103);
            while(carta[i].getTipo().equals(carta[posicionaleatoria].getTipo())){
              posicionaleatoria = generaNumeroEnteroAleatorio(0, 103);
             
            }
           
            cart = carta[i];

            carta[i] = carta[posicionaleatoria];
            carta[posicionaleatoria] = cart;
            //System.out.println(i + "" + carta[posicionaleatoria]);

        }
         Cartas_conf cart2;
        for (int i = 0; i < carta.length; i++) {
          
            posicionaleatoria = generaNumeroEnteroAleatorio(0, 103);
            while(carta[i].getTipo().equals(carta[posicionaleatoria].getTipo())){
              posicionaleatoria = generaNumeroEnteroAleatorio(0, 103);
             
            }
           
            cart2 = carta[i];

            carta[i] = carta[posicionaleatoria];
            carta[posicionaleatoria] = cart2;
         
           // System.out.println(i + "" + carta[posicionaleatoria]);

        }

    }

//Va devolver una carta
    public Cartas_conf siguienteCarta() {

        Cartas_conf cartas = null;
        if (posionsigcart == numcarts) {
            System.out.println("ya no hay mas cartas barajear otra vez");
            return null;
        } else {
            cartas = this.carta[posionsigcart++];
        }
        System.out.println("cartas dar" + cartas);
        return cartas;
    }

    public Cartas_conf[] darcartas(int numcartas) {
        if (numcartas > numcartas) {
            System.out.println("no hay esa cantidad de cartas");
         
        } else {
            if (cartasDisponible() < numcartas) {
                System.out.println("No hay suficientes cartas que mostrar");

            } else {
                Cartas_conf[] cartdar = new Cartas_conf[numcartas];
                for (int i = 0; i < cartdar.length; i++) {
                    cartdar[i] = siguienteCarta();
                  //  System.out.println(" Siguiente carta"+ cartdar[i]);
                }
               
                return cartdar;
            }
        }

        return null;
     
    }

    //va adevolver el numero de cartas disponible
    public int cartasDisponible() {
        
        int cartasdisponibles=numcarts - posionsigcart;
        System.out.println("cartasdisponibles"+cartasdisponibles);
        return cartasdisponibles;
        
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
                System.out.println(i + "" + carta[i]);
            }
        }

    }

    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

}
