/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pcast
 */
public class pruebaRandom {
     public static void main(String[] args) {
        ArrayList<datos_registro> per = new ArrayList<>();
//        productos.add(new datos_registro(1, "Juan Perez", 0));
//        productos.add(new datos_registro(2, "Juan Perez", 0));
//        productos.add(new datos_registro(3, "Juna Perez", 0));
//        productos.add(new datos_registro(4, "Jun Perez", 0));
//        productos.add(new datos_registro(5, "Jan Perez", 0));
        Scanner lea = new Scanner(System.in);
        System.out.println("Numero registro a añadir");
        int numRegistrar=lea.nextInt();
        lea.nextLine();
        for (int i = 0; i < numRegistrar; i++) {
            System.out.println("el ID:");
            int id=lea.nextInt();
            lea.nextLine(); 
            System.out.println("el nombre:");
            String nombre=lea.nextLine();
           // lea.nextLine();
            per.add(new datos_registro(id,nombre,0));//se va acmabir mas adelante, por medio del id se accedera al user,es decir se añadira el id uno mas la ultima poscion del tamaño y se trasladara ese dato por el juego
        }
        try (RandomAccessFile raf=new RandomAccessFile("registro.bin", "rw")) {
            raf.seek(raf.length());
            for (datos_registro p : per) {
                raf.writeInt(p.getId());
                StringBuffer sb = new StringBuffer(p.getNombre());
                sb.setLength(10);
                raf.writeChars(sb.toString());
                raf.writeInt(p.getPuntos());
            }
        //4+20+4=28 bytes cada registro 
        System.out.println("Posicion acceder:");
        int pos=lea.nextInt();
        int quiero=6*28-28;//el primer numero es la posicion del que quiero saber
        raf.seek(quiero);
        System.out.println(raf.readInt());
        char[] nombreChars = new char[10];
        for (int i = 0; i < 10; i++) {
            nombreChars[i]=raf.readChar();
        }
        String nombre = new String(nombreChars).trim();
        System.out.println(nombre);
        System.out.println(raf.readInt());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
rafObj.getfilepoinet
rafobj.lenght
rafobj.seek
rafObj.skipbytes
r4eadUTF para string
*/