/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sequence;
import clases.registro;
import clases.call_png_baraja;
import clases.logica_tab;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;

public class tablero extends javax.swing.JFrame {
    private logica_tab lt;
    int contusuarios;
    confi conf=new confi();
    registro obrg=new registro();
    String nombre;
    
    public tablero(String nombre) {
        initComponents();
        logica_tab lt=new logica_tab();
        fondoTablero();
        lt.GridLayout(tab);
        ImageIcon icon = new ImageIcon("src/images/mazo.png");
        sacar_carta.setIcon(icon);
        this.nombre=nombre;
        inicializarJugadores();

                            
    }
    private void inicializarJugadores(){
        String[] id = nombre.split("\n");
        String nombre1 = ""; String equipo1="";
        String nombre2 = ""; String equipo2="";
        String nombre3 = ""; String equipo3="";
        String nombre4 = ""; String equipo4="";
        String nombre5 = ""; String equipo5="";
        String nombre6 = ""; String equipo6="";
        String nombre7 = ""; String equipo7="";
        String nombre8 = ""; String equipo8="";
         if (id.length >= 1) {
            String[] split1 = id[0].split("-");
            if (split1.length >= 2) {
                nombre1 = split1[0];
                equipo1 = split1[1];
            }
        }
        if (id.length >= 2) {
            String[] split2 = id[1].split("-");
            if (split2.length >= 2) {
                nombre2 = split2[0];
                equipo2 = split2[1];
            }
        }
        if (id.length >= 3) {
            String[] split3 = id[2].split("-");
            if (split3.length >= 2) {
                nombre3 = split3[0];
                equipo3 = split3[1];
            }
        }
        if (id.length >= 4) {
            String[] split4 = id[3].split("-");
            if (split4.length >= 2) {
                nombre4 = split4[0];
                equipo4 = split4[1];
            }
        }
        if (id.length >= 5) {
            String[] split5 = id[4].split("-");
            if (split5.length >= 2) {
                nombre5 = split5[0];
                equipo5 = split5[1];
            }
        }
        if (id.length >= 6) {
            String[] split6 = id[5].split("-");
            if (split6.length >= 2) {
                nombre6 = split6[0];
                equipo6 = split6[1];
            }
        }
        if (id.length >= 7) {
            String[] split7 = id[6].split("-");
            if (split7.length >= 2) {
                nombre7 = split7[0];
                equipo7 = split7[1];
            }
        }
        if (id.length >= 8) {
            String[] split8 = id[7].split("-");
            if (split8.length >= 2) {
                nombre8 = split8[0];
                equipo8 = split8[1];
            }
        }
        try{
            int c=obrg.getCantidadJ();
             if (c == 2) {
                if(equipo1.equals("TURNO 1")){
                    nombre_J1.setText(nombre1);
                    equipo_J1.setText(equipo1);
                }else if(equipo1.equals("TURNO 2")){
                    nombre_J8.setText(nombre1);
                    equipo_J8.setText(equipo1);
                }
                if(equipo2.equals("TURNO 2")){
                    nombre_J8.setText(nombre2);
                    equipo_J8.setText(equipo2);
                }else if(equipo2.equals("TURNO 1")){
                    nombre_J1.setText(nombre2);
                    equipo_J1.setText(equipo2);
                }

                btn_verJ8.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ1.setIcon(call_png_baraja.imagenTrasera());
                
                panelJ7.setVisible(false);
                panelJ2.setVisible(false);
                panelJ6.setVisible(false);
                panelJ3.setVisible(false);
                panelJ5.setVisible(false);
                panelJ4.setVisible(false);
            } else if(c==3){
                if(equipo1.equals("TURNO 1")){
                    nombre_J1.setText(nombre1);
                    equipo_J1.setText(equipo1);
                }else if(equipo1.equals("TURNO 2")){
                    nombre_J2.setText(nombre1);
                    equipo_J2.setText(equipo1);
                }else if(equipo1.equals("TURNO 3")){
                    nombre_J8.setText(nombre1);
                    equipo_J8.setText(equipo1);
                }
                if(equipo2.equals("TURNO 1")){
                    nombre_J1.setText(nombre2);
                    equipo_J1.setText(equipo2);
                }else if(equipo2.equals("TURNO 2")){
                    nombre_J2.setText(nombre2);
                    equipo_J2.setText(equipo2);
                }else if(equipo2.equals("TURNO 3")){
                    nombre_J8.setText(nombre2);
                    equipo_J8.setText(equipo2);
                }
                if(equipo3.equals("TURNO 1")){
                    nombre_J1.setText(nombre3);
                    equipo_J1.setText(equipo3);
                }else if(equipo3.equals("TURNO 2")){
                    nombre_J2.setText(nombre3);
                    equipo_J2.setText(equipo3);
                }else if(equipo3.equals("TURNO 3")){
                    nombre_J8.setText(nombre3);
                    equipo_J8.setText(equipo3);
                }
                
                
                btn_verJ1.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ2.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ8.setIcon(call_png_baraja.imagenTrasera());
                
                panelJ7.setVisible(false); 
                panelJ6.setVisible(false);
                panelJ3.setVisible(false);
                panelJ5.setVisible(false);
                panelJ4.setVisible(false);
            }else if(c==4){
                nombre_J1.setText(nombre1);
                equipo_J1.setText(equipo1);
                nombre_J2.setText(nombre2);
                equipo_J2.setText(equipo2);
                nombre_J7.setText(nombre3);
                equipo_J7.setText(equipo3);
                nombre_J8.setText(nombre4);
                equipo_J8.setText(equipo4);
               
                btn_verJ1.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ2.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ8.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ7.setIcon(call_png_baraja.imagenTrasera());
       
                panelJ6.setVisible(false);
                panelJ3.setVisible(false);
                panelJ5.setVisible(false);
                panelJ4.setVisible(false);
            }else if(c==6){
                nombre_J1.setText(nombre1);
                equipo_J1.setText(equipo1);
                nombre_J2.setText(nombre2);
                equipo_J2.setText(equipo2);
                nombre_J3.setText(nombre3);
                equipo_J3.setText(equipo3);
                nombre_J6.setText(nombre4);
                equipo_J6.setText(equipo4);
                nombre_J7.setText(nombre5);
                equipo_J7.setText(equipo5);
                nombre_J8.setText(nombre6);
                equipo_J8.setText(equipo6);
                
                btn_verJ8.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ7.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ6.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ1.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ2.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ3.setIcon(call_png_baraja.imagenTrasera());
      
                panelJ5.setVisible(false);
                panelJ4.setVisible(false);
            }else if(c==8){
                nombre_J1.setText(nombre1);
                equipo_J1.setText(equipo1);
                nombre_J2.setText(nombre2);
                equipo_J2.setText(equipo2);
                nombre_J3.setText(nombre3);
                equipo_J3.setText(equipo3);
                nombre_J4.setText(nombre4);
                equipo_J4.setText(equipo4);
                nombre_J5.setText(nombre5);
                equipo_J5.setText(equipo5);
                nombre_J6.setText(nombre6);
                equipo_J6.setText(equipo6);
                nombre_J7.setText(nombre7);
                equipo_J7.setText(equipo7);
                nombre_J8.setText(nombre8);
                equipo_J8.setText(equipo8);
                
                btn_verJ8.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ7.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ6.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ5.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ1.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ2.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ3.setIcon(call_png_baraja.imagenTrasera());
                btn_verJ4.setIcon(call_png_baraja.imagenTrasera());

            }else{

            }
        }catch(IOException e){
            System.err.println("error");
        }
       
    }
    
