public class TrianguloRectangulo {
    public static void main(String[] args) {
        
        double h, cateto1, cateto2 , lados;
        h = Double.parseDouble(args[0]);
        cateto1 = Double.parseDouble(args[1]);
        cateto2 = Double.parseDouble(args[2]);
        lados = Math.pow(cateto1, 2) +  Math.pow(cateto2, 2);

        System.out.println(Math.pow(h, 2) + "==" +  lados);
        
    }
    
}