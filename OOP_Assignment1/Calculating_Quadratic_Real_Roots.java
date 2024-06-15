
package OOP_Assignment1;

import java.util.Scanner;

/**
 *
 * @author Roggers Anguzu
 */
public class Calculating_Quadratic_Real_Roots {
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the Value for 'A' ");
        a=number.nextInt();
        
        System.out.println("Enter the Value for 'B' to calculate Roots ");
        b=number.nextInt();
        
        System.out.println("Enter the Value for  'C' to calculate Roots ");
        c=number.nextInt();
        
        MyRoots values=new MyRoots(a,b,c);
        values.calCulateRoots();
        
    }    
   
}

 class MyRoots{
         int a,b,c;
        
        public MyRoots(int a,int b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        
        public void calCulateRoots(){
        double answer=Math.pow(b, 2) -4 * a * c;
        if(answer>0){
            System.out.println("There are Two real roots that exist ");
            double first=( -b + Math.sqrt(answer)) / (2*a);
            System.out.println("The First real root is " + first);
            
            double second=(-b +Math.sqrt(answer)) / (2*a);
            System.out.println("The Second real root is "+second);
        }else if(answer==0){
            System.out.print("There is only one Root that Exits");
        }
        else{
            System.out.print("There is not root that Exits ");
        }
    }
    }
