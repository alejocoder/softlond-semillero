package main.taller3.numero4;

public class CuentaAhorro extends Cuenta{

    private int numeroDeDepositos;
    private static final int PromoRetiro = 3;
    private static final int PromoDeposito = 2;

    private static final double PorcentajeValorRetiro = 0.01;
    private static final double PorcentajeValorDeposito = 0.005;
    public CuentaAhorro(String propietario) {
        super(propietario);
        numeroDeDepositos = 0;
    }
    public int getNumeroDeDepositos() {
        return numeroDeDepositos;
    }
    @Override
    public void depositar(double monto) {
        if (numeroDeDepositos < PromoDeposito) {
            double adicion = monto * PorcentajeValorDeposito;
            monto += adicion;
        }
        super.depositar(monto);
        numeroDeDepositos++;
    }
    @Override
    public void retirar(double monto) {
        if (getNumeroDeRetiros() >= PromoRetiro) {
            double comision = monto * ;
            monto += comision;
        }
        super.retirar(monto);
        addNumeroDeRetiros();
    }
    @Override
    public String toString() {
        return "cuenta de tipo: " + this.getClass().getSimpleName() + " " + super.toString();

    }
}