    private void fondoTablero(){
        ImageIcon ig=new ImageIcon("src/images/fondos/fondo_tablero.png");
        Image original=ig.getImage();
        Image scaledImage=original.getScaledInstance(fondo_tab.getWidth(), fondo_tab.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon escala=new ImageIcon(scaledImage);        
        fondo_tab.setIcon(escala);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        panel_info = new javax.swing.JPanel();
        label_turno = new javax.swing.JLabel();
        lbl_turno_equipo = new javax.swing.JLabel();
        btn_reglas = new javax.swing.JButton();
        sacar_carta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        maz = new javax.swing.JLabel();
        panel_5al8 = new javax.swing.JPanel();
        panelJ8 = new javax.swing.JPanel();
        nombre_J8 = new javax.swing.JLabel();
        equipo_J8 = new javax.swing.JLabel();
        btn_verJ8 = new javax.swing.JButton();
        panelJ7 = new javax.swing.JPanel();
        nombre_J7 = new javax.swing.JLabel();
        equipo_J7 = new javax.swing.JLabel();
        btn_verJ7 = new javax.swing.JButton();
        panelJ6 = new javax.swing.JPanel();
        nombre_J6 = new javax.swing.JLabel();
        equipo_J6 = new javax.swing.JLabel();
        btn_verJ6 = new javax.swing.JButton();
        panelJ5 = new javax.swing.JPanel();
        nombre_J5 = new javax.swing.JLabel();
        equipo_J5 = new javax.swing.JLabel();
        btn_verJ5 = new javax.swing.JButton();
        noBorrar2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelJ_1al4 = new javax.swing.JPanel();
        panelJ1 = new javax.swing.JPanel();
        nombre_J1 = new javax.swing.JLabel();
        equipo_J1 = new javax.swing.JLabel();
        btn_verJ1 = new javax.swing.JButton();
        panelJ2 = new javax.swing.JPanel();
        nombre_J2 = new javax.swing.JLabel();
        equipo_J2 = new javax.swing.JLabel();
        btn_verJ2 = new javax.swing.JButton();
        panelJ3 = new javax.swing.JPanel();
        nombre_J3 = new javax.swing.JLabel();
        equipo_J3 = new javax.swing.JLabel();
        btn_verJ3 = new javax.swing.JButton();
        panelJ4 = new javax.swing.JPanel();
        nombre_J4 = new javax.swing.JLabel();
        equipo_J4 = new javax.swing.JLabel();
        btn_verJ4 = new javax.swing.JButton();
        noBorrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab = new javax.swing.JPanel();
        fondo_tab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));

