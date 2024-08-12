
public class Circunferencia
{
    public static void main(String[] args)
    {
        int radio = Integer.parseInt(args[0]);

        //Calcular el perimetro

        double perimetro = 2 * Math.PI * radio;


        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }
}
