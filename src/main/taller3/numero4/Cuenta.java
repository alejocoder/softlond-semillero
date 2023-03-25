package main.taller3.numero4;

public abstract class Cuenta {
    private String numeroDeCuenta;
    private  double saldo;
    private String propietario;
    private int numeroDeRetiros;

    public Cuenta(String propietario) {
        this.propietario = propietario;

        numeroDeCuenta = propietario.substring(0,2).toUpperCase() + this.hashCode();
        saldo = 0;
        numeroDeRetiros = 0;
    }
    public void depositar(double monto){
        saldo += monto;
    }
    public void retirar(double monto){
        try{
            if(validarMonto(monto)){
                saldo -= monto;
            }
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
    private boolean validarMonto(double monto){
        if(monto > saldo){
            throw new IllegalArgumentException("El monto a retirar no puede ser mayo al monto de la cuenta");
        }
        return true;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumeroDeRetiros() {
        return numeroDeRetiros;
    }
    public void addNumeroDeRetiros() {
        numeroDeRetiros++;
    }
    @Override
    public String toString() {
        return "{" +
                "numero-De-Cuenta='" + numeroDeCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}
