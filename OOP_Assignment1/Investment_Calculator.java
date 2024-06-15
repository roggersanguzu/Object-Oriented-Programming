
package OOP_Assignment1;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Roggers Anguzu
 */
public class Investment_Calculator {
    public static void main(String[] args){
        int p,r,n;
        String numb=JOptionPane.showInputDialog("Enter of Users Amount do you want  to Calculate ");
        int i=Integer.parseInt(numb);
        while(i>=0){
        String x=JOptionPane.showInputDialog("Enter the Principle ");
        String y=JOptionPane.showInputDialog("Enter the Rate ");
        String z=JOptionPane.showInputDialog("Enter the Number of Years ");
        
        
        p=Integer.parseInt(x);
        r=Integer.parseInt(y);
        n=Integer.parseInt(z);
        
        Computing comp=new Computing(p,r,n);
        comp.calCulate();
        
        i--;
        }
        
    }
}
class Computing{
    int p,r,n;
    double a;
    
    public Computing(int p,int r, int n){
        this.p=p;
        this.r=r;
        this.n=n;
    }
    public void calCulate(){
        a=p * (Math.pow((1+r), n));
        JTextArea area=new JTextArea(10,10);
        area.append(" The Amount is being Calculated as show below" );
        area.append("The amount is" +a);
        JOptionPane.showMessageDialog(null, area);
    }
}
