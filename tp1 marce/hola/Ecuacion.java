public class Ecuacion {
    public static void main (String [] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        double discriminante = (b * b) - 4 * a * c;
        System.out.println (discriminante);
        
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt (discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt (discriminante)) / (2 * a);
            System.out.println ("x1 =" + x1 + " y x2 =" + x2);
        }
        else if (discriminante == 0) {
            double x1 = (-b + Math.sqrt (discriminante)) / (2 * a);
            System.out.println ("x1 = x2" + x1);
        }
        else if (discriminante < 0) {
            System.out.println ("Se encuentra frente a una ecuacion con solucion compleja");
        }    
    }
}    