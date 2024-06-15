
package OOP_Assignment1;

import java.util.Scanner;

/**
 *
 * @author Roggers Anguzu
 */
public class Largest_Of_Three_Numbers {
    public static void main(String[] args){
        Scanner enter=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first, Second and the third Value");
        a=enter.nextInt();
        b=enter.nextInt();
        c=enter.nextInt();
        
        BiggestDeterminer big=new BiggestDeterminer(a,b,c);
        big.calCulate();
    }
}
class BiggestDeterminer{
    int first, second, third,largest;
    
    
    public BiggestDeterminer(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
    
    public void calCulate(){
        if(first>second){
            largest=first;
        }else{
            largest=second;
        }
        if(third>second){
            largest=third;
        }
        
        System.out.println("The Largest Number is "+this.largest);
    }
}
