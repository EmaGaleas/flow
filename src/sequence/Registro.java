/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sequence;
import clases.registro;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Registro extends javax.swing.JFrame {
int contjug;

    public Registro(int contjug) {
        initComponents();
        ImageIcon icon=new ImageIcon("src/images/fondos/fondo_registrous.png");
        f_registro.setIcon(icon);
        this.contjug=contjug;
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_reg = new javax.swing.JButton();
        btn_iniciar = new javax.swing.JButton();
        txt_contra = new javax.swing.JPasswordField();
        txt_confirmar_contra = new javax.swing.JPasswordField();
        f_registro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 26)); // NOI18N
        jLabel2.setText("Ingrese Nombre Completo:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Ingrese Username:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setText("Ingrese Password:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setText("Confirmar Password");

        fecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fecha.setText("Hoy es: fecha Calendar");

        txt_username.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        btn_reg.setBackground(new java.awt.Color(0, 0, 0));
        btn_reg.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btn_reg.setForeground(new java.awt.Color(255, 255, 255));
        btn_reg.setText("Regresar");
        btn_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regMouseClicked(evt);
            }
        });

        btn_iniciar.setBackground(new java.awt.Color(0, 0, 0));
        btn_iniciar.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btn_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniciar.setText("Registrar");
        btn_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciarMouseClicked(evt);
            }
        });

        txt_contra.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        txt_confirmar_contra.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_confirmar_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_reg)
                        .addGap(94, 94, 94)
                        .addComponent(btn_iniciar))
                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_confirmar_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_reg)
                            .addComponent(btn_iniciar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciarMouseClicked
        String name=txt_nombre.getText().toUpperCase();
        String contra=txt_contra.getText();
        String username=txt_username.getText();
        String confirmarContra=txt_confirmar_contra.getText();
        if(name.isEmpty() || contra.isEmpty() || username.isEmpty() || confirmarContra.isEmpty()){
           JOptionPane.showMessageDialog(this, "PORFAVOR\nLlene todos los campos", "REGISTRO DE USUARIO", JOptionPane.WARNING_MESSAGE);    
        }else if(contra.length()<=4){
           JOptionPane.showMessageDialog(this, "PORFAVOR\nLa contraseña debe tener 5 o mas caracteres", "REGISTRO DE USUARIO", JOptionPane.WARNING_MESSAGE);    
        }else if(name.length()<=2){
           JOptionPane.showMessageDialog(this, "PORFAVOR\nIngrese nombre valido", "REGISTRO DE USUARIO", JOptionPane.WARNING_MESSAGE);    
        }else{
            if(contra.equals(confirmarContra)){
                try {
                    registro reg= new registro();
                    if(!reg.usuarioExiste(username)){
                        reg.agregarUsuario(name, username, contra);
                        menu_pincipal m=new menu_pincipal(contjug);
                        m.setVisible(true);
                        this.setVisible(false);
                    }

                } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "ERROR INESPERADO EN ARCHIVOS", "REGISTRO DE USUARIO", JOptionPane.WARNING_MESSAGE);                        

                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Las contraseñas NO coinciden", "REGISTRO DE USUARIO", JOptionPane.WARNING_MESSAGE);    
            }
        }
    }//GEN-LAST:event_btn_iniciarMouseClicked

    private void btn_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regMouseClicked
        menu_inicio mi=new menu_inicio(contjug);
        mi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_reg;
    private javax.swing.JLabel f_registro;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_confirmar_contra;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
