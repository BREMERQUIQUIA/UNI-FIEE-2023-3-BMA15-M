package pe.edu.uni.revisandoconceptos.pruebas;

import pe.edu.uni.revisandoconceptos.service.GenericoDemo;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba06 {

    public static void main(String[] args) {
        GenericoDemo<String> demo = new GenericoDemo<>("Gustavo");
		  demo.mostrarTipo();
    }

}
