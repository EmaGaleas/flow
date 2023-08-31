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
    private call_png_baraja baraja; 
public int s=1;
    public logica_tab() {
        matrizButtonsUI = new JButton[10][10]; 
        baraja = new call_png_baraja(); 
        
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
                         p( button); 
                    }
                });
              //button.setBackground(Color.black);
            }
        }
    }
    private void p(JButton button) {
        if (s % 2==1) {
            button.setIcon(call_png_baraja.imagenFichaAz());
        }else{
            button.setIcon(null);
        }
        s++; 
    }
    private void mostrarInformacionPieza(cartas carta) {
        if (carta!=null) {
            String info="Tipo: "+carta.getTipo()+"\nValor: "+carta.getValor()+"\nPosesion: "+carta.getPosesion()+"\nFila:"+carta.getFila()+"\nColumna: "+carta.getColumna();
                JOptionPane.showMessageDialog(null, info, "Informacion de Carta", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "VALOR AUN NO ASIGNADO", "Informacion de Carta", JOptionPane.INFORMATION_MESSAGE);
            //probar como cuando da eliminar,añadir---poner un boton con icon para seleccionar esa :)
            SwingUtilities.invokeLater(() -> {

                ArrayList<ImageIcon> imageIcons = new ArrayList<>();
                imageIcons.add(call_png_baraja.imagenTrasera());
                imageIcons.add(call_png_baraja.imagenTrasera());

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
        String posesionInicialE="NO APLICA";
        matrizBotones[0][0]=new cartas("ESQUINA", 0, posesionInicialE,0,0);
        matrizBotones[0][9]=new cartas("ESQUINA", 0, posesionInicialE,0,9);
        matrizBotones[9][0]=new cartas("ESQUINA", 0, posesionInicialE,9,0);
        matrizBotones[9][9]=new cartas("ESQUINA", 0, posesionInicialE,9,9);
    //columan 0
        int valorPicaColumna0=9;//columna 0 fila del 1 al 8
        String posesionInicial="NADIE";
        for (int f = 1; f < 9; f++) {
            matrizBotones[f][0]=new cartas("PICA", valorPicaColumna0, posesionInicial,f,0);
            valorPicaColumna0--;//llega hasta 2
        }
    //columna 9
        int valorDiamanteColumna9=6;//columna 9 fila del 1 al 7
        for (int f = 1; f < 8; f++) {
            matrizBotones[f][9]=new cartas("DIAMANTE", valorDiamanteColumna9, posesionInicial,f,9);
            valorDiamanteColumna9++;//llega hasta 2
        }
        matrizBotones[8][9]=new cartas("DIAMANTE", 1, posesionInicial,8,9);
    //fila 9
        int valorTrebolFila9=6;//fila 9 columna 1 al 7
        for (int c = 1; c < 8; c++) {
            matrizBotones[9][c]=new cartas("TREBOL", valorTrebolFila9, posesionInicial,9,c);
            valorTrebolFila9++;//llega hasta 12
        }
        matrizBotones[9][8]=new cartas("TREBOL", 1, posesionInicial,9,8);
    //fila 0 
        int valorDimanteFila0=2;//fila 0 columna  5 al 8
        for (int c = 5; c < 9; c++) {
            matrizBotones[0][c]=new cartas("DIAMANTE", valorDimanteFila0, posesionInicial,0,c);
            valorDimanteFila0++;//llega hasta 5
        }
        matrizBotones[0][1]=new cartas("PICA", 10, posesionInicial,0,1);
        matrizBotones[0][2]=new cartas("PICA", 11, posesionInicial,0,2);
        matrizBotones[0][3]=new cartas("PICA", 12, posesionInicial,0,3);
        matrizBotones[0][4]=new cartas("PICA", 1, posesionInicial,0,4);
    //fila 1
        int valorCorazonFila1=10;//fila 1 columna  1 al 8
        for (int c = 1; c < 9; c++) {
            matrizBotones[1][c]=new cartas("CORAZON", valorCorazonFila1, posesionInicial,1,c);
            valorCorazonFila1--;//llega hasta 3
        }
    //fila 8
        int valorPicaFila8=12;//fila 8 columna 3 al 8 
        for (int c = 3; c < 9; c++) {
            matrizBotones[8][c]=new cartas("PICA", valorPicaFila8, posesionInicial,8,c);
            valorPicaFila8--;//llega hasta 7
        }
        matrizBotones[8][2]=new cartas("PICA", 1, posesionInicial,8,2);    
    //fila 2
        int valorDiamanteFila2=7;//fila 2 columna 2 al 7 
        for (int c = 2; c < 8; c++) {
            matrizBotones[2][c]=new cartas("DIAMANTE", valorDiamanteFila2, posesionInicial,2,c);
            valorDiamanteFila2++;//llega hasta 12
        }
        matrizBotones[2][1]=new cartas("CORAZON", 11, posesionInicial,2,1);  
        matrizBotones[2][8]=new cartas("CORAZON", 2, posesionInicial,2,8);
    //columna 1 faltantes desde fila 3 al 8    
        matrizBotones[3][1]=new cartas("CORAZON", 12, posesionInicial,3,1);  
        matrizBotones[4][1]=new cartas("CORAZON", 1, posesionInicial,4,1);
        matrizBotones[5][1]=new cartas("TREBOL", 2, posesionInicial,5,1);  
        matrizBotones[6][1]=new cartas("TREBOL", 3, posesionInicial,6,1);
        matrizBotones[7][1]=new cartas("TREBOL", 4, posesionInicial,7,1);  
        matrizBotones[8][1]=new cartas("TREBOL", 5, posesionInicial,8,1);
    //columna 2 fila 3 al 7  
        int valorDiamanteColumna2=6;
        for (int f = 3; f < 8; f++) {
            matrizBotones[f][2]=new cartas("DIAMANTE", valorDiamanteColumna2, posesionInicial,f,2);
            valorDiamanteColumna2--;//llega hasta 2
        }
    //fila 7 columna 3 al 7
        int valorTrebolFila7=6;
        for (int c = 3; c < 8; c++) {
            matrizBotones[7][c]=new cartas("TREBOL", valorTrebolFila7, posesionInicial,7,c);
            valorTrebolFila7++;//llega hasta 10 
        }   
    //columna 3 faltantes desde fila 3 al 6     
        int valorTrebolColumna3=2;
        for (int f = 3; f < 7; f++) {
            matrizBotones[f][3]=new cartas("TREBOL",  valorTrebolColumna3, posesionInicial,f,3);
            valorTrebolColumna3++;//llega hasta 5
        } 
    //columna 4 faltantes desde fila 3 al 6    
        matrizBotones[3][4]=new cartas("CORAZON", 1, posesionInicial,3,4);  
        matrizBotones[4][4]=new cartas("CORAZON", 4, posesionInicial,4,4);
        matrizBotones[5][4]=new cartas("CORAZON", 5, posesionInicial,5,4);  
        matrizBotones[6][4]=new cartas("CORAZON", 6, posesionInicial,6,4); 
    //columna 5 faltantes desde fila 3 al 6    
        matrizBotones[3][5]=new cartas("CORAZON", 12, posesionInicial,3,5);  
        matrizBotones[4][5]=new cartas("CORAZON", 3, posesionInicial,4,5);
        matrizBotones[5][5]=new cartas("CORAZON", 2, posesionInicial,5,5);  
        matrizBotones[6][5]=new cartas("CORAZON", 7, posesionInicial,6,5);
    //columna 6 faltantes desde fila 3 al 6    
        int valorCorazonColumna6=11;
        for (int f = 3; f < 7; f++) {
            matrizBotones[f][6]=new cartas("CORAZON", valorCorazonColumna6, posesionInicial,f,6);
            valorCorazonColumna6--;//llega hasta 8
        }
    //columna 7 faltantes desde fila 3 al 6    
        matrizBotones[3][7]=new cartas("DIAMANTE", 1, posesionInicial,3,7);  
        matrizBotones[4][7]=new cartas("TREBOL", 1, posesionInicial,4,7);
        matrizBotones[5][7]=new cartas("TREBOL", 12, posesionInicial,5,7);  
        matrizBotones[6][7]=new cartas("TREBOL", 11, posesionInicial,6,7);    
    //columna 8 faltantes desde fila 3 al 7   
        int valorPicaColumna8=2;
        for (int f = 3; f < 8; f++) {
            matrizBotones[f][8]=new cartas("PICA",   valorPicaColumna8, posesionInicial,f,8);
            valorPicaColumna8++;//llega hasta 6
        }   
    }
    
    
}
