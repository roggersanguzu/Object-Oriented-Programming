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
public class Joption_Pane_2 {
    public static void main(String[] args){
        //String name=new String();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter your age"));
        
        if(x>=90){
            JOptionPane.showMessageDialog(null, "You are an Adult");
        }else{
            JOptionPane.showMessageDialog(null,"You are younger than 90 years Old");
        }
    }
    
}
