package ejercicio2;

import java.util.ArrayList;
/**
 * Clase principal que contiene el menu o algo que ns en verdad que contiene pero esto se alarga por los jajas porque sabes tu que guapo va a estar si alguien tiene que leer esto encima sin ninguna coma ni mierdas
 */
public class prinvipa {
	/**
	 * 
	 * @param args miau miau
	 */
    public static void main(String[] args) {
        ArrayList<Integer> edades = new ArrayList<>();
        edades.add(10);
        edades.add(20);
        edades.add(70);
        edades.add(15);
        edades.add(30);
        edades.add(65);

        AnalisisEdad analisis = new AnalisisEdad(edades);

        System.out.println(analisis.comprobar(edades));
    }
}