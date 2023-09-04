/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sequence;
import javax.swing.ImageIcon;
import clases.registro;
import javax.swing.JOptionPane;
public class menu_pincipal extends javax.swing.JFrame {

   int contjug;

   registro reg=new registro();
    public menu_pincipal(int contjug) {
        initComponents();
       
        this.contjug=contjug;

//        ImageIcon icon = new ImageIcon("src/images/fondos/fondo_menu_principal.png");
//        f_princi.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_registro = new javax.swing.JButton();
        conf_button = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        sq_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registro.setBackground(new java.awt.Color(0, 0, 0));
        btn_registro.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        btn_registro.setForeground(new java.awt.Color(255, 255, 255));
        btn_registro.setText("REGISTRO DE USUARIOS");
        btn_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registroMouseClicked(evt);
            }
        });
        jPanel1.add(btn_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 53));

        conf_button.setBackground(new java.awt.Color(0, 0, 0));
        conf_button.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        conf_button.setForeground(new java.awt.Color(255, 255, 255));
        conf_button.setText("CONFIGURACION");
        conf_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conf_buttonMouseClicked(evt);
            }
        });
        jPanel1.add(conf_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 425, 57));

        btn_salir.setBackground(new java.awt.Color(0, 0, 0));
        btn_salir.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("SALIR");
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 287, 52));

        sq_button.setBackground(new java.awt.Color(0, 0, 0));
        sq_button.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        sq_button.setForeground(new java.awt.Color(255, 255, 255));
        sq_button.setText("SEQUENCE");
        sq_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sq_buttonMouseClicked(evt);
            }
        });
        jPanel1.add(sq_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 425, 56));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registroMouseClicked
        menu_inicio mi=new menu_inicio(contjug);
        mi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_registroMouseClicked

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_salirMouseClicked

    private void conf_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conf_buttonMouseClicked
        // CONFIGURACION
        Configuracion objconf=new Configuracion(contjug);
        objconf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_conf_buttonMouseClicked

    private void sq_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sq_buttonMouseClicked
        // SEQUENCE
       
       
         
     
       
        tablero objtabl=new tablero(contjug);
        objtabl.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_sq_buttonMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registro;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton conf_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sq_button;
    // End of variables declaration//GEN-END:variables
}
