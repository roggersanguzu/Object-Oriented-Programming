/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oop_Part_Two;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class User {
    public String firstName;
    public String lastName;
    private String middleName;
    public Integer age;
    public Integer Id;
    
    public void output(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your First name: ");
        firstName=input.nextLine();
        
        System.out.println("Please Enter the Last Name: ");
        lastName=input.nextLine();
        
        System.out.println("Enter your age Please: ");
        age=input.nextInt();
        
        System.out.println("Enter Employee ID: ");
        Id=input.nextInt();
        
        System.out.println("Dear customer "+firstName +" "+lastName + "\nYour Employee ID Number is "+Id);
        System.out.println("You are aged "+age + "\n You have been Selected for the Work\nCongratulations!");
        
    }
    
    public void times(int x){
        System.out.println("=============================OUTPUTING BASED ON NUMBER OF TIMES===================================");
        for(int i=0;i<=x;i++){
            System.out.println("Yout name is " + firstName + " "+ lastName + " Aged "+age);
        }
    }
    
    public String message(){
          
        System.out.print("====================Part 2======================");
        return  firstName;
    }
    //Setters
    public String getFirstName(){
        return firstName.toUpperCase();
    }
    //Getters
    
}
