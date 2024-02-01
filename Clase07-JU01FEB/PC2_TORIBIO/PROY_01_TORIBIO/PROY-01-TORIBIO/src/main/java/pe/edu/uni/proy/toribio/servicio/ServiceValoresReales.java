package pe.edu.uni.proy.toribio.servicio;

/**
 *
 * @author PROFESOR
 */
public class ServiceValoresReales {

    /**
     * Este servicio calcula el determinante de la ecucacion cuadratica
     *
     * @param A Coeficiente del X2
     * @param B Coeficiente del X
     * @param C Coeficiente independiente
     * @return Determinate
     */
    public float hallarDeterminante(int A, int B, int C) {
        //variables
        float determinante;
        //proceso
        determinante = (float) (Math.pow(B, 2) - 4 * A * C);
        //reporte
        return determinante;

    }

    
    /**
     * Servicio para encontrar el primer Valor Real
     * @param B Coeficiente del X
     * @param A Coeficiente del X2
     * @param det Determinante encontrado
     * @return  El primer Valor Real
     */
    public float hallarValor1(int B, int A, float det) {
        //variables
        float valor1;
        //proceso
        valor1 = (float)(-B + Math.sqrt(det)) / (2 * A);
        //reporte
        return valor1;
    }
    
    
    /**
     * ervicio para encontrar el segundo Valor Real
     * @param B Coeficiente del X
     * @param A Coeficiente del X2
     * @param det Determinante encontrado
     * @return El segundo Valor Real
     */
       public float hallarValor2(int B, int A, float det) {
        //variables
        float valor2;
        //proceso
        valor2 = (float)(-B - Math.sqrt(det)) / (2 * A);
        //reporte
        return valor2;
    }


}
