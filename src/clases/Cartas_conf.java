/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

 
public class Cartas_conf {
  
  int num,valor;
  String tipo,posesion;
  public static final int limitecart_palo=13;
   public static final int limitetipo_palo=8;
   
  public static final String[] TIPO={"CORAZON","DIAMANTE","PICA","TREBOL"};

    public Cartas_conf(int num, String tipo,int valor) {
        this.num = num;
        this.tipo = tipo;
        this.valor=valor;

    }

    public int getNum() {
        return num;
    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPosesion() {
        return posesion;
    }

    @Override
    public String toString() {
        return "numero=" + num + ", tipo=" + tipo+"valor="+valor;
    }

  
  

    
    
    
    
}
