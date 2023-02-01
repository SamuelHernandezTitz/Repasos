
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author samuel.hernandez
 */
public class Arrays_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int notas[] = new int [5];
        int nota;
        int notamax;
        int notamin;
        int suma=0;
        double media;
        for(int i=0; i<notas.length; i++){
            
                do{
                    
                System.out.print("Introduce una nota "+i+":");
                nota=Integer.parseInt(s.nextLine());
                if(nota<0 || nota>10){
                System.out.println("EROR: Vuelve a probar");
                }
                
                }while(nota<0 || nota>10);
            
            notas[i]=nota;
                
                
            
                
                
        }
        
        notamax=notas[0];
        notamin=notas[0];
        for(int i=0; i<notas.length; i++){
            if(notas[i]>notamax){
                notamax=notas[i];
            }
            if(notas[i]<notamin){
                notamin=notas[i];
            }
            suma=suma+notas[i];
        }
        media=(double)suma/notas.length;
        
        System.out.println("RESULTADOS");
        System.out.println("==============================");
        System.out.println("La suma de las notas es: "+suma);
        System.out.println("La media es: "+media);
        System.out.println("La nota maxima es: "+notamax);
        System.out.println("La nota mínima es: "+notamin);
    }
    
}
