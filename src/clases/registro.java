package clases;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class registro {

    private static String login;
    private static int cantidadJ;
    private static int codigoLogueado;
    private static String colorFicha;
    private static String colores_equipo;
    private static int team_indi;
    private RandomAccessFile cods, registros, modo, reportes;

    public registro() {
        try {
            File f = new File("usuarios");
            f.mkdir();
            cods = new RandomAccessFile("usuarios/codigos.emp", "rw");
            registros = new RandomAccessFile("usuarios/registrado.emp", "rw");
            initCodigo();
        } catch (IOException e) {
            System.out.println("SE TRONO");
        }
    }

    private void initCodigo() throws IOException {
        if (cods.length() == 0) {
            cods.writeInt(1);
        }
    }

    private int getCode() throws IOException {
        cods.seek(0);
        int codigo = cods.readInt();
        cods.seek(0);
        cods.writeInt(codigo + 1);
        return codigo;
    }

    public boolean usuarioExiste(String username) throws IOException {
        registros.seek(0);
        while (registros.getFilePointer() < registros.length()) {
            registros.readInt();
            registros.readUTF();
            registros.readInt();
            String existingUsername = registros.readUTF();
            registros.readLong();
            registros.readUTF();

            if (username.equals(existingUsername)) {
                JOptionPane.showMessageDialog(null, "USERNAME no disponible");
                return true;
            }
        }
        return false;
    }

    private String carpetaUsuario(int code) {
        return "usuarios/registro" + code;
    }

    private void crearCarpetaUsuario(int code) throws IOException {
        File udir = new File(carpetaUsuario(code));
        udir.mkdir();
    }

    public void agregarUsuario(String nombreCompleto, String username, String contra) throws IOException {
        if (!usuarioExiste(username)) {
            registros.seek(registros.length());
            int code = getCode();
            registros.writeInt(code);
            registros.writeUTF(nombreCompleto);
            registros.writeInt(0);
            registros.writeUTF(username);
            registros.writeLong(Calendar.getInstance().getTimeInMillis());
            registros.writeUTF(contra);
            crearCarpetaUsuario(code);

            //crea archivo que contendra datos del modo de este jugador
            RandomAccessFile modoArchivo = new RandomAccessFile(carpetaUsuario(code) + "/modo.emp", "rw");
            modoArchivo.writeInt(4);//por default es 4
            modoArchivo.writeUTF("NO APLICA");//si no aplica no pasa nada pero cuando se escoja va a cambiar sobreescirbe seek 0 COLOR INDIVIDUAL
            modoArchivo.writeInt(0);//modo equipo pa jugar
            modoArchivo.writeUTF("NO APLICA");//colores por quipo se hata split del texto por cada guion-
            modoArchivo.close();
            cantidadJ = 4;
            colorFicha = "";
            team_indi = 0;
            colores_equipo = "";
            //crea archivo que contendra datos de reportes de este jugador 
            RandomAccessFile repotesArchivo = new RandomAccessFile(carpetaUsuario(code) + "/reportes.emp", "rw");
            repotesArchivo.writeLong(Calendar.getInstance().getTimeInMillis());//pruebita
            repotesArchivo.writeUTF("NO HA JUGADO");//se le va a ñadir despues
            repotesArchivo.close();

            login = username;
            codigoLogueado = code;

            JOptionPane.showMessageDialog(null, "Agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "USERNAME no disponible");
        }
    }

    public void imprimirModo() throws IOException {//comentar despues
        String path = carpetaUsuario(codigoLogueado) + "/modo.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        try {
            int cantidad = raf.readInt();
            String color = raf.readUTF();
            int modo = raf.readInt();
            String colores = raf.readUTF();

            System.out.println("\ncantidad:" + cantidad + "\nficha color indi:" + color);
            System.out.println("equipo(0), indi(1):" + modo + "\nficha color team:" + colores);
        } catch (EOFException e) {
            JOptionPane.showMessageDialog(null, ".");
        } finally {
            raf.close();
        }
    }

    public void sobreModo(int cantidad, String fichaI, int modo, String coloresEq) throws IOException {
        String path = carpetaUsuario(codigoLogueado) + "/modo.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "rw");
        try {
            raf.seek(0); //principio del archivo
            raf.writeInt(cantidad); //Sobre el int
            raf.writeUTF(fichaI); //Sobre color
            raf.writeInt(modo);
            raf.writeUTF(coloresEq);
            cantidadJ = cantidad;
            colorFicha = fichaI;
            team_indi = modo;
            colores_equipo = coloresEq;
        } finally {
            raf.close();
        }
    }

    public int getCantidadJ() throws IOException {
        String path = carpetaUsuario(codigoLogueado) + "/modo.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        int entero = 4;
        try {
            entero = raf.readInt();
            raf.readUTF();
            raf.readInt();
            raf.readUTF();
            cantidadJ = entero;
        } catch (EOFException e) {
            JOptionPane.showMessageDialog(null, "..");
        } finally {
            raf.close();
        }
        return entero;
    }

    public String getColorFicha() throws IOException {
        String path = carpetaUsuario(codigoLogueado) + "/modo.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        String ficha = "";
        try {
            raf.readInt();
            ficha = raf.readUTF();
            raf.readInt();
            raf.readUTF();
            colorFicha = ficha;

        } catch (EOFException e) {
            JOptionPane.showMessageDialog(null, "..");
        } finally {
            raf.close();
        }
        return ficha;
    }

    public int getModo() throws IOException {
        String path = carpetaUsuario(codigoLogueado) + "/modo.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        int mod = 0;
        try {
            raf.readInt();
            raf.readUTF();
            mod = raf.readInt();
            raf.readUTF();
            team_indi = mod;
        } catch (EOFException e) {
            JOptionPane.showMessageDialog(null, "..");
        } finally {
            raf.close();
        }
        return mod;
    }

    public String getColorEquipo() throws IOException {
        String path = carpetaUsuario(codigoLogueado) + "/modo.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        String ficha = "";
        try {
            raf.readInt();
            raf.readUTF();
            raf.readInt();
            ficha = raf.readUTF();
            colores_equipo = ficha;

        } catch (EOFException e) {
            JOptionPane.showMessageDialog(null, "..");
        } finally {
            raf.close();
        }
        return ficha;
    }

    public String imprimirReportes() throws IOException {
        String path = carpetaUsuario(codigoLogueado) + "/reportes.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        ArrayList<String> rev = new ArrayList<>();
        try {
            while (raf.getFilePointer() < raf.length()) {
                Date fecha = new Date(raf.readLong());
                String dat = raf.readUTF();
//              r += fecha + "\t" + dat + "\n";
                if (dat.equals("NO HA JUGADO")) {

                } else {
                    rev.add(fecha + "\t" + dat);
                }
            }
            String r = "";
            for (int i = rev.size() - 1; i >= 0; i--) {
                r += rev.get(i) + "\n";
            }
            return r;
        } catch (EOFException e) {
            JOptionPane.showMessageDialog(null, "...");
        } finally {
            raf.close();
        }
        return "";
    }

    public void agregarReportes(String sms) throws IOException {
        String path = carpetaUsuario(codigoLogueado) + "/reportes.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "rw");
        try {
            raf.seek(raf.length());
            raf.writeLong(Calendar.getInstance().getTimeInMillis());
            raf.writeUTF(sms);
            JOptionPane.showMessageDialog(null, "REPORTE AGREGADO");
        } finally {
            raf.close();
        }
    }

    public String listarUsuarios() throws IOException {//para oponente
        registros.seek(0);
        String j = "";
        while (registros.getFilePointer() < registros.length()) {
            registros.readInt();
            registros.readUTF();
            registros.readInt();
            String username = registros.readUTF();
            registros.readLong();
            registros.readUTF();
            j += username + "\n";
        }
        return j;
    }

    public boolean login(String username, String contraseña) throws IOException {
        registros.seek(0);
        while (registros.getFilePointer() < registros.length()) {
            int code = registros.readInt();
            registros.readUTF();
            registros.readInt();
            String user = registros.readUTF();
            Date fc = new Date(registros.readLong());
            String contra = registros.readUTF();
            if (username.equals(user) && contraseña.equals(contra)) {
                login = username;
                codigoLogueado = code;
                JOptionPane.showMessageDialog(null, "Bienvenido de vuelta");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Acceso denegado");
        return false;
    }

    public static String getLogin() {
        return login;
    }

    public int contarUsuarios() throws IOException {//tire cuantos usuarios hay
        int contador = 0;
        registros.seek(0);
        while (registros.getFilePointer() < registros.length()) {
            registros.readInt();
            registros.readUTF();
            registros.readInt();
            registros.readUTF();
            registros.readLong();
            registros.readUTF();
            contador++;
        }
        return contador;
    }

    public int obtenerCodigo(String nombre) throws IOException {
        int codigo = -1;
        registros.seek(0);
        while (registros.getFilePointer() < registros.length()) {
            int code = registros.readInt();
            registros.readUTF();
            registros.readInt();
            String name = registros.readUTF();
            registros.readLong();
            registros.readUTF();
            if (nombre.equals(name)) {
                codigo = code;
                System.err.println("codigo de este "+nombre+": " + codigo);
                break;
            }
            System.err.println("codigo no encontrado");
        }
        return codigo;
    }

    public void sobreModoFuera(String nombre, String fichaI) throws IOException {
        int codigo = obtenerCodigo(nombre);
        if (codigo != -1) {
            String path = carpetaUsuario(codigo) + "/modo.emp";
            RandomAccessFile raf = new RandomAccessFile(path, "rw");
            try {
                int cantidad = raf.readInt();
                String fIndi = raf.readUTF();
                int modo = raf.readInt();
                String colores = raf.readUTF();
                System.err.println("VIEJO\ncantidad:" + cantidad + "\nficha color indi:" + fIndi);
                System.err.println("equipo(0), indi(1):" + modo + "\nficha color team:" + colores);
                
                raf.seek(0);
                raf.writeInt(cantidad);
                raf.writeUTF(fichaI);
                raf.writeInt(1);
                raf.writeUTF(colores);
                System.err.println("NUEVO\ncantidad:" + cantidad + "\nficha color indi:" + fichaI);
                System.err.println("equipo(0), indi(1):1\nficha color team:" + colores);

            } finally {
                raf.close();
            }
        } else {
            System.out.println("Nombre no encontrado en los registros");
        }
    }
    public void agregarReportesTodos(String nombre,String sms) throws IOException {
        int codigo = obtenerCodigo(nombre);
        if(codigo!=-1){
            String path = carpetaUsuario(codigo) + "/reportes.emp";
            RandomAccessFile raf = new RandomAccessFile(path, "rw");
            try {
                raf.seek(raf.length());
                raf.writeLong(Calendar.getInstance().getTimeInMillis());
                raf.writeUTF(sms);
                JOptionPane.showMessageDialog(null, "REPORTE AGREGADO");
            } finally {
                raf.close();
            }
        }
    }

    public boolean nadieTieneColor(String color) throws IOException {
        int cantCodigos = contarUsuarios();
        for (int codigo = 1; codigo <= cantCodigos; codigo++) {
            String path = carpetaUsuario(codigo) + "/modo.emp";
            RandomAccessFile raf = new RandomAccessFile(path, "r");
            try {
                raf.readInt();
                String colores = raf.readUTF();
                raf.readInt();
                raf.readUTF();
                if (colores.equals(color)) {
                    return false;
                }
            } finally {
                raf.close();
            }
        }

        return true;
    }
    public String getColorIndividual(String nombre) throws IOException {
        int codigo = obtenerCodigo(nombre); // Obtener el código del nombre
        if (codigo == -1) {
            return "NO TA";
        }
        String path = carpetaUsuario(codigo) + "/modo.emp";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        String ficha = "";
        try {
            raf.readInt();
            ficha = raf.readUTF();
            raf.readInt();
            raf.readUTF();
        } catch (EOFException e) {
            JOptionPane.showMessageDialog(null, "..");
        } finally {
            raf.close();
        }
        return ficha;
    }

}

//    public void listarUsuariosT() throws IOException {//COMENTAR AL TERMINAR
//        registros.seek(0);
//        while (registros.getFilePointer() < registros.length()) {
//            int codigo = registros.readInt();
//            String nombre = registros.readUTF();
//            int puntos = registros.readInt();
//            String username = registros.readUTF();
//            Date fechaRegistro = new Date(registros.readLong());
//            String contrasena = registros.readUTF();
//            System.out.println(codigo + " - " + nombre + " - " + puntos + " - " + username + " - " + fechaRegistro + " - " + contrasena);
//        }
//    }

