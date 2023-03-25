package main.taller3.numero4;

public class CuentaCorriente extends Cuenta{

    private static final int RetirosMaximos = 5;

    public CuentaCorriente(String propietario) {
        super(propietario);
    }

    @Override
    public void retirar(double monto) {
        try{
            if (validarNumeroDeRetiros()){
                super.retirar(monto);
                addNumeroDeRetiros();
            }
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
    private boolean validarNumeroDeRetiros(){
        if (getNumeroDeRetiros() >= RetirosMaximos) {
            throw new IllegalArgumentException("Ha excedido el numero de retiros permitidos: 5 ");
        }
        return true;
    }
    @Override
    public String toString() {
        return "cuenta de tipo: " + this.getClass().getSimpleName() + " " + super.toString();

    }

}
