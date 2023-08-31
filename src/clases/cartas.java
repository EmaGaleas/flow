/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JButton;


public class cartas extends JButton{
    private String tipo;//corazon,trebol,pica,diamante
    private int valor;//del 1 al 13-- 13 es j con un ojo, 14 es j con 2 ojos
    private String imagePath;//direccion imagen
    private String posesion;//quien la tiene o si hay ficha sobre ella
    private int fila;
    private int columna;

    public cartas(String tipo, int valor, String posesion, int fila, int columna) {
        this.tipo = tipo;
        this.valor = valor;
        this.imagePath = imagePath;
        this.posesion = posesion;
        this.fila = fila;
        this.columna = columna;      
//        if (tipo.equals("ESQUINA") && valor==-1) {
//            this.imagePath = "src/images/esquina.png";
//        }else{
//            this.imagePath = "src/images/trasera.png";
//        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getPosesion() {
        return posesion;
    }

    public void setPosesion(String posesion) {
        this.posesion = posesion;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
}
