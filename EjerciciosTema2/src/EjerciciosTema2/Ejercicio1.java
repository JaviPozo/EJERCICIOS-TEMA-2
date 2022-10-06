package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Definimos variables
		int numero = 0;
		boolean numeroPar;

		// Creamos un Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un nuúmero
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();

		numeroPar = numero % 2 == 0;
		System.out.println("El numero elegido es par: " + numeroPar);

	}

}
