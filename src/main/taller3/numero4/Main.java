package main.taller3.numero4;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Baco TESLA");



        Cuenta cuentaA = new CuentaAhorro("Elon musk");
        Cuenta cuentaB = new CuentaCorriente("Robocop");

        banco.addCuenta(cuentaA);
        banco.addCuenta(cuentaB);

        banco.mostrarCuentas();
        System.out.println("\n");
        CuentaAhorro cuentaA1 = (CuentaAhorro) cuentaA;


        System.out.println("Saldo antes del deposito");
        System.out.println("Saldo: " + cuentaA.getSaldo());
        System.out.println("Cantidad de depositos antes de realizar el deposito");
        System.out.println("Depositos: " + cuentaA1.getNumeroDeDepositos());
        banco.depositar(cuentaA,6000);
        System.out.println("# de depositos");
        System.out.println("Depositos: " + cuentaA1.getNumeroDeDepositos());
        banco.depositar(cuentaA,4000);
        System.out.println("# de depositos");
        System.out.println("Depositos: " + cuentaA1.getNumeroDeDepositos());
        banco.depositar(cuentaA,3000);
        System.out.println("Numero de depositos");
        System.out.println("Depositos: " + cuentaA1.getNumeroDeDepositos());
        System.out.println("Saldo luego de los depositos: ");
        System.out.println("Saldo: " + cuentaA.getSaldo());
        System.out.println("\n");

        System.out.println("Saldo antes del retiro: ");
        System.out.println("Saldo: " + cuentaA.getSaldo());
        banco.retirar(cuentaA,2000);
        System.out.println("Saldo despues del retiro: ");
        System.out.println("Saldo: " + cuentaA.getSaldo());
        banco.retirar(cuentaA,1000);
        System.out.println("Saldo despues del retiro: ");
        System.out.println("Saldo: " + cuentaA.getSaldo());
        banco.retirar(cuentaA,1000);
        System.out.println("Saldo despues del retiro: ");
        System.out.println("Saldo: " + cuentaA.getSaldo());
        banco.retirar(cuentaA,1000);
        System.out.println("Saldo despues del 4to retiro: ");
        System.out.println("Saldo: " + cuentaA.getSaldo());
        System.out.println("Numero de retiros: ");
        System.out.println(cuentaA.getNumeroDeRetiros());

        banco.retirar(cuentaA,100000)

        System.out.println("\n");

        banco.depositar(cuentaB,3000);
        System.out.println("Saldo antes del retiro: ");
        System.out.println("Saldo: " + cuentaB.getSaldo());
        // Se hacen 5 Retiros
        banco.retirar(cuentaB,3000)
        banco.retirar(cuentaB,3000);
        banco.retirar(cuentaB,3000);
        banco.retirar(cuentaB,3000);
        banco.retirar(cuentaB,3000);
        System.out.println("Saldo despues de 5 retiros:  ");
        System.out.println("Saldo: " + cuentaB.getSaldo());
        banco.retirar(cuentaB,1500);

    }
}
