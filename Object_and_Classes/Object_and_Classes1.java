/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_and_Classes;
import javax.swing.JOptionPane;

/**
 *
 * @author ubuntu
 */
public class Object_and_Classes1 {
    public static void main(String[] args){
        //The Users Class
        User user=new User();
        
        user.firstName=JOptionPane.showInputDialog(null, "Please Enter your Name: ");
        user.lastName=JOptionPane.showInputDialog(null,"Enter your Second Name: ");
        user.age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Age Please: "));
        user.sex="Male";
        user.salary=9000.89; // This is Simply an Example od Setting a Property.
        
        System.out.println(user.getInformation());
        
    }
    
}
