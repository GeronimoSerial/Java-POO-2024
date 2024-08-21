
public class Laboratorio {

    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    

    Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compramin, int p_diaEnt) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompramin(p_compramin);
        this.setDiaEnt(p_diaEnt);
    }
    Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompramin(0);
        this.setDiaEnt(0);
    }


    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    public void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }

    public void setCompramin(int p_compramin) {
        this.compraMinima = p_compramin;
    }

    public void setDiaEnt(int p_diaEnt) {
        this.diaEntrega = p_diaEnt;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public int getCompraMin() {
        return this.compraMinima;
    }
    
    public int getDiaEnt() {
        return this.diaEntrega;
    }

    public void nuevaCompraMinima(int p_compramin){
        this.compraMinima = p_compramin;
    }
    public void nuevoDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }


    public String mostrar() {
        return "Laboratorio: " + this.getNombre() + 
                "\nDomicilio: " + this.getDomicilio() + "\nTelefono: " + this.getTelefono();
    }
    
 

}
