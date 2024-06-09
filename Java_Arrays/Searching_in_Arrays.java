/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class Searching_in_Arrays {
    public static void main(String[] args){
        int grades[]={90,78,89,3,67,90,23};
        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter the Number to Search");
            int number=input.nextInt();
        for(int i=0;i<=grades.length;i++){
             System.out.print("Below is the Searched Number in the Array:\n");
            if(number==grades[i]){
                System.out.println("The Number has been Found in the Array at Index " + i);
            }else{
                System.out.println("The Number has not been found");
                break;
            }
           
        }
    }
    
}
