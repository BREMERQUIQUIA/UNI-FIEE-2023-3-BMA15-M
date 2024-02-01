
package pe.edu.uni.proy.toribio.service;

/**
 *
 * @author Toribio
 */
public class MathService {

    /**
     * Servicio capaz de resolver la serie brindada
     * @param X Valor de X
     * @param n Numero de veces que se suma
     * @return Devuelve el valor de la serie ya sumada
     */
    public double hallarSerie(double X, int n) {

        //variables
        double serie = 0;

        //proceso
        for (int i = 0; i <= n; i++) {

            double numerador = Math.pow(-1, i + 2) * potencia(X, 2 * i);
            double denominador = factorial(i);
            serie += numerador / (double) denominador;

        }
        //reporte
        return serie;
    }

    /**
     * Servicio donde se realiza la potencia del Xn
     * @param X valor de X
     * @param n potencia
     * @return Devuelve el valor de la potencia de X a la n
     */
    public double potencia(double X, int n) {
        //variable 
        double potencia;
        //proceso
        potencia = Math.pow(X, n);
        //reporte
        return potencia;
    }

    /**
     * Este servicio genera el facorial  2*n
     * @param n Hasta donde se realiza la suma
     * @return el resultado del factorial 2*n
     */
    public long factorial(int n) {
        //variable
        long factorial=1;
        //proceso
        for (int i = 2; i <= 2 * n; i++) {
            factorial *= i;
        }
        return (n == 0) ? 1 : factorial;
    }

}
