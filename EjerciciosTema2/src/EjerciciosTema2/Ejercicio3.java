package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Definimos las variables
		int a;
		int b;
		
		// Creamos un Scanner para que lea el teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca un número
		System.out.print("Introduzca el primer número : ");
		a = sc.nextInt();
		
		// L e pedimos al usuario que introduzca el segundo numero
		System.out.print("Introduzca el segundo número : ");
		b = sc.nextInt();
		
		
		if (a > b) {
			System.out.print("el orden correcto es : " + a + "->" + b);
		} else
			System.out.print("el orden de mayor a menor es : " + b + " mayor que " + a);

	}

}
