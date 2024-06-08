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
public class Method_One {
    public static void main(String[] args){
        greetings();
        add(9,1);
    }
    public static void greetings(){
        String name=new String();
        name=JOptionPane.showInputDialog(null, "Please Enter Your Name dear Customer: ");
        JOptionPane.showMessageDialog(null,"Dear Student "+name +" \nYou have Successfully  Logged into the System: \n"+ "Thanks for your Time");
    }
    public static int add(int x,int  y){
   
        x=Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the First Number "));
         y=Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Last Number "));
              int z=x+y;
                  JOptionPane.showMessageDialog(null, "The Addition of "+x+ " and " +y+ "is "+ z);
        
                     return z;   
    }
}
