
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author samuel.hernandez
 */
public class Bucles_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int cant;
        int contador_posi=0;
        int contador_negativos=0;
        int contador_ceros=0;
        
        System.out.println("Cuantos numeros desea introducir? ");
        cant = Integer.parseInt(s.nextLine());
        
        for (int i=0; i<=cant; i++){
            System.out.println("Introduce un numero por teclado: ");
            int num = Integer.parseInt(s.nextLine());
            
            if (num > 0){
                contador_posi++;
            }
            if (num < 0){
                contador_negativos++;
            }
            if (num == 0){
                contador_ceros++;
            }
            
        }
        System.out.println("Hay "+contador_posi+" numeros mayores que cero.");
        System.out.println("Hay "+contador_negativos+" numeros menores que cero.");
        System.out.println("Hay "+contador_ceros+" numeros iguales a cero.");
        
        
    }
    
}
