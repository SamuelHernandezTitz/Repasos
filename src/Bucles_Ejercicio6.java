
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author samuel.hernandez
 */
public class Bucles_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("CAJA FUERTE");
        System.out.println("=============================");
        
        int contraseña = 1234;
        int numIntro;
        boolean cajaAbierta = false;
        int intentos = 4;
        
        do{
            System.out.println("Introduce la contraseña: ");
            numIntro = Integer.parseInt(s.nextLine()) ;
        
            if (numIntro == contraseña){
                System.out.println("CAJA FUERTE ABIERTA");
                break;
            }else{
                System.out.println("WRONG PASSWORD////////////////");
            }
            intentos--;
        }while(intentos>0);
        
        
        
        
        
        
        
        
        
    }
    
}
