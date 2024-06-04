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
public class User {
    public String firstName;
    public String lastName;
    public Integer age;
    public Double salary;
    public String sex;
    
    public String getInformation(){
        String x=firstName.equals("Roggers")?"Congs":"You are DUll";
        return ("Your name is "+firstName +" "+lastName +" "+x);
    }
}
