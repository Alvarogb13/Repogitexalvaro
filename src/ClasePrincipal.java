import java.util.*;
public class ClasePrincipal {
	public static void main (String [] args) {
		ArrayList<Integer> edades = new ArrayList<Integer>();
		edades.add(12);
		edades.add(18);
		edades.add(5);
		edades.add(66);
		edades.add(29);
		edades.add(8);
		edades.add(20);
		edades.add(65);
		ClaseSecundaria CS = new ClaseSecundaria(edades);
		System.out.println("Primer arrayList:");
		System.out.println(CS.comprobarArray(edades));
		System.out.println("--------------------------------");
	}
}
