package main.taller1.inmuebles;

public class Main {
    public static void main(String[] args) {
        Inmueble inmuebleHector = new Inmueble(3, 51, "carrera 23");
        inmuebleHector.calcularPrecioVenta(4);
        inmuebleHector.imprimir();
    }
}