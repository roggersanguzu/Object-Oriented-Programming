
package OOP_Assignment1;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author Roggers Anguzu
 */
public class Student_Data {
    public static void main(String[] args){
        String name,address,x;

        name=JOptionPane.showInputDialog("Please Student, Enter your Name: ");
       
        
        address=JOptionPane.showInputDialog("Please Student, Enter your Address: ");
      
        
        x=JOptionPane.showInputDialog("Please Student, Enter your Fees: ");
        int fees=Integer.parseInt(x);
        
        
        
        Student firstStudent=new Student(name,address,fees);
        firstStudent.disPlay();
    }
}
class Student{
    private String name;
    private String address;
    private Integer fees;
    
    public Student(String name,String address, int fees){
        this.name=name;
        this.address=address;
        this.fees=fees;
    }
    
    public String ObtainName(){
        return name;
    }
    public String ObtaingAddress(){
        return address;
    }
    public Integer ObtainFees(){
        return fees;
    }
    
    public void disPlay(){
    JTextArea area=new JTextArea(10,10);
    area.append("Below is the Student Captured Data\n");
    area.append("Your Name is: " +name + "\n");
    area.append("Your Address is: " +address + "\n");
    area.append("Your Fees is: " +fees + "\n");
    
    
    JOptionPane.showMessageDialog(null, area );
    }
}
