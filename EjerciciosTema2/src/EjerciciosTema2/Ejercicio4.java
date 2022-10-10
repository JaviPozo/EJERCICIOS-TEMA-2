package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Definimos las variables
		double numero = 0.25;
		
		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número decimal: ");
		numero = sc.nextDouble();
		
		if(numero > -1 && numero < 1 && numero!=0) {
		System.out.println("El número es casi-cero");
		}else
		System.out.println("El numero no es casi-cero");
		
		if(numero<=1 || numero >=1 || numero==0) {
			
		}
		

	}

}
