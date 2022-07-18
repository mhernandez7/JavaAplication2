
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author Miguel
 */
public class JavaApplication2 {

  
    public static void main(String[] args) {
 
        Scanner read  = new Scanner(System.in);
        float number1 = 0;
        
        Number n1 = new Number();
        
        System.out.print("ingrese un numero: ");
        number1 = read.nextFloat();
       
    
        n1.setNumber(number1);
        System.out.println(" "+n1.NumberText());
    }
    
}
