/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Complx;

import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Maximum {
    public static void main(String[] args){
        String s;
        int a,b,c,d,e, results;
        s=JOptionPane.showInputDialog("Enter the First Number");
        a=Integer.parseInt(s);
        
           s=JOptionPane.showInputDialog("Enter the Second Number: ");
        b=Integer.parseInt(s);
        
           s=JOptionPane.showInputDialog("Enter the Third: ");
        c=Integer.parseInt(s);
        
           s=JOptionPane.showInputDialog("Enter the Fourth: ");
        d=Integer.parseInt(s);
        
           s=JOptionPane.showInputDialog("Enter the Fifth");
        e=Integer.parseInt(s);
        
        results=Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        
        JOptionPane.showMessageDialog(null, "The maximum number is "+ results);
    }
    
}
