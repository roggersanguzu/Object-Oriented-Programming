
package classesproject;


public class Manager extends Employees {
    public Integer allowances;
    
    public Manager(String fname, String lname, Integer salary,Integer allowances) {
        super(fname, lname, salary);
          this.allowances=allowances;
    }
    public Integer getallowances(){return allowances;}
    public void displayManagerDetails(){
        System.out.print("The Allowances is :"+allowances);
        System.out.print("The Salary is :" +salary);
        System.out.print("The First Name is :"+fname);
        System.out.print("The Last Name is :"+lname);
    }
}
