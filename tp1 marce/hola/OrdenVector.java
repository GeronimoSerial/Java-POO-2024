import java.util.Scanner;

public class OrdenVector {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        double elementos[] = new double[4];
        double MIN_VALUE = Double.MAX_VALUE;
        double temp;
        
        for(int i = 0; i < 4; i++) {
            System.out.println ("Ingrese los elementos: ");
            elementos[i] = teclado.nextInt();
        }

        for(int i = 0; i < 4; i++) {
            if (elementos[i] < MIN_VALUE) {
                MIN_VALUE = elementos[i];
            }
        }

        for(int i = 0; i < elementos.length; i++) {
            for(int j = i + 1; j < elementos.length; j++) {
                if (elementos[i] > elementos[j]) {
                    temp = elementos[i];
                    elementos[i] = elementos[j];
                    elementos[j] = temp;
                }
            }
        }

        System.out.println ("El menor valor es: " + MIN_VALUE);
        System.out.println (elementos[0] + "\t" + elementos[1] + "\t" + elementos[2] + "\t" + elementos[3]);
    }
}