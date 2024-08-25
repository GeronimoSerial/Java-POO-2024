public class Cliente {
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;

    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe) {
        this.setNroDni(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }

    private void setNroDni(int p_dni) {
        this.nroDni = p_dni;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setSaldo(double p_importe) {
        this.saldo = p_importe;
    }

    public int getNroDni() {
        return this.nroDni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String apeYnom() {
        return this.getApellido() + this.getNombre();
    }

    public String nomYape() {
        return this.getNombre() + this.getApellido();
    }

    public double nuevoSaldo(double p_importe) {
        this.setSaldo(p_importe);
        return getSaldo();
    }

    public double agregaSaldo(double p_importe) {
        return this.saldo = this.saldo + p_importe;
            //saldo actual   saldoActual + nuevo saldo = saldo Actualizado 
    }                                  
     // setsaldo = setsaldo + nuevosaldo

    public void mostrar() {
        System.out.println("- Cliente - ");
        System.out.println("Nombre y Apellido: " + nomYape() + "(" + getNroDni() + ")");
        System.out.println("Saldo: $" + getSaldo());
    }
}
