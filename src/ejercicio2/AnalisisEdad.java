package ejercicio2;

import java.util.ArrayList;

public class AnalisisEdad {
    ArrayList<Integer> edades;
/**
 * Constructor edades
 * @param edades Arraynumeros enteros que contendra las edades
 * 
 */
    public AnalisisEdad(ArrayList<Integer> edades) {
        this.edades = edades;
    }
/**
 * Metodo para comprobar las edades
 * @param edades
 * @return miaumiua
 */
    public String comprobar(ArrayList<Integer> edades) {
        int menores = 0;
        int mayores = 0;
        int jubilados = 0;

        for (int i=0; i< edades.size(); i++) {
            if (edades.get(i) < 18) {
                menores++;
            } else if (edades.get(i) > 65) {
                jubilados++;
                mayores++;
            } else {
                mayores++;
            }
        }

        String mensaje = "Menores de edad: " + menores + ", Mayores de edad: " + mayores + ", Jubilados: " + jubilados;
        return mensaje;
    }


}
