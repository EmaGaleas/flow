/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import javax.print.attribute.standard.Media;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.player.Player;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;


public class music extends javax.swing.JFrame {
    private DefaultListModel<String> canciones;
    public Timer timer;
    private Player player; 
    private boolean rep = false;
    private boolean pausa= false;
    private int segundos;
    private int indiceActual = -1; 
    private String name;
    private boolean pausado ;
private FileInputStream fis;
private long pauseLocation;
private long songTotalLength;

    public music() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/flow/no.png");
        im.setIcon(icon);
        player = null; 
        segundos=0;
        name="";
         pauseLocation = 0;
 songTotalLength = 0;
 pausado = false;
         indiceActual = -1;
        canciones = new DefaultListModel<>();
        canciones.addElement("Lilium.mp3");
        canciones.addElement("unravel.mp3");
        lista.setModel(canciones);
        segundos = 0;
        
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                actLabelTIME();
                
            }
        });
        
    
    }
     private void actLabelTIME() {
        int minutos=segundos/60;
        int segundosRestantes=segundos % 60;
        String tiempoFormateado=String.format("%02d:%02d", minutos, segundosRestantes);
        tiempo.setText(tiempoFormateado);
        double total=palBar(name);
        int bankai = (int) ((segundos*100.0)/total);
        barra.setValue(bankai);
    }
    private double palBar(String rutaArchivo) {
        try {
            AudioFile audioFile=AudioFileIO.read(new File(rutaArchivo));
            int sec=audioFile.getAudioHeader().getTrackLength();
            return sec;
        } catch (Exception e) {
            System.out.println(e);
            return 1600;
        }
    }
    private String duracionToda(String rutaArchivo) {
        try {
            AudioFile audioFile=AudioFileIO.read(new File(rutaArchivo));
            int sec=audioFile.getAudioHeader().getTrackLength();
            int min=sec/60;
            int segundos=sec%60;
            return String.format("%02d:%02d", min, segundos);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        antes = new javax.swing.JButton();
        barra = new javax.swing.JProgressBar();
        tiempo = new javax.swing.JLabel();
        duracion = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        stop_play = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        im = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        antes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        antes.setText("<<");
        antes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antesMouseClicked(evt);
            }
        });

        tiempo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tiempo.setForeground(new java.awt.Color(255, 255, 255));
        tiempo.setText("00:00");

        duracion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        duracion.setForeground(new java.awt.Color(255, 255, 255));
        duracion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        duracion.setText("00:00");
        duracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        siguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        siguiente.setText(">>");
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });

        stop_play.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stop_play.setText("ll");
        stop_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stop_playMouseClicked(evt);
            }
        });

        add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add.setText("Añadir");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reproduciendo:");

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));

        im.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(im, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(antes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(stop_play, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(antes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stop_play, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addComponent(im, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        int elegida=lista.getSelectedIndex();
        if (elegida>= 0) {
            String eCancion=canciones.getElementAt(elegida);
            nombre.setText(eCancion);
            name=eCancion;
            if (player!= null) {
                player.close();
            }
            
            new Thread() {
                public void run() {
                    try {
                        timer.stop();
                        segundos = 0; 
                        actLabelTIME();
                        timer.start();
                        String duracio = duracionToda(eCancion);
                        duracion.setText(""+duracio);
                        fis = new FileInputStream(eCancion);
                        songTotalLength = fis.available();
                        player = new Player(fis);
                        player.play();
                        
                    } catch (Exception e) {
                        
                    }
                }
            }.start();
        }
        
    }//GEN-LAST:event_listaMouseClicked
   
    
    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        JFileChooser fac = new JFileChooser();
        fac.setCurrentDirectory(new File("."));
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("MP3 files", "mp3");
        fac.setFileFilter(fnef);
        int song = fac.showOpenDialog(null);
        
        if (song == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fac.getSelectedFile();
            String fileName = selectedFile.getName();
            canciones.addElement(fileName);
            lista.setModel(canciones); 
        }
        
    }//GEN-LAST:event_addMouseClicked

    private void stop_playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop_playMouseClicked
        if (player != null) {
            if (pausado) {
                pausado = false;
                timer.start();
                try {
                    fis = new FileInputStream(name);
                    fis.skip(songTotalLength-pauseLocation);
                    player = new Player(fis);
                    new Thread() {
                        public void run() {
                            try {
                                player.play();
                            } catch (Exception e) {
                            }
                        }
                    }.start();
                } catch (Exception e) {
                }
            } else {
                try {
                    pauseLocation=fis.available();
                    player.close();
                    fis.close(); 
                    timer.stop();
                    pausado = true;  
                } catch (Exception e) {
                }
            }
        }else{
            
        }

    }//GEN-LAST:event_stop_playMouseClicked

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        if (canciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY CANCIONES");//para timer y turno
            return; 
        }
        if (player!= null) {
            player.close();
            pausado = false;
        }
        if (indiceActual== -1) {
            indiceActual = 0;
        } else {
            indiceActual++;
            if (indiceActual>= canciones.getSize()) {
                indiceActual=0; 
            }
        }
        String siguienteCancion=canciones.getElementAt(indiceActual);
        nombre.setText(siguienteCancion);
        name=siguienteCancion;
        songTotalLength =0;
        new Thread() {
            public void run() {
                try {
                       
                    timer.stop();
                    segundos = 0;
                    actLabelTIME();
                    timer.start();
                    String duracio = duracionToda(siguienteCancion);
                    duracion.setText("" + duracio);
                    fis = new FileInputStream(siguienteCancion);
                    songTotalLength = fis.available();
                    player = new Player(fis);
                    player.play();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }.start();
    }//GEN-LAST:event_siguienteMouseClicked

    private void antesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antesMouseClicked
         if (canciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY CANCIONES");//para timer y turno
            return; 
        }
        if (player!= null) {
            player.close();
            pausado = false;
        }
        if (indiceActual== -1) {
            indiceActual=canciones.getSize()-1; 
        } else {
            if (indiceActual == 0) {
                indiceActual=canciones.getSize()-1;
            } else {
                indiceActual--;
            }
        }
        String cancionAntes=canciones.getElementAt(indiceActual);
        nombre.setText(cancionAntes);
        name=cancionAntes;
        songTotalLength =0;
        new Thread() {
            public void run() {
                try {
                    timer.stop();
                    segundos = 0;
                    actLabelTIME();
                    timer.start();
                    String duracio = duracionToda(cancionAntes);
                    duracion.setText("" + duracio);
                    fis = new FileInputStream(cancionAntes);
                    songTotalLength = fis.available();
                    player = new Player(fis);
                    player.play();
                    

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }.start();
    }//GEN-LAST:event_antesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new music().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton antes;
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel duracion;
    private javax.swing.JLabel im;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton stop_play;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
