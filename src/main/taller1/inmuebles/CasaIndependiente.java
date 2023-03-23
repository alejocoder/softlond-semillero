package main.taller1.inmuebles;

public class CasaIndependiente extends CasaUrbana {

    protected static double valorArea = 3000000;

    public CasaIndependiente(int identificadorInmobiliario, int area,
                             String direccion, int numeroHabitaciones, int numeroRetretes, int
                                     numeroPisos) {
        super(identificadorInmobiliario, area, direccion,
                numeroHabitaciones, numeroRetretes, numeroPisos);
    }

    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
