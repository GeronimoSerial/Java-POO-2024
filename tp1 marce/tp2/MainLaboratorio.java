public class MainLaboratorio {
    public static void main(String [] args){
        Laboratorio laboratorio = new Laboratorio("Colgate.SA", "Junin 5204", "54-11 -4239-8447", 5, 2);
        Laboratorio laboratorio2 = new Laboratorio("Colgate.SA", "Junin 5204", "54-11 -4239-8447");
        System.out.println(laboratorio.mostrar() + "\n");
        System.out.println(laboratorio2.mostrar());
    }
}
