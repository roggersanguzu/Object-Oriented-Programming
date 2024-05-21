/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roggers;

import java.util.Scanner;

/**
 *
 * @author ranguzu
 */
public class Largest_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,largest;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Numbers Please");
        a=input.nextDouble();
         b=input.nextDouble();
          c=input.nextDouble();
        
          if(a>b){
              largest=a;
          }
          else{
              largest=b;
          }
          if(c>largest){
              largest=c;
          }
          System.out.println("The largest Number is "+largest);
    }
    
}
