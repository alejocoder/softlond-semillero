package numero1;

public class main {
    public static void main(String[] args) {

    }

    public class Precio{
    }

    public class Factura extends Precio{

        public String emisor;
        public String cliente;

        public void imprimirFactura(){
            System.out.println("factura");
        }
    }
}
