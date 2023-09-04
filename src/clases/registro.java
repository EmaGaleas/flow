package clases;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class registro {

    private RandomAccessFile cods, registros;

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
            JOptionPane.showMessageDialog(null, "Agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "USERNAME no disponible");
        }
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
        crearArchivoRegistroAnualPara(code);
    }

    private RandomAccessFile archivoRegistroPara(int codigo) throws IOException {
        String dirPa = carpetaUsuario(codigo);
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        String path = dirPa + "/reg" + añoActual + ".emp";
        return new RandomAccessFile(path, "rw");
    }

    private void crearArchivoRegistroAnualPara(int code) throws IOException {
        RandomAccessFile ryear = archivoRegistroPara(code);
        if (ryear.length() == 0) {
            for (int m = 0; m < 12; m++) {
                ryear.writeDouble(0);
                ryear.writeBoolean(false);
            }
        }
    }

    public void listarUsuarios() throws IOException {//COMENTAR AL TERMINAR
        registros.seek(0);
        while (registros.getFilePointer() < registros.length()) {
            int codigo = registros.readInt();
            String nombre = registros.readUTF();
            int puntos = registros.readInt();
            String username = registros.readUTF();
            Date fechaRegistro = new Date(registros.readLong());
            String contrasena = registros.readUTF();
            System.out.println(codigo + " - " + nombre + " - " + puntos + " - " + username + " - " + fechaRegistro + " - " + contrasena);
        }
    }

    public boolean login(String username, String contraseña) throws IOException {
        registros.seek(0);
        while (registros.getFilePointer() < registros.length()) {
            registros.readInt();
            registros.readUTF();
            registros.readInt();
            String user = registros.readUTF();
            Date fc = new Date(registros.readLong());
            String contra = registros.readUTF();
            if (username.equals(user) && contraseña.equals(contra)) {
                JOptionPane.showMessageDialog(null, "Bienvenido de vuelta");
                return true;
            }
        }
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        return false;
    }
    public int contarUsuarios() throws IOException {
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

}
