/*
 1) O logaritmo de un numero e igual a:
Exponente o que hai que elevar un número, chamado base, para obtener otro número determinado. 
   
   Fai un programa que calcule o logaritmo de un numero si este e exacto, para o cal leera o numero do cal hai que calcular 
o logaritmo e a base do logaritmo e si e exacto debera dar o resultado e se non dira que non se pode calcular.

Exemplo 1:
    Primeiro pedimos a base: 2
    Pedimos o numero :8
  
   O logaritmo de 8 en base 2 e igual a 3, por que 2 elevado a 3  e igial a 8.

Exemplo 2:
base: 3
numero 12:
    non se pode calcula por que 3*3=9
                                3*3*=27 xa se pasa de 12

2ptos
 */
package ExamenG2;

import java.util.Scanner; 

/**
 *
 * @author santi
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int base;
        int numero;
        int contador;
        int resultado;
        
        contador=1; 
        
        Scanner a=new Scanner(System.in);
        System.out.println("Introduzca a base do logaritmo");
        
        base=a.nextInt();
        
        System.out.println("Introduzca o número para o logaritmo");
        numero=a.nextInt();
        
        resultado=base;
        
        while(resultado<numero) 
            {resultado=resultado*base;
            contador++;
            }
        
        if(resultado==numero)
        {System.out.println("O resultado do logaritmo é "+contador+"");}
        else{System.out.println("O logaritmo non se pode resolver");}
        
        
        
        
        
        
    }
    
}
