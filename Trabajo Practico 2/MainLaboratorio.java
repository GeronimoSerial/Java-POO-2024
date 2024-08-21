public class MainLaboratorio {
    public static void main(String[] args) {
        Laboratorio laboratorio = new Laboratorio("Colgate S.A", "Junin 5204", "54-11 -4239-8447", 0, 0);
        Laboratorio laboratorio2 = new Laboratorio("ODOL S.A", "Alvear 2013", "3794123456");
        System.out.println(laboratorio.mostrar());
        System.out.println(laboratorio2.mostrar());
    }
}