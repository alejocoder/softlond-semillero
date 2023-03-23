package main.taller1.inmuebles;

public class Casa extends InmuebleVivienda {
    protected int numeroPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion,
                int numeroHabitaciones, int numeroRetretes, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion,
                numeroHabitaciones, numeroRetretes);
        this.numeroPisos = numeroPisos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos = " + numeroPisos);
    }
}
