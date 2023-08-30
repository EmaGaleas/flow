/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases.cartas;
import java.awt.*;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;


public class logica_tab {
    public JButton[][] matrizButtonsUI;//ACCEDE A LOS BOTONES
    public cartas[][] matrizBotones; //de JButton a Pieza por valores

    public logica_tab() {
        matrizButtonsUI = new JButton[10][10]; 

    } 
    public void GridLayout(JPanel tab) {
        int filas=10;
        int col=10;
        GridLayout gridLayout=new GridLayout(filas, col);
        tab.setLayout(gridLayout);
        matrizBotones=new cartas[filas][col];
        posicionarTablero();
        tab.setOpaque(false);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                final cartas carta=matrizBotones[i][j]; 
                JButton button=new JButton(); //CREAR JBUTTON
                matrizButtonsUI[i][j]=button;
                tab.add(button);
                
                int ancho=(int)(1.4*40);
                int largo=(int)(1.4*40);
                
                button.setPreferredSize(new Dimension(ancho, largo));
                button.setOpaque(false);
                button.setContentAreaFilled(false);
              //button.setBorder(BorderFactory.createLineBorder(Color.black));
     
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mostrarInformacionPieza(carta);
                        ImageIcon prueba=new ImageIcon("src/images/ficha_prueba.png");
                        button.setIcon(prueba);
                    }
                });
              //button.setBackground(Color.black);
            }
        }
    }
    
    private void mostrarInformacionPieza(cartas carta) {
        if (carta!=null) {
            String info="Tipo: "+carta.getTipo()+"\nValor: "+carta.getValor()+"\nPosesion: "+carta.getPosesion()+"\nFila:"+carta.getFila()+"\nColumna: "+carta.getColumna();
                JOptionPane.showMessageDialog(null, info, "Informacion de Carta", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "VALOR AUN NO ASIGNADO", "Informacion de Carta", JOptionPane.INFORMATION_MESSAGE);
            SwingUtilities.invokeLater(() -> {
                ArrayList<ImageIcon> imageIcons = new ArrayList<>();
                imageIcons.add(new ImageIcon("src/images/trasera.png"));
                imageIcons.add(new ImageIcon("src/images/trasera.png"));
                imageIcons.add(new ImageIcon("src/images/trasera.png"));
                imageIcons.add(new ImageIcon("src/images/trasera.png"));
                imageIcons.add(new ImageIcon("src/images/trasera.png"));

                JPanel panel = new JPanel(new GridLayout(0, 1));
                for (ImageIcon i : imageIcons) {
                    JLabel label = new JLabel(i);
                    label.setPreferredSize(new Dimension(i.getIconWidth(), i.getIconHeight()));
                    panel.add(label);
                }

                JScrollPane scrollPane = new JScrollPane(panel);
                JOptionPane.showMessageDialog(
                        null,
                        scrollPane,
                        "PRUEBITA",
                        JOptionPane.PLAIN_MESSAGE
                );
            });
        }
    }
    private void posicionarTablero(){
        //esquinas 
        matrizBotones[0][0]=new cartas("ESQUINA", 0, "NO APLICA",0,0);
        matrizBotones[0][9]=new cartas("ESQUINA", 0, "NO APLICA",0,9);
        matrizBotones[9][0]=new cartas("ESQUINA", 0, "NO APLICA",9,0);
        matrizBotones[9][9]=new cartas("ESQUINA", 0, "NO APLICA",9,9);
 
    }
    //FUNCION RETORNA EL VALOR PARA BUSCAR ESA CARTA 
}
