/*
2- Fai un programa que lea un numero e que diga si ten un numero e calcule a suma das cifras
que ocupen as posicions pares empezando pola esquerda.

pe: 1236:  Suma de posicions pares = 2+6=8 

2,5 ptos
 */
package ExamenG2;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        int i;
        int suma;
        int cifra;
        int j;
        int numero2;
        
        suma=0;
        
        Scanner a=new Scanner(System.in);
        System.out.println("Introduzca o número");
        numero=a.nextInt();
        
        numero2=numero;
        
        for(j=1; numero2>0; j++)
            {numero2=numero2/10;}
        
        if(j%2!=0)
            {for(i=1; numero>0; i++)
                {cifra=numero%10;
                numero=numero/10;
                if(i%2==0)
                    {suma=suma+cifra;}
            }}
        else{
            for(i=1; numero>0; i++)
                {cifra=numero%10;
                numero=numero/10;
                if(i%2!=0)
                    {suma=suma+cifra;}}               
                }
        
            
        
        
        
        
        System.out.println("A suma das súas cifras pares empezando pola izquierda é "+suma+"");
    }
    
}
