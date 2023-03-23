package main.taller1.facturas;

public class Factura extends Precio {

    public Factura() {
        super();
        this.emisor = "Mercado Libre";
        this.cliente = "Manuel Ballesteros";
    }

    public void imprimirFactura() {
        System.out.println("Emisor: "+ this.emisor + " Cliente: " + this.cliente);
    }

}