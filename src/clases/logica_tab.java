/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases.cartas;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class logica_tab {
    public JButton[][] matrizButtonsUI;//ACCEDE A LOS BOTONES
    public cartas[][] matrizBotones; //de JButton a Pieza por valores

    public logica_tab() {
        matrizButtonsUI = new JButton[10][10]; 

    }
    
    public void GridLayout(JPanel tab) {
        int filas = 10;
        int col = 10;
        GridLayout gridLayout = new GridLayout(filas, col);
        tab.setLayout(gridLayout);
        matrizBotones = new cartas[filas][col];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                final cartas carta = matrizBotones[i][j]; 
                JButton button = new JButton(); //CREAR JBUTTON
                matrizButtonsUI[i][j] = button;
//              if (pieza!=null  && pieza.getImagePath() != null && pieza.getImagePath().length() > 0) {
                    ImageIcon icon = new ImageIcon("src/images/corazon/as_corazon.png");
                    button.setIcon(icon);

                tab.add(button);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mostrarInformacionPieza(carta);
                    }
                });
                button.setBackground(Color.black);
            }
        }
    }
    
    private void mostrarInformacionPieza(cartas carta) {
        if (carta!=null) {
            String info="Tipo: "+carta.getTipo()+"\nValor: "+carta.getValor()+"\nPosesion: "+carta.getPosesion()+"\nFila:"+carta.getFila()+"\nColumna: "+carta.getColumna();
                JOptionPane.showMessageDialog(null, info, "Informacion de Carta", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "VALOR AUN NO ASIGNADO", "Informacion de Carta", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
