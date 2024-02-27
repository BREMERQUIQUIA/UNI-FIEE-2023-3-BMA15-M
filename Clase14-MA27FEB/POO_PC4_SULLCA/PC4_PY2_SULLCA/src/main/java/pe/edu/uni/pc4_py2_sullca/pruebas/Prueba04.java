package pe.edu.uni.pc4_py2_sullca.pruebas;

import java.util.ArrayList;
import pe.edu.uni.pc4_py2_sullca.service.Coordenadas;
import pe.edu.uni.pc4_py2_sullca.service.PuntoDto;

public class Prueba04 {

    public static void main(String[] args) {
        // Datos
        int n = 10;
        // Puntos generados
        Coordenadas service = new Coordenadas(n);
        System.out.println("------ Puntos generados ------");
        PuntoDto[] puntos = service.getPuntos();
        for (PuntoDto punto : puntos) {
            System.out.print("> " + punto + " // ");
            System.out.println("Cuadrante: " + punto.getCuadrante());
        }
        // Puntos por cuadrante
        ArrayList<PuntoDto> lista;
        System.out.println("------ Primer cuadrante ------");
        lista = service.puntosPorCuadrante(1);
        mostrarLista(lista);
        System.out.println("------ Segundo cuadrante ------");
        lista = service.puntosPorCuadrante(2);
        mostrarLista(lista);
        System.out.println("------ Tercer cuadrante ------");
        lista = service.puntosPorCuadrante(3);
        mostrarLista(lista);
        System.out.println("------ Cuarto cuadrante ------");
        lista = service.puntosPorCuadrante(4);
        mostrarLista(lista);
    }

    private static void mostrarLista(ArrayList<PuntoDto> lista) {
        for (PuntoDto punto : lista) {
            System.out.println("> " + punto);
        }
    }

}
