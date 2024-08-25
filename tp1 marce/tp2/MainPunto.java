public class MainPunto {
    public static void main(String [] args){
        Punto punto0 = new Punto();
        punto0.mostrar();
        punto0.desplazar(1, 3);
        punto0.mostrar();
        Punto punto = new Punto(7.5, 0.5);
       punto.mostrar();
       System.out.println("(" + punto.coordenadas() + ")");
       punto.desplazar(2 , 2);
       punto.mostrar();
       System.out.println("(" + punto.coordenadas() + ")"); 
    
    }
}
