/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

 
public class Cartas_conf {
    
  private int num;
  private String tipo;
  public static final int limitecart_palo=12; 
  public static final String[] TIPO={"CORAZON","DIAMANTE","PICA","TREBOL"};

    public Cartas_conf(int num, String tipo) {
        this.num = num;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "numero=" + num + ", tipo=" + tipo;
    }

  
  

    
    
    
    
}
