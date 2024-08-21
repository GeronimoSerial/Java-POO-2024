import java.util.Scanner;

public class CircunferenciaMod {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        int continuar = 1;
        while(continuar == 1) {
             System.out.println ("Ingrese un valor para el radio: ");
              int radio = teclado.nextInt();
              double perimetro = 2 * Math.PI * radio;
              System.out.println ("El perimetro de la circunferencia es: " + perimetro); 
              System.out.println("\n 1- Continuar ingresando, 0- Salir");
              continuar = teclado2.nextInt();
        }
        


       
    }
}
    