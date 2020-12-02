/*
 Fai un programa que lle pida o usuario un numero n e mostre a seguinte figura:
pe: n=5
  1 
  12
  123
  1234
  12345

3 ptos
 */
package ExamenG2;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        int n;
        int i;
        int j;
        
        Scanner a=new Scanner(System.in);
        System.out.println("Introduzca un número");
        n=a.nextInt();
        
        for(i=1; i<=n; i++)
        
        {for (j=1; j<=i; j++)
            {System.out.print(""+j+"");
            }
            System.out.println("");}
        
    }
    
}
