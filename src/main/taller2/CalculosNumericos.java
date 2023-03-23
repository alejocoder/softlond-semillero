package main.taller2;

public class CalculosNumericos {
    public CalculosNumericos() {
    }

    public static void calcularRaizCuadrada(double valor) {
        try {
            if (valor < 0) {
                throw new ArithmeticException("El valor debe ser un numero positivo");
            }
            double resultado = Math.sqrt(valor);
            System.out.println("Resultado Raiz Cuadrada = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("El valor debe ser un numero positivo para calcular la raiz cuadrada");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Linea de error " + e.getStackTrace()[0].getLineNumber() +
                    " En la clase: " + e.getStackTrace()[0].getClassName());
        }
    }

    public static void calcularPendienteRecta(int x1, int x2, int y1, int y2) {
        try {
            int m = (y2 - y1) / (x2 - x1);
            System.out.println("Resultado Pendiente Recta = " + m);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Linea de error " + e.getStackTrace()[0].getLineNumber() +
                    " En la clase: " + e.getStackTrace()[0].getClassName());
        }
    }

    public static void calcularPuntoMedioRecta(int x1, int x2, int y1, int y2) {
        try {
            int xm = (x1 + x2) / 2;
            int ym = (y1 + y2) / 2;
            System.out.println("Resultado Punto Medio Recta M = " + " (" + xm + "," + ym + ")");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Linea de error " + e.getStackTrace()[0].getLineNumber() +
                    " En la clase: " + e.getStackTrace()[0].getClassName());
        }
    }

    public static void calcularRaicesEcuacionCuadratica(int a, int b, int c) {
        try {
            double determinante = Math.pow(b, 2) - (4 * a * c);
            if (determinante < 0) {
                throw new ArithmeticException("El determinante debe ser un numero positivo para completar la operacion");
            }
            double x1 = ((b * (-1)) + Math.sqrt(determinante)) / (2 * a);
            double x2 = ((b * (-1)) - Math.sqrt(determinante)) / (2 * a);
            System.out.println("Resultado Ecuacion Cuadratica El valor x1 = " + x1 + " y el valor de x2 = " + x2);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Linea de error " + e.getStackTrace()[0].getLineNumber() +
                    " En la clase: " + e.getStackTrace()[0].getClassName());
        }
    }

}
