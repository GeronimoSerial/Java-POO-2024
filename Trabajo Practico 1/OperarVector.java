import java.util.Scanner;
public class OperarVector {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[5];
        float totalNotas = 0;
        double maximo = Double.MIN_VALUE;
        
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese una nota: ");
            notas[i] = teclado.nextInt();
        }
      
        System.out.println("Las notas son: " + notas[0] + "| " + notas[1] +"| " + notas[2] +"| " + notas[3] +"| " + notas[4] );
        
        for(int i = 0; i < 5; i++){
            totalNotas += notas[i];
            // System.out.println("- " + notas[i]);
            if(notas[i] > maximo){
                maximo = notas[i];
            }

            
        }

        System.out.println("El promedio es: " + (totalNotas / 5));
        System.out.println("La mayor nota es: " + maximo);


    }
}