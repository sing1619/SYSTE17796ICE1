/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weathertemp;

import java.util.Scanner;

/**
 *
 * @author Balraj
 */
public class WeatherTemp {

    /**
     * @param args the command line arguments
     */
        
     public static double calcAvg(double[] temp){
        int j=0;
        double totalTemp=0;
        double avgTemp=0;
        
        for (int i = 0; i < temp.length; i++)
        {
            if(temp[i] < 50 && temp[i] > -50){
            totalTemp += temp[i];
            j++;
            }
         }        
        avgTemp = totalTemp/j;           
        return avgTemp;
        
    }   
    
    public static void main(String[] args) {
        // TODO code application logic here
        double [] temp;
        temp = new double[14];
        
        Scanner input= new Scanner (System.in);
        for (int i = 0; i < temp.length; i++) 
            {
               
                System.out.print("Enter the Temperature["+(i+1)+"] :");
                temp[i]=input.nextDouble();
            }    
        System.out.println("The average of temperature is "+String.format("%.2f", calcAvg(temp)));  

    }      
}
