/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Complx;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Cylinder {
    public static void main(String[] args){
        double r,h,volume;
        String s;
        s=JOptionPane.showInputDialog("Enter the radius: ");
        r=Double.parseDouble(s);
        s=JOptionPane.showInputDialog("Enter Height ");
        h=Double.parseDouble(s);
        
        volume=Math.PI*Math.pow(r, 2);
        DecimalFormat df=new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "The Cylinder Volume is  "+ volume);
    }
    
}
