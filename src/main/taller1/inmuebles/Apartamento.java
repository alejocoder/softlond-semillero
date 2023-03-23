package main.taller1.inmuebles;

public class Apartamento extends InmuebleVivienda {

    public Apartamento(int identificadorInmobiliario, int area, String
            direccion, int numeroHabitaciones, int numeroRetretes) {

        super(identificadorInmobiliario, area, direccion,
                numeroHabitaciones, numeroRetretes);
    }

    void imprimir() {
        super.imprimir();
    }
}
