
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author samuel.hernandez
 */
public class Array_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("VECTOR");
        System.out.println("=======================");
        
        int vector[] = new int [10];
        int numintro;
        
        for(int i=0; i<vector.length; i++){
            
            System.out.println("Introduce un numero al vector: [Numero negativo para terminar]");
            numintro = Integer.parseInt(s.nextLine());
            vector[i]=numintro; 
            if(numintro<0){
                break;
            }
            
                 
            
            
        }
        System.out.print("|");
        for(int i=0; i<vector.length; i++){
            if(vector[i]>=0){
                System.out.print(vector[i]+"|");
            }else{
                break;
            }
            
        }
        
        
        
        
        
    }
    
}
