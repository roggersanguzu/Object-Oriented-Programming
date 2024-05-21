/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roggers;

/**
 *
 * @author ranguzu
 */
public class Display_Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number=1;
        int numberTotal=0;
        int squareTotal=0;
        int cubeTotal=0;
        int master=0;
        System.out.println("Number\t Square\t Cubic ");
        while(number<=10){
            System.out.println(number +"\t"+ number * number + "\t"+number*number*number + "\t"+number*number*number*number);
            number++;
            numberTotal= numberTotal+number;
            squareTotal= squareTotal+number*number;
             cubeTotal= cubeTotal+number*number*number;
             master= cubeTotal+number*number*number*number;
        }
        System.out.println("..................................");
        System.out.println(numberTotal +"\t"+squareTotal+ "\t"+cubeTotal+"\t" +master);
         System.out.println("..................................");
    }
    
}
