public class TrianguloRectangulo {
    public static void main (String [] args) {
        double hipotenusa = Double.parseDouble (args[0]);
        double cateto1 = Double.parseDouble (args[1]);
        double cateto2 = Double.parseDouble (args[2]);
        
        double sumaCatetos = Math.pow (cateto1, 2) + Math.pow (cateto2, 2);
        System.out.println (Math.pow (hipotenusa, 2) + " = " + sumaCatetos);
    }
}
