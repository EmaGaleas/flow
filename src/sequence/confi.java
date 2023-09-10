/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sequence;
import clases.registro;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class confi extends javax.swing.JFrame {
    registro obrg = new registro();
    private String[] coloresSeleccionados;
   // private String[] coloresEquipos;
    private int contClicksFicha;
    
    public confi() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/images/fondos/fondo_configuracion.png");
        fondo_c.setIcon(icon);
        contClicksFicha=0;
////        //pruebas
//        try {
//            obrg.sobreModoFuera("rv", "TURQUESA");
//            } catch (IOException e) {
//            e.printStackTrace(); 
//        }
//         try {
//            obrg.agregarReportes("INTENTO 2 PARA VER SI NO SOBREESCIRBE");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tbn_inicio = new javax.swing.JButton();
        btn_cantidad = new javax.swing.JButton();
        btn_color = new javax.swing.JButton();
        fondo_c = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        tbn_inicio.setBackground(new java.awt.Color(0, 0, 0));
        tbn_inicio.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        tbn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        tbn_inicio.setText("MENU PRINCIPAL");
        tbn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbn_inicioMouseClicked(evt);
            }
        });

        btn_cantidad.setBackground(new java.awt.Color(0, 0, 0));
        btn_cantidad.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        btn_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        btn_cantidad.setText("CANTIDAD DE JUGADORES");
        btn_cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cantidadMouseClicked(evt);
            }
        });

        btn_color.setBackground(new java.awt.Color(0, 0, 0));
        btn_color.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        btn_color.setForeground(new java.awt.Color(255, 255, 255));
        btn_color.setText("SELECCIONAR COLOR DE FICHA");
        btn_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_colorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_color, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cantidad)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tbn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btn_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btn_color, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(tbn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbn_inicioMouseClicked

       boolean coloresNoSeleccionados = true;
        if (coloresSeleccionados != null) {
            for (String color : coloresSeleccionados) {
                if (color == null) {
                    coloresNoSeleccionados = false;
                    break;
                }
            }

        }

        if (coloresNoSeleccionados) {
            menu_p mi = new menu_p();
            mi.setVisible(true);
            this.setVisible(false);
            coloresSeleccionados = null;
          //  coloresEquipos = null;
            System.out.println("ARREGLOS LIMPIADOS POR SI QUIERE CAMBIAR DESPUS");
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccioando colores para equipos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbn_inicioMouseClicked

    private void btn_cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cantidadMouseClicked
        // SELLECIONAR cant JUGADORES terminado
        String[] opciones = {"2", "3", "4", "6", "8"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la cantidad de jugadores:",
                "Selección de Cantidad Jugadores",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);
        
         if (seleccion != null) {
            registro miRegistro = new registro();
            int cantidadUsuarios;
            
            try {
                cantidadUsuarios = miRegistro.contarUsuarios();
                int numeroSeleccionado = Integer.parseInt(seleccion);
           
                if (numeroSeleccionado <= cantidadUsuarios) {
                    JOptionPane.showMessageDialog(null, "Has seleccionado la cantidad de jugadores de: " + numeroSeleccionado);
                    
                    try {                       
                        String colorFicha = miRegistro.getColorFicha();
                        int teamind=miRegistro.getModo();
                        String colorG = miRegistro.getColorEquipo();
                        miRegistro.sobreModo(numeroSeleccionado, colorFicha,teamind, colorG);
                    } catch (IOException e) {
                        e.printStackTrace(); 
                    }   
                } else {
                    JOptionPane.showMessageDialog(null, "No hay suficientes usuarios registrados\nActualmente hay "+cantidadUsuarios+" registrados", "Error", JOptionPane.ERROR_MESSAGE);
                }
            
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "ERROR POTENTE", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_cantidadMouseClicked

    private void btn_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_colorMouseClicked
        registro miRegistro = new registro();
        String[] mo={"POR EQUIPO","INDIVIDUAL"};
        String mod = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona como quieres elegir color de ficha:",
                "Selección de Color",
                JOptionPane.PLAIN_MESSAGE,
                null,
                mo,
                mo[0]);
        
        if(mod!=null){
            if(mod.equals("POR EQUIPO")){
                try {
                    int t=2;
                    int contadorJ =miRegistro.getCantidadJ();
                    String colorFicha = miRegistro.getColorFicha();
                    String colorG = miRegistro.getColorEquipo();
                    miRegistro.sobreModo( contadorJ, colorFicha,0,colorG);
                    
                    if (miRegistro.getCantidadJ()== 2) {
                        t=2;
                    } else if (miRegistro.getCantidadJ() == 3) {
                        t=3;
                    } else if (miRegistro.getCantidadJ() == 4) {
                        t=2;
                    } else if (miRegistro.getCantidadJ()== 6) {
                        t=3;
                    } else if (miRegistro.getCantidadJ() == 8) {
                        t=4;
                    } 
                    coloresSeleccionados = new String[t]; 
                   // coloresEquipos = new String[t]; 
                    for (int i = 0; i < t; i++) {
                        String equipo = "Equipo " + (i + 1); 
                        String seleccion = seleccionarColor(equipo);
                    
                    if (seleccion != null) {
                        if (!yaSeleccionado(seleccion, coloresSeleccionados)) {
                            coloresSeleccionados[i] = seleccion; 
                        //    coloresEquipos[i] = seleccion; 
                        } else {
                            JOptionPane.showMessageDialog(null, "Ese color ya fue elegido por otro equipo.\nElige otro color.");
                            i--; 
                        }
                    }
                }
                    listaColores();
                } catch (IOException e) {
                    e.printStackTrace(); 
                }  
                
            }else{
                try {
                    String jugadorCambiar=listado();
                    String seleccion="";
                    if(jugadorCambiar!=null){
                        seleccion = seleccionarColor(jugadorCambiar);
                        if (seleccion != null) {
                            if(miRegistro.nadieTieneColor(seleccion ) ){
                                obrg.sobreModoFuera(jugadorCambiar, seleccion);
                                JOptionPane.showMessageDialog(null, "Se ha añadido el color:  "+seleccion+"\nAl jugador:  "+jugadorCambiar,"Colores Elegidos Individual", JOptionPane.INFORMATION_MESSAGE);         
                             
                            }else{
                                 JOptionPane.showMessageDialog(null, "Color NO disponible");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "No se pudo","Colores Elegidos Individual", JOptionPane.INFORMATION_MESSAGE);         
                        }
                    }else{
                            JOptionPane.showMessageDialog(null, "No selecciono jugador","Colores Elegidos Individual", JOptionPane.INFORMATION_MESSAGE);         
                    }
                    
                } catch (IOException e) {
                    e.printStackTrace(); 
                }  
            }
        }

    }//GEN-LAST:event_btn_colorMouseClicked

    //MOSTRAR ESTO J VECES SEGUN CUANTOS EQUIPOS O INDI MIN
    private String seleccionarColor(String equipo) {
        String[] coloresDisponibles = {"AMARILLO", "AQUA", "AZUL", "AZUL ELECTRICO", "BORGOÑA", "CELESTE", "CEREZA", "FUSCIA", "LILA", "LIMA","MANGO","MORADO","MOSTAZA","NARANJA","OLIVA","ROJO","ROSA","TURQUESA","VINO","ZAFIRO"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona un color para " + equipo + ":",
                "Selección de Color",
                JOptionPane.PLAIN_MESSAGE,
                null,
                coloresDisponibles,
                coloresDisponibles[0]);
        return seleccion.trim();
    }
     //INDIVIDUAL
    public String listado() {
            try {
                registro reg = new registro();
                String usuarios = reg.listarUsuarios();
                String[] usuariosArray = usuarios.split("\n");

                JComboBox<String> comboBox = new JComboBox<>(usuariosArray);

                int opcion = JOptionPane.showConfirmDialog(null,
                        comboBox,
                        "Selecciona un usuario:",
                        JOptionPane.OK_CANCEL_OPTION);

                if (opcion == JOptionPane.OK_OPTION) {
                    String seleccion = (String) comboBox.getSelectedItem();
                    return seleccion;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "ups";
        }
    
    //COLORES YA SELECCIONADOS NO SE VALE DE NUEVO EQUIPO
    private boolean yaSeleccionado(String color, String[] colores) {
        for (String seleccionado : colores) {
            if (color.equals(seleccionado)) {
                return true;
            }
        }
        return false;
    }
       
    //GRUPAL
    //LISTA Y AÑADE LOS COLORES A MI ARCHIVO, SERAN SPLIT CON EL GUIEN DESPUES SIRVE PARA EQUIPO NO INDIVIDUAL
    private void listaColores() {
        registro miRegistro = new registro();
        if (coloresSeleccionados != null && coloresSeleccionados.length > 0) {
            String mensaje = "Colores elegidos:\n";
            String coloresConsola = "";

            for (int i = 0; i < coloresSeleccionados.length; i++) {
                String equipo = "Equipo " + (i + 1);
                mensaje += equipo + ": " + coloresSeleccionados[i] + "\n";
                coloresConsola += coloresSeleccionados[i];

                if (i < coloresSeleccionados.length - 1) {
                    coloresConsola += "-";
                }
            }

            System.out.println("Colores en consola: " + coloresConsola);
            try {
                int contadorJ =miRegistro.getCantidadJ();
                String colorFicha = miRegistro.getColorFicha();
                miRegistro.sobreModo( contadorJ, colorFicha,0, coloresConsola);
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            JOptionPane.showMessageDialog(null, mensaje, "Colores Elegidos por Equipos", JOptionPane.INFORMATION_MESSAGE);         
               
            
        } else {
            JOptionPane.showMessageDialog(null, "NO SE SELECCIONARON COLORES", "Colores Elegidos por Equipos", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cantidad;
    private javax.swing.JButton btn_color;
    private javax.swing.JLabel fondo_c;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tbn_inicio;
    // End of variables declaration//GEN-END:variables
}
