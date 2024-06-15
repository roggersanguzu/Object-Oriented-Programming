
package OOP_Assignment1;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author Roggers Anguzu
 */
public class Sphere_Volume {
    public static void main(String[] args){
        String x,y;
        x=JOptionPane.showInputDialog("Enter the radius of the Spheres: ");
        y=JOptionPane.showInputDialog("Enter the Height of the Sphere: ");
        
        Double r=Double.parseDouble(x);
        Double h=Double.parseDouble(y);
        
        Sphere firstSphere=new Sphere(r,h);
        firstSphere.diSplay();
    }
}

class Sphere{
    private Double h;
    private Double r;
    
    public Sphere(Double r,Double h){
        this.r=r;
        this.h=h;
    }
    
    public Double obtainHeight(){
        return h;
    }
    public Double obtainRadius(){
        return r;
    }
    
    public void diSplay(){
        double volume=(4/3)* (Math.PI)*Math.pow(r, 3)*h;
        JTextArea area=new JTextArea(10,10);
        area.append("Below is the Volume of the Sphere");
        area.append("Your Radius is "+r);
        area.append("The Height is "+h);
        area.append("The Volume has been Obtained by \n (4/3)PI*r*r*h");
        area.append("The answer is" + volume);
        
        JOptionPane.showMessageDialog(null, area);
    }
}
