package main.taller1.cuentas;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000)
            activa = false;
        else
            activa = true;
    }

    public void retirar(float cantidad) {
        if (activa)
            super.retirar(cantidad);
    }

    public void consignar(float cantidad) {
        if (activa)
            super.consignar(cantidad);
    }

    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000)
            activa = false;
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " +
                comisionMensual);
        System.out.println("Número de transacciones = " +
                (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}
