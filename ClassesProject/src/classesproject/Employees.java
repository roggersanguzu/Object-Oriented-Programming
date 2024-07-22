package classesproject;

import javax.swing.JOptionPane;

public class Employees {
    public String fname;
    public String lname;
    public Integer salary;

    public Employees(String fname, String lname, Integer salary){
        this.fname=fname;
        this.lname=lname;
        this.salary=salary;
    }

    public String getfname(){
        return fname;
    }

    public String getlname(){
        return lname;
    }

    public Integer getsalary(){
        return salary;
    }

   
    public void Data(){
        System.out.println("Employee Name: " + fname + " " + lname);
        System.out.println("Salary: " + salary);
    }
 

   public static void main(String[] args){
    try {
        String fname = JOptionPane.showInputDialog(null,"Please Enter your First Name: ");
        String lname = JOptionPane.showInputDialog(null,"Please Enter your Last Name: ");
        
        Integer salary = Integer.valueOf(JOptionPane.showInputDialog(null,"Please Enter your Salary: "));
        
        Employees one = new Employees(fname,lname,salary);
        one.Data(); 
        
        Integer allowances = Integer.valueOf(JOptionPane.showInputDialog(null,"Please Enter your Allowance: "));
        
        Manager manager=new Manager(fname,lname,salary,allowances);
        manager.displayManagerDetails();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter numbers only for salary and allowance.");
    }
}
}
