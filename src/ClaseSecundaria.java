import java.util.*;
/**
 * En esta clase se hace la funcion de comprobar arraylist
 * @author alumno
 *
 */
public class ClaseSecundaria {
	private ArrayList<Integer> edades;

	public ClaseSecundaria(ArrayList<Integer> edades) {
		this.edades = edades;
	}
	public ArrayList<Integer> getEdades() {
		return edades;
	}
	public void setEdades(ArrayList<Integer> edades) {
		this.edades = edades;
	}
	/**
	 * Este metdodo mira la edad y la casifica
	 * el parametro edad es un arraylist
	 * @param edades
	 * @return
	 */
	public String comprobarArray(ArrayList<Integer> edades) {
		int mayores = 0, juvilados = 0, menores = 0;
		for (int i = 0; i < edades.size(); i++) {
			if (edades.get(i) < 18) {
				menores = menores + 1;
			} else if (edades.get(i) >= 18 && edades.get(i) < 65) {
				mayores = mayores + 1;
			} else {
				juvilados = juvilados + 1;
			}
		}
		return "Menores: " + menores + " | Mayores: " + mayores + " | Jubilados: " + juvilados;
	}
}
