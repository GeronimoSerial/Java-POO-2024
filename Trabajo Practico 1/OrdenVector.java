import java.util.Scanner;
public class OrdenVector {
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        double[] elementos = new double[4];
        double MIN_VALUE = Double.MAX_VALUE;
        
        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese los elementos: ");
            elementos[i] = teclado.nextDouble();
        }
        
        for(int i = 0; i < 4; i++){
            if(elementos[i] < MIN_VALUE){
                MIN_VALUE = elementos[i];
            }
        
        }
        for(int i = 0; i < elementos.length; i++){
            for(int j = i + 1; j < elementos.length; j++){
                if (elementos[i] > elementos[j]) {
                    double temp = elementos[i];
                    elementos[i] = elementos[j];
                    elementos[j] = temp;
                }
            }
            System.out.println(elementos[i]);
        }
        
        System.out.println("El menor valor es: " + MIN_VALUE);
    
    }
}

