/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_jairosierra;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Sierra
 */
public class Main {
    static public int x;
   static public ArrayList<Usuario> lista = new ArrayList();
    static public ArrayList<Libros> lista2 = new ArrayList();
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String usuario1 = "JairoSierra20";
                String contrasena1 = "Tiburon";
                String c = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario");
                while (!c.equals(usuario1)) {
                    JOptionPane.showMessageDialog(null, "Uusario Incorrecto");
                    c = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario");
                }
                String v = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
                while (!v.equals(contrasena1)) {
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                    v = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
                }
                new Biblioteca().setVisible(true);
    }
}
