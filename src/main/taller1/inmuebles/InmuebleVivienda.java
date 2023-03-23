package main.taller1.inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;

    protected int numeroRetretes;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String
            direccion, int numeroHabitaciones, int numeroRetretes) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroRetretes = numeroRetretes;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones = " +
                numeroHabitaciones);
        System.out.println("Número de baños = " + numeroRetretes);
    }
}
