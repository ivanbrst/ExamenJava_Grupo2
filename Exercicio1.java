/*
 Fai un programa que xenere 100 numeros aleatorios entre 0-10000 e calcule a media dos numeros xenerados.
2,5 puntos
 */
package ExamenG2;

import java.util.Random;

/**
 *
 * @author santi
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        int suma;
        int media;
        int contador;
        
        suma=0;
        contador=0;
        
        Random a=new Random();
        
        while(contador<100)
        {numero=a.nextInt(10001);
        suma=suma+numero;
        contador++;}
        
        media=suma/100;
        
        System.out.println("A media dos 100 números xenerados é "+media+"");
            
            
    }
    
    
}
