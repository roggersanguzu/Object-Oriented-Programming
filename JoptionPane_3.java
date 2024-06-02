/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programming_Session_2;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class JoptionPane_3 {
    public static void main(String [] args){
        int x=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the First Number Please"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Second Number Please"));
        JOptionPane.showMessageDialog(null,"The Addition of "+ x + "+" + y +"="+ (x+y));
    }
}