        principal.setBackground(new java.awt.Color(51, 0, 51));

        panel_info.setBackground(new java.awt.Color(51, 0, 51));

        label_turno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label_turno.setForeground(new java.awt.Color(255, 255, 255));
        label_turno.setText("Turno de:");

        lbl_turno_equipo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_turno_equipo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_turno_equipo.setText("Turno de equipo:");

        btn_reglas.setText("?");

        sacar_carta.setBackground(new java.awt.Color(0, 0, 0));
        sacar_carta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sacar_carta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton3.setText("volver menu");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        maz.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        maz.setForeground(new java.awt.Color(255, 255, 255));
        maz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maz.setText("mazo");
        maz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_infoLayout = new javax.swing.GroupLayout(panel_info);
        panel_info.setLayout(panel_infoLayout);
        panel_infoLayout.setHorizontalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_turno_equipo, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(label_turno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addGroup(panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sacar_carta, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_infoLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_infoLayout.createSequentialGroup()
                        .addComponent(btn_reglas)
                        .addContainerGap())))
        );
        panel_infoLayout.setVerticalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addGroup(panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_infoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_infoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton3))
                            .addComponent(sacar_carta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_infoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_reglas))
                            .addComponent(maz, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                    .addGroup(panel_infoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_turno_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sacar_carta.getAccessibleContext().setAccessibleName("mazo");

        panel_5al8.setBackground(new java.awt.Color(51, 0, 51));

        panelJ8.setBackground(new java.awt.Color(51, 0, 51));

        nombre_J8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre_J8.setForeground(new java.awt.Color(255, 255, 255));
        nombre_J8.setText("Jugador:");

        equipo_J8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equipo_J8.setForeground(new java.awt.Color(255, 255, 255));
        equipo_J8.setText("Equipo:");

        btn_verJ8.setBackground(new java.awt.Color(255, 232, 255));
        btn_verJ8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_verJ8.setText("Ver mis cartas");

        javax.swing.GroupLayout panelJ8Layout = new javax.swing.GroupLayout(panelJ8);
        panelJ8.setLayout(panelJ8Layout);
        panelJ8Layout.setHorizontalGroup(
            panelJ8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_verJ8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(nombre_J8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(equipo_J8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelJ8Layout.setVerticalGroup(
            panelJ8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_J8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_J8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verJ8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelJ7.setBackground(new java.awt.Color(51, 0, 51));

        nombre_J7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre_J7.setForeground(new java.awt.Color(255, 255, 255));
        nombre_J7.setText("Jugador:");

        equipo_J7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equipo_J7.setForeground(new java.awt.Color(255, 255, 255));
        equipo_J7.setText("Equipo:");

        btn_verJ7.setBackground(new java.awt.Color(255, 232, 255));
        btn_verJ7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_verJ7.setText("Ver mis cartas");

        javax.swing.GroupLayout panelJ7Layout = new javax.swing.GroupLayout(panelJ7);
        panelJ7.setLayout(panelJ7Layout);
        panelJ7Layout.setHorizontalGroup(
            panelJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ7Layout.createSequentialGroup()
                .addGroup(panelJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_J7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equipo_J7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelJ7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_verJ7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJ7Layout.setVerticalGroup(
            panelJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_J7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_J7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verJ7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelJ6.setBackground(new java.awt.Color(51, 0, 51));

        nombre_J6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre_J6.setForeground(new java.awt.Color(255, 255, 255));
        nombre_J6.setText("Jugador:");

        equipo_J6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equipo_J6.setForeground(new java.awt.Color(255, 255, 255));
        equipo_J6.setText("Equipo:");

        btn_verJ6.setBackground(new java.awt.Color(255, 232, 255));
        btn_verJ6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_verJ6.setText("Ver mis cartas");

        javax.swing.GroupLayout panelJ6Layout = new javax.swing.GroupLayout(panelJ6);
        panelJ6.setLayout(panelJ6Layout);
        panelJ6Layout.setHorizontalGroup(
            panelJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ6Layout.createSequentialGroup()
                .addGroup(panelJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_J6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equipo_J6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelJ6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_verJ6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJ6Layout.setVerticalGroup(
            panelJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_J6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_J6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verJ6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelJ5.setBackground(new java.awt.Color(51, 0, 51));

        nombre_J5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre_J5.setForeground(new java.awt.Color(255, 255, 255));
        nombre_J5.setText("Jugador:");

        equipo_J5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equipo_J5.setForeground(new java.awt.Color(255, 255, 255));
        equipo_J5.setText("Equipo:");

        btn_verJ5.setBackground(new java.awt.Color(255, 232, 255));
        btn_verJ5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_verJ5.setText("Ver mis cartas");

        javax.swing.GroupLayout panelJ5Layout = new javax.swing.GroupLayout(panelJ5);
        panelJ5.setLayout(panelJ5Layout);
        panelJ5Layout.setHorizontalGroup(
            panelJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ5Layout.createSequentialGroup()
                .addGroup(panelJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equipo_J5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_J5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelJ5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_verJ5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJ5Layout.setVerticalGroup(
            panelJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_J5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_J5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verJ5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        noBorrar2.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout noBorrar2Layout = new javax.swing.GroupLayout(noBorrar2);
        noBorrar2.setLayout(noBorrar2Layout);
        noBorrar2Layout.setHorizontalGroup(
            noBorrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noBorrar2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noBorrar2Layout.setVerticalGroup(
            noBorrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_5al8Layout = new javax.swing.GroupLayout(panel_5al8);
        panel_5al8.setLayout(panel_5al8Layout);
        panel_5al8Layout.setHorizontalGroup(
            panel_5al8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_5al8Layout.createSequentialGroup()
                .addGroup(panel_5al8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(noBorrar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_5al8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_5al8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelJ5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelJ6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelJ7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelJ8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_5al8Layout.setVerticalGroup(
            panel_5al8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_5al8Layout.createSequentialGroup()
                .addComponent(panelJ8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelJ7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelJ6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelJ5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noBorrar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelJ_1al4.setBackground(new java.awt.Color(51, 0, 51));

        panelJ1.setBackground(new java.awt.Color(51, 0, 51));

        nombre_J1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre_J1.setForeground(new java.awt.Color(255, 255, 255));
        nombre_J1.setText("Jugador:");

        equipo_J1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equipo_J1.setForeground(new java.awt.Color(255, 255, 255));
        equipo_J1.setText("Equipo:");

        btn_verJ1.setBackground(new java.awt.Color(255, 232, 255));
        btn_verJ1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_verJ1.setText("Ver mis cartas");

        javax.swing.GroupLayout panelJ1Layout = new javax.swing.GroupLayout(panelJ1);
        panelJ1.setLayout(panelJ1Layout);
        panelJ1Layout.setHorizontalGroup(
            panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_verJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equipo_J1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_J1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelJ1Layout.setVerticalGroup(
            panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelJ2.setBackground(new java.awt.Color(51, 0, 51));

        nombre_J2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre_J2.setForeground(new java.awt.Color(255, 255, 255));
        nombre_J2.setText("Jugador:");

        equipo_J2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equipo_J2.setForeground(new java.awt.Color(255, 255, 255));
        equipo_J2.setText("Equipo:");

        btn_verJ2.setBackground(new java.awt.Color(255, 232, 255));
        btn_verJ2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_verJ2.setText("Ver mis cartas");
        btn_verJ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verJ2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelJ2Layout = new javax.swing.GroupLayout(panelJ2);
        panelJ2.setLayout(panelJ2Layout);
        panelJ2Layout.setHorizontalGroup(
            panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equipo_J2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_J2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelJ2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_verJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelJ2Layout.setVerticalGroup(
            panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelJ3.setBackground(new java.awt.Color(51, 0, 51));

        nombre_J3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre_J3.setForeground(new java.awt.Color(255, 255, 255));
        nombre_J3.setText("Jugador:");

        equipo_J3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equipo_J3.setForeground(new java.awt.Color(255, 255, 255));
        equipo_J3.setText("Equipo:");

        btn_verJ3.setBackground(new java.awt.Color(255, 232, 255));
        btn_verJ3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_verJ3.setText("Ver mis cartas");

        javax.swing.GroupLayout panelJ3Layout = new javax.swing.GroupLayout(panelJ3);
        panelJ3.setLayout(panelJ3Layout);
        panelJ3Layout.setHorizontalGroup(
            panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ3Layout.createSequentialGroup()
                .addGroup(panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equipo_J3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_J3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelJ3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_verJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJ3Layout.setVerticalGroup(
            panelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelJ4.setBackground(new java.awt.Color(51, 0, 51));

        nombre_J4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nombre_J4.setForeground(new java.awt.Color(255, 255, 255));
        nombre_J4.setText("Jugador:");

        equipo_J4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equipo_J4.setForeground(new java.awt.Color(255, 255, 255));
        equipo_J4.setText("Equipo:");

        btn_verJ4.setBackground(new java.awt.Color(255, 232, 255));
        btn_verJ4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_verJ4.setText("Ver mis cartas");

        javax.swing.GroupLayout panelJ4Layout = new javax.swing.GroupLayout(panelJ4);
        panelJ4.setLayout(panelJ4Layout);
        panelJ4Layout.setHorizontalGroup(
            panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ4Layout.createSequentialGroup()
                .addGroup(panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(equipo_J4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_J4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelJ4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_verJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJ4Layout.setVerticalGroup(
            panelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        noBorrar.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout noBorrarLayout = new javax.swing.GroupLayout(noBorrar);
        noBorrar.setLayout(noBorrarLayout);
        noBorrarLayout.setHorizontalGroup(
            noBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noBorrarLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noBorrarLayout.setVerticalGroup(
            noBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelJ_1al4Layout = new javax.swing.GroupLayout(panelJ_1al4);
        panelJ_1al4.setLayout(panelJ_1al4Layout);
        panelJ_1al4Layout.setHorizontalGroup(
            panelJ_1al4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ_1al4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJ_1al4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelJ4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelJ3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelJ2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelJ1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJ_1al4Layout.setVerticalGroup(
            panelJ_1al4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ_1al4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab.setOpaque(false);

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(panel_5al8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelJ_1al4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(principalLayout.createSequentialGroup()
                    .addGap(266, 266, 266)
                    .addComponent(fondo_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panel_5al8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelJ_1al4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(principalLayout.createSequentialGroup()
                    .addComponent(fondo_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 132, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //probar
        menu_p objmenu=new menu_p();
        objmenu.setVisible(true);
        this.setVisible(false);
  
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void btn_verJ2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verJ2MouseClicked
        // JUEGO DE 3 EN ADELANTE
        
    }//GEN-LAST:event_btn_verJ2MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new tablero().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reglas;
    private javax.swing.JButton btn_verJ1;
    private javax.swing.JButton btn_verJ2;
    private javax.swing.JButton btn_verJ3;
    private javax.swing.JButton btn_verJ4;
    private javax.swing.JButton btn_verJ5;
    private javax.swing.JButton btn_verJ6;
    private javax.swing.JButton btn_verJ7;
    private javax.swing.JButton btn_verJ8;
    private javax.swing.JLabel equipo_J1;
    private javax.swing.JLabel equipo_J2;
    private javax.swing.JLabel equipo_J3;
    private javax.swing.JLabel equipo_J4;
    private javax.swing.JLabel equipo_J5;
    private javax.swing.JLabel equipo_J6;
    private javax.swing.JLabel equipo_J7;
    private javax.swing.JLabel equipo_J8;
    private javax.swing.JLabel fondo_tab;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_turno;
    private javax.swing.JLabel lbl_turno_equipo;
    private javax.swing.JLabel maz;
    private javax.swing.JPanel noBorrar;
    private javax.swing.JPanel noBorrar2;
    private javax.swing.JLabel nombre_J1;
    private javax.swing.JLabel nombre_J2;
    private javax.swing.JLabel nombre_J3;
    private javax.swing.JLabel nombre_J4;
    private javax.swing.JLabel nombre_J5;
    private javax.swing.JLabel nombre_J6;
    private javax.swing.JLabel nombre_J7;
    private javax.swing.JLabel nombre_J8;
    private javax.swing.JPanel panelJ1;
    private javax.swing.JPanel panelJ2;
    private javax.swing.JPanel panelJ3;
    private javax.swing.JPanel panelJ4;
    private javax.swing.JPanel panelJ5;
    private javax.swing.JPanel panelJ6;
    private javax.swing.JPanel panelJ7;
    private javax.swing.JPanel panelJ8;
    private javax.swing.JPanel panelJ_1al4;
    private javax.swing.JPanel panel_5al8;
    private javax.swing.JPanel panel_info;
    private javax.swing.JPanel principal;
    private javax.swing.JButton sacar_carta;
    private javax.swing.JPanel tab;
    // End of variables declaration//GEN-END:variables
}
