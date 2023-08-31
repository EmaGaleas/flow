/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class registro {
    private RandomAccessFile registro;
    
    public registro(){
        try{
            File f=new File("registrados");
            f.mkdir();
            registro= new RandomAccessFile("registrados/user.reg","rw");
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }
    
    
}
