/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Prog_Work;

import java.util.Scanner;

/**
 *
 * @author ~CyberCodex
 */
public class TestMath {
     public static void main(String[] args) {
      int a,b,c,d,e,large,mini;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 5 Values: ");
      a=input.nextInt();
        b=input.nextInt();
          c=input.nextInt();
            d=input.nextInt();
              e=input.nextInt();
              
              large=Math.max(a,Math.max(b, Math.max(c, Math.max(d, e))));
              System.out.println("The Largest Number is "+large);
               mini=Math.min(a,Math.min(b, Math.min(c, Math.min(d, e))));
              System.out.println("The Largest Number is "+mini);
    }
}
