/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Constants_and_Functions {
    public static void main(String[] args){
        pis();
      
    }
    
    public static int pis(){
        int i=Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the radius of the Circle: "));
        int y=i*i*3;
        JOptionPane.showMessageDialog(null, "The area of the CIrcle is "+y);
        return y;
    }
}
