package menurecursividad;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static menurecursividad.MenuRecursividad.Palindromo;

public class MenuRecursividad {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int opc1, opc2;
         int i;
         int  dato;
         boolean seguir=true;
         while(seguir) {
             opc2 = 2;
             System.out.println("*************************Menú*************************");
             System.out.println("");
             System.out.println("1.- Serie Fibonacci");
             System.out.println("2.- Presentar números del 10 a 1");
             System.out.println("3.- Factorial");
             System.out.println("4.- Desaparece números ");
             System.out.println("5.- Palindromo");
             System.out.println("6.- Salir"); 
             System.out.println("");
             System.out.print("Ingrese el numero de la operacion a realizar: ");
             opc1 = leer.nextInt();
             switch (opc1){
                 case 1:
                     SerieFibonacci(8);
                     int a=SerieFibonacci(8);
                     System.out.println("Posición 8 es: "+a);
                     System.out.println("");
                     break;
                 case 2:
                     Recursividad(1);
                     System.out.println("");
                     break;
                 case 3:
                     System.out.print("Ingrese un numero: ");
                     dato=leer.nextInt();
                     System.out.println("El factorial de "+ dato +"! es: "+RecursividadFactorial(dato));
                     System.out.println("");
                     break;
                     
                 case 4:
                     DesapareceNumero(10);
                     System.out.println("");
                     break;
                 case 5:
                     String palabra;
                     System.out.print("Ingresa una palabra: ");
                     palabra=leer.next();
                     MenuRecursividad.Palindromo(palabra, 0, palabra.length()-1);
                     System.out.println("");
                     break;
                 case 6:
                     System.out.println("Saliendo....");
                     System.exit(0);
                     break;
                 default: 
                     System.out.println("Opción incorrecta");
             }
             
             
         }//while (opc2 != 2);//Si cambio aquí el valor de no en desea realizar la operación camiamos al principio de do opc2 = 2; 
         
     }
    
     public static int SerieFibonacci(int dato){
         if (dato<=1)
             return dato;
         else
                 return SerieFibonacci(dato-1)+SerieFibonacci(dato-2);
                 
     }
     
     public static void Recursividad(int n){
         if(n==11){
             System.out.println("Termino");
         } else {
             System.out.print ("["+n+"] ");
             Recursividad(n+1);
         }   
     }
     
     public static int RecursividadFactorial(int n){
         if (n==0||n==1){
             return 1;
         } else{
             return n * RecursividadFactorial(n-1);
         }
     }
     
     public static void DesapareceNumero(int n){
         if (n>-1){
             for(int i=0; i<=n; i++){
                 System.out.print("["+i+"]");
                 //System.out.println(i);
             }
             System.out.println("");
             DesapareceNumero(n-1);
          }
     }
    public static void Palindromo(String palabra, int i, int j){
         if(i<palabra.length()){
             if(palabra.charAt(i)!=palabra.charAt(j)){
                 System.out.println("No es palindromo");
                 return;
             }
             Palindromo(palabra, i+1, j-1);
         }else{
             System.out.println("Es palindromo");
         }
    }          
}
