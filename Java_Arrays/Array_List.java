/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public class Array_List {
    public  static void main(String [] args){
        //This is the sessions that covers the deealing with the Array List.
        //It is mainly used to deal with array Lists.
        List<Integer> grades=new  ArrayList<>();
        grades.add(0,5); // The index then the Value are Passed
                grades.add(1,4);
                        grades.add(2,3);
                        System.out.println(grades.get(0)); 
                        System.out.println(grades.get(1)); 
                        System.out.println(grades.get(2)); 
                        System.out.println(" ");
//Index is whats is Passed here

// Example 2.
        List<String> names=new ArrayList<>();
        names.add(0,"Mike");
        names.add(1,"Rogers");    
        names.add(2,"Kebur");      
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        
       
    }
    
}
