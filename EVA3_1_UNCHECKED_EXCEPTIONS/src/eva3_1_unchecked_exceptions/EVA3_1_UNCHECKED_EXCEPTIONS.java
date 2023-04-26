/*
22550338
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;


public class EVA3_1_UNCHECKED_EXCEPTIONS {


    public static void main(String[] args) {
     //ARITHMETIC exceptions
     //División entre 0
     
   
   System.out.println("Iniciando el programa...");
     int x = 5, y= 0;
   System.out.println("Inicializando las variables...");
     int resu = x/y;
   System.out.println("Calculando la división...");
   System.out.println("División: " +resu);
     
   
   //INPUT MISMATCH EXCEPTION (ERROR DE CAPTURA)
   
   
   Scanner input = new Scanner(System.in);
   System.out.println("Introduzca un número:");
     int num = input.nextInt();
   
   
   
   //INDEX-OUT-OF-BONDS EXCEPTION
   int[] arreglo = new int [5]; //0 - (N-1)
      arreglo[0] = 100;
      arreglo[1] = 200;
      arreglo[2] = 300;
      arreglo[3] = 400;
      arreglo[4] = 500;
      arreglo[5] = 600; //Error de lógica.
     
   
   //NULL-POINTER EXCEPTION
      Prueba objP= null;
        System.out.println("Valor de x: " +objP.x); 
    }
    


}


