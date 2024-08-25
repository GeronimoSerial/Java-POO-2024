public class MainCliente {
    public static void main(String [] args) {
        Cliente cliente = new Cliente(24444333, "Perez", "juan", 200);
        cliente.mostrar();
        cliente.agregaSaldo(50);
        cliente.mostrar();
        cliente.nuevoSaldo(100);
        cliente.mostrar();

    }
}
