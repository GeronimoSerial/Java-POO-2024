public class MainEmpleado {
    public static void main(String [] args){
        Empleado empleado = new Empleado(20351234385L, "Perez", "Juan", 300000.00, 2002);
        empleado.mostrar();
        System.out.println(empleado.mostrarLinea());
    }
}
