
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_entradasalida;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Salvador Lopez Baltazar
 */
public class Java_EntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  entradaDatos = new Scanner(System.in);
        
        //variables
        String nombre;
        int Edad;
        
        //Proceso
        System.out.println("-----------------------------");
        nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        Edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su Edad: "));
        
        System.out.println("-----Sistema de Datos-----");
        System.out.println("Hola: " + nombre + " y tienes: " + Edad + " años.");
        System.out.println("------------------------------");
        System.out.println("Esta segunda linea es hecha en Mac Netbeans 12.6");
        
        
        
        
    }
    
}
