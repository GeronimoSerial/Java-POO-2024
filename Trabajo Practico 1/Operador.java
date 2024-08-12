public class Operador {
    private static int a;
    private static int b;
    
    public static void main(String[] args) {
        a = 8; 
        b = 3; 

        System.out.println("Variables A: " + a + ", B: " + b);
        System.out.println("Parámetro 1: " + args[0]);
        System.out.println("Parámetro 2: " + args[1]);

        // operaciones aritméticas
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        
        
    }
}
