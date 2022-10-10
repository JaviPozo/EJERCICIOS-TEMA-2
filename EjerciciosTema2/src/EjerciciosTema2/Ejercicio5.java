package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Definimos las variables
		int num1 = 1, num2 = 3, num3 = 5;

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al ususario que introduzca los tres números
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();

		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();

		System.out.println("Introduzca el tercer número: ");
		num3 = sc.nextInt();

		if (num1 > num2 && num2 > num3) {
			System.out.println("El resultado de mayor a menor es: ");

		} else if (num1 > num3 && num3 > num2) {

		} else if (num2 > num1 && num1 > num3)
			

		{

		}

	}

}
