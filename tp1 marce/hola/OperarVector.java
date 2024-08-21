import java.util.Scanner;

public class OperarVector {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        int notas[] = new int[5];
        float todasLasNotas = 0;
        int MIN_VALUE = 0;
        int MAX_VALUE = MIN_VALUE;
        
        for (int i = 0; i < 5; i++) {
            System.out.println ("Ingrese las notas: ");
            notas[i] = teclado.nextInt(); 
        }
        
        for(int i = 0; i < 5; i++) {
            todasLasNotas += notas[i];
            
            if(notas[i] > MAX_VALUE){
                MAX_VALUE = notas[i];
            }
        }
        
        System.out.println (notas[0] + "\t" + notas[1] + "\t" + notas[2] + "\t" + notas[3] + "\t" + notas[4]);
        System.out.println ("El promedio de las notas es: " + (todasLasNotas / 5));
        System.out.println ("La mayor nota es: " + MAX_VALUE);
    }
}