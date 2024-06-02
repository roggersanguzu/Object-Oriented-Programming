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
public class JoptionPane_4 {
    public static void main(String [] args){
        int i=0;
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"How many Numbers are you dealing with?: "));
        StringBuilder data= new StringBuilder();
        
        while(i<=x){
            data.append(i).append(",");
            i++;
        }   
        JOptionPane.showMessageDialog(null,i);
    }
}
