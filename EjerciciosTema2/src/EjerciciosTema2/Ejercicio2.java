package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Definimos las variables
		int primerNumero, segundoNumero;
		boolean resultado;

		// Creamos un Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el primer número
		System.out.print("Introduzca un número: ");
		primerNumero = sc.nextInt();

		// Le pedimos al usuario que introduzca el segundo número
		System.out.println("Introduzca el segundo número: ");
		segundoNumero = sc.nextInt();

		resultado = primerNumero == segundoNumero ? true : false;

		System.out.println("Son iguales?:  " + resultado);

	}

}
