/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sequence;

import clases.logica_tab;
import clases.registro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class oponente extends javax.swing.JFrame {
    private int selec;
    private int equipoLog;
    private String name[];
    private  String n="";
    private int cantEquipos=0;
    private int E1=0;
    private int E2=0;
    private int E3=0;
    private int jper=0;
    private int swis=0;
    private int conta=0;
    
    public oponente() {
        initComponents();
        registro r = new registro();
        
        ImageIcon icon = new ImageIcon("src/images/fondos/fondo_selecjug.png");
        fondo_op.setIcon(icon);
        
        equipoLog=0;
        selec=0;
        swis=2;
        try {
            int t=r.getCantidadJ();
            name=new String[t];

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Anda dormi mejor");
        }
        String us=registro.getLogin();
        seleccionados.setText(us);
        oponentes();
        lista.setVisible(false);
        equipos();
        
        
    }
   
    private void oponentes() {//salida en combobox mostrara todos menos el login ya que ese fijo juega
        try {           
            registro reg=new registro();
            String usuarios=reg.listarUsuarios();
            String[] usuariosArray=usuarios.split("\n");
            
            String us=registro.getLogin();//obtener el login
            
            for (String usuario : usuariosArray) {
                if(!usuario.equals(us))
                    lista.addItem(usuario);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Anda dormi mejor");
        }
    }
    
    private void equipos() {//salida en combobox mostrara EQUIPOS
        try {
            equipo.removeAllItems(); 
            registro reg=new registro();
            int j=reg.getCantidadJ();
            if (j == 2) {
                equipo.addItem("TURNO 1");
                equipo.addItem("TURNO 2");
                cantEquipos=2;
                jper=1;
                confi.setText("Modo de "+j+" jugadores");
            } else if (j == 3) {
                equipo.addItem("TURNO 1");
                equipo.addItem("TURNO 2");
                equipo.addItem("TURNO 3");
                cantEquipos=3;
                jper=1;
                confi.setText("Modo de "+j+" jugadores");
            } else if (j == 4) {
                equipo.setVisible(false);
                lista.setVisible(true);
                String us=registro.getLogin();
                seleccionados.setText(us+"-"+"EQUIPO 1");
                n=us+"-"+"EQUIPO 1\n";
                conta++;
                E1++;
                cantEquipos=2;
                jper=2;
                confi.setText("Selecciona para equipo 2");
            } else if (j == 6) {
                equipo.setVisible(false);
                lista.setVisible(true);
                String us=registro.getLogin();
                seleccionados.setText(us+"-"+"EQUIPO 1");
                n=us+"-"+"EQUIPO 1\n";
                conta++;
                E1++;
                cantEquipos=3;
                jper=2;
                confi.setText("Selecciona para equipo 2");
            } else if (j == 8) {
                equipo.setVisible(false);
                lista.setVisible(true);
                String us=registro.getLogin();
                seleccionados.setText(us+"-"+"EQUIPO 1");
                n=us+"-"+"EQUIPO 1\n";
                cantEquipos=2;
                E1++;
                conta++;
                jper=4;
                confi.setText("Selecciona para equipo 2");
            } 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Anda dormi mejor");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seleccionados = new javax.swing.JTextArea();
        lista = new javax.swing.JComboBox<>();
        confi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbn_inicio = new javax.swing.JButton();
        btn_sele = new javax.swing.JButton();
        equipo = new javax.swing.JComboBox<>();
        fondo_op = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        seleccionados.setEditable(false);
        seleccionados.setColumns(20);
        seleccionados.setRows(5);
        jScrollPane1.setViewportView(seleccionados);

        lista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        confi.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        confi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confi.setText("m");
        confi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel2.setText("Listado de seleccionados");

        tbn_inicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tbn_inicio.setText("MENU PRINCIPAL");
        tbn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbn_inicioMouseClicked(evt);
            }
        });

        btn_sele.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_sele.setText("Seleccionar");
        btn_sele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_seleMouseClicked(evt);
            }
        });

        equipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lista, 0, 255, Short.MAX_VALUE)
                                    .addComponent(equipo, 0, 255, Short.MAX_VALUE))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_sele, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(confi, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tbn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(confi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_sele))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(tbn_inicio)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo_op, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fondo_op, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbn_inicioMouseClicked
        menu_p mi=new menu_p();
        mi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbn_inicioMouseClicked

    private void btn_seleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_seleMouseClicked
        registro r = new registro();
        String jugadores = lista.getSelectedItem().toString();
        try {
            //para modo 2 y 3
            if (selec < r.getCantidadJ() && (r.getCantidadJ()==2 || r.getCantidadJ()==3)) {
                        String equipos = equipo.getSelectedItem().toString(); 
                if(equipoLog==0){
                    if (equipos.equals("TURNO 1")) {
                        E1++;
                    } else if ( equipos.equals("TURNO 2")) {
                        E2++;
                    } else if ( equipos.equals("TURNO 3")) {
                        E3++;
                    }
                    String us = registro.getLogin();
                    n = us + "-" + equipos.trim()+ "\n";
                    name[selec] = us;
                    seleccionados.setText(us);
                    equipoLog++;
                    selec++;
                    lista.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Has seleccionado tu turno");
                    seleccionados.setText(n);
                }else if(equipoLog>=1){
                        if (!buscan(name, jugadores)) {
                            if (( equipos.equals("TURNO 1")&& E1 < jper ) ||
                                (equipos.equals("TURNO 2") && E2 < jper )||
                                (equipos.equals("TURNO 3") && E3 < jper )) {
                                name[selec] = jugadores;
                                selec++;
                                //aqui se hara setColor para 2
                                JOptionPane.showMessageDialog(null, "Jugador añadido");
    //                             n += jugadores + "-" + equipos + (equipos.equals("EQUIPO 1") ? E1 : equipos.equals("EQUIPO 2") ? E2 : E3) + jper + "\n";
                                 n += jugadores + "-" + equipos.trim()+ "\n";
                                seleccionados.setText(n);
                                if (equipos.equals("TURNO 1")) {
                                    E1++;
                                } else if (equipos.equals("TURNO 2")) {
                                    E2++;
                                } else if (equipos.equals("TURNO 3")) {
                                    E3++;
                                }
                                if (selec == r.getCantidadJ()) {
                                    JOptionPane.showMessageDialog(null, "Puedes continuar");
                                    tablero t = new tablero(n);
                                    t.setVisible(true);
                                    this.setVisible(false);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Turno ocupado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Jugador YA fue seleccionado");
                        }
                    }
                //para modo 4, 6 y 8 EQUIPOS
            }else if(selec < r.getCantidadJ() && (r.getCantidadJ()>3) ){
                //que seleccione segun jugador por equipo alternado
                    
                    String eq="EQUIPO 2";
                    if (!buscan(name, jugadores)) {
                        if ((E1 < jper ) ||
                            (  E2 < jper )||
                            ( E3 < jper )) {
                            name[selec] = jugadores;
                            selec++;
                            JOptionPane.showMessageDialog(null, "Jugador añadido");
                            seleccionados.setText(n);
                            if (swis==1 && E1 < jper) {
                                E1++;
                                eq="EQUIPO 1";
                                swis=2;
                                confi.setText("Selecciona para equipo 2");
                                conta++;
                            } else if (swis==2 && E2 < jper) {
                                E2++;
                                eq="EQUIPO 2";
                                conta++;
                                if(r.getCantidadJ()==6){
                                    swis=3;
                                    confi.setText("Selecciona para equipo 3");
                                }else{
                                    swis=1;
                                    confi.setText("Selecciona para equipo 1");
                                }
                            } else if (swis==3 && E3 < jper) {
                                E3++;
                                eq="EQUIPO 3";
                                swis=1;
                                conta++;
                                confi.setText("Selecciona para equipo 1");
                            }
                    
                            n += jugadores + "-" + eq+ "\n";
                            seleccionados.setText(n);

                            if (r.getCantidadJ()==conta ) {
                                JOptionPane.showMessageDialog(null, "Puedes continuar");
                                //aqui se llama la funcion que le va a dar set color a todo
                                tablero t = new tablero(n);
                                t.setVisible(true);
                                this.setVisible(false);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Equipo lleno, son "+jper+" por equipo");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Jugador YA fue seleccionado");
                    }
                 
            } else {
                JOptionPane.showMessageDialog(null, "Puedes continuar");
                tablero t = new tablero(n);
                t.setVisible(true);
                this.setVisible(false);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "...");
        }
    }//GEN-LAST:event_btn_seleMouseClicked
    private boolean buscan(String[] array, String player) {
        for (String b : array) {
            if (b != null && b.equals(player)) {
                return true;
            }
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sele;
    private javax.swing.JLabel confi;
    private javax.swing.JComboBox<String> equipo;
    private javax.swing.JLabel fondo_op;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JTextArea seleccionados;
    private javax.swing.JButton tbn_inicio;
    // End of variables declaration//GEN-END:variables
}
