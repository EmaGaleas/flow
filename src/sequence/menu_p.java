 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sequence;

import clases.registro;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class menu_p extends javax.swing.JFrame {

    registro obrg = new registro();

    public menu_p() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/images/fondos/fondo_menu_principal.png");
        fondo_m.setIcon(icon);
        
        try {
            obrg.imprimirModo();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            obrg.imprimirReportes();        
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tbn_inicio = new javax.swing.JButton();
        btn_confi = new javax.swing.JButton();
        btn_ranking = new javax.swing.JButton();
        sq_button = new javax.swing.JButton();
        fondo_m = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        tbn_inicio.setBackground(new java.awt.Color(0, 0, 0));
        tbn_inicio.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        tbn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        tbn_inicio.setText("MENU INICIO");
        tbn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbn_inicioMouseClicked(evt);
            }
        });

        btn_confi.setBackground(new java.awt.Color(0, 0, 0));
        btn_confi.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        btn_confi.setForeground(new java.awt.Color(255, 255, 255));
        btn_confi.setText("CONFIGURACION");
        btn_confi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_confiMouseClicked(evt);
            }
        });

        btn_ranking.setBackground(new java.awt.Color(0, 0, 0));
        btn_ranking.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        btn_ranking.setForeground(new java.awt.Color(255, 255, 255));
        btn_ranking.setText("REPORTES");
        btn_ranking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rankingMouseClicked(evt);
            }
        });

        sq_button.setBackground(new java.awt.Color(0, 0, 0));
        sq_button.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        sq_button.setForeground(new java.awt.Color(255, 255, 255));
        sq_button.setText("SEQUENCE");
        sq_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sq_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btn_confi, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(btn_ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(sq_button, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(tbn_inicio)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(btn_ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_confi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(sq_button, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(tbn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo_m, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo_m, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbn_inicioMouseClicked
        menu_inicio mi = new menu_inicio();
        mi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbn_inicioMouseClicked

    private void btn_confiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_confiMouseClicked
        // CONFIGURACION
        confi objconf = new confi();
        objconf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_confiMouseClicked

    private void btn_rankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rankingMouseClicked
        reportes mi=new reportes();
        mi.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_rankingMouseClicked

    private void sq_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sq_buttonMouseClicked

        try {
            registro r = new registro();
           // System.out.println(r.contarUsuarios());
            System.out.println();
            if (r.contarUsuarios() >= r.getCantidadJ()) {
                oponente c = new oponente();
                c.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "No hay suficientes jugadores para el modo seleccionado");
                
            }
        } catch (IOException e) {
            System.out.println("error");

        }
    }//GEN-LAST:event_sq_buttonMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confi;
    private javax.swing.JButton btn_ranking;
    private javax.swing.JLabel fondo_m;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sq_button;
    private javax.swing.JButton tbn_inicio;
    // End of variables declaration//GEN-END:variables
}
