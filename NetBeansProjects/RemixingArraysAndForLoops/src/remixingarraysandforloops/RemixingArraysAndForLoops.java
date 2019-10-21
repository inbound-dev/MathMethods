/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package remixingarraysandforloops;
import java.util.*;
/**
 *
 * @author Jordan
 */
public class RemixingArraysAndForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         for (int i=0; i<=10 ;i++)
         {
        
        //initiate Scanner
        Scanner input = new Scanner(System.in);
         
        //Strings 
        String mark1;
        String mark2;
        String mark3;
        String mark4;
        String mark5;
        
        //User Inputs
        mark1 = input.next();
        mark2 = input.next();
        mark3 = input.next();
        mark4 = input.next();
        mark5 = input.next();
                
        // Storing Data in Array
        String [] marks = {mark1, mark2, mark3, mark4, mark5};
        
       
        
        System.out.print(marks);
        }
    }
    
}
