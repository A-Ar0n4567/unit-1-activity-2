/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sovlingmathproblems;
import java.util.Scanner;

/**
 *
 * @author aamir7110
 */
public class SovlingMathProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // area of a rectangle
        Scanner keyedInput = new Scanner(System.in);
        
        double num1,num2,area;
        
        System.out.println("Enter First Number ");
        num1 = keyedInput.nextDouble();
        System.out.println("Enter Second Number ");
        num2 = keyedInput.nextDouble();
        
        area = num1*num2;
        
        System.out.println("The Area Of The Rectangle is "+area);
        keyedInput.close();
        
        // TODO code application logic here
    }
    
}
