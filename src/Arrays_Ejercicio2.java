
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author samuel.hernandez
 */
public class Arrays_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        
        int dig;
        int numeros [] = new int[5];
        
        for(int i=0; i<numeros.length; i++){
            System.out.println("Introduce un dígito: ");
            dig = Integer.parseInt(s.nextLine());
            numeros[i] = dig;
        }
        
        System.out.println("ARRAY DE NUMEROS");
        System.out.println("================");
        
        
        for(int i=0; i<numeros.length; i++){
            System.out.println("Numeros["+i+"]= "+numeros[i]);
        }
        
        System.out.print("\nArray --> [");
        
        for (int i = 0; i < numeros.length-1; i++) {
            System.out.printf("%d|",numeros[i]);
        }
        
        System.out.printf("%d]\n",numeros[numeros.length-1]);
        //System.out.println("]");
            
        
    }
}    
    

