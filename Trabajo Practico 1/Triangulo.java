public class Triangulo {

    private static double a, b, c;
    public static void main(String[] args)
    {
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);

        //calcular el semiperimetro

        double semiperimetro = (a + b + c) / 2;


        //area= raíz cuadrada(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c))

        double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));

        System.out.println("semiperimetro = " + semiperimetro);
        System.out.println("area = " + area);
    }
}

