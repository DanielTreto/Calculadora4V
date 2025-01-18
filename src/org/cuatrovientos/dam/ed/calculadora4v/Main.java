package org.cuatrovientos.dam.ed.calculadora4v;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 1. Variables
		Scanner scanner = new Scanner(System.in);
		String nombreOperacion;
		double resultado = 0;

		// 2. Mostrar menu y pedir operación a realizar
		// TODO hacer que la calculadora funcione en bucle hasta que el usuario decida
		// salir
		String operacion = mostrarMenu(scanner);

		// 3. Pedir operandos
		double numero1 = leerNumero(scanner, "Introduce el primer número: ");
		double numero2 = leerNumero(scanner, "Introduce el segundo número: ");

		// 4. Evaluar operacion y realizarla
		// FIXME (BUG, realiza solamente divisiones aunque selecciones otro tipo de
		// operacion)
		// siempre al final de un case poner un break
		switch (operacion.toLowerCase()) {
		case "1":
			// Sumar
			nombreOperacion = "suma";
			resultado = numero1 + numero2;
			break;
		case "2":
			// Restar
			nombreOperacion = "resta";
			resultado = numero1 - numero2;
			break;
		case "3":
			// Multiplicar
			nombreOperacion = "multiplicacion";
			resultado = numero1 * numero2;
			break;
		case "4":
			// Dividir
			nombreOperacion = "division";
			if (numero2 != 0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("Error: División por cero no permitida.");
				return;
			}
			break;
		default:
			System.out.println("Operación no válida.");
			return;
		}

		// 5. Mostrar resultado
		System.out.println("\nEl resultado de la " + nombreOperacion + " es: " + resultado);
	}

	/**
	 * Muestra un mensaje y guarda los numeros introducidos
	 * 
	 * @param scanner
	 * @param mensaje
	 * @return
	 */
	private static double leerNumero(Scanner scanner, String mensaje) {
		System.out.print(mensaje);
		return scanner.nextDouble();
	}

	/**
	 * Muestra un menu inicial y guarda la operacion a realizar seleccionada
	 * 
	 * @param scanner
	 * @return
	 */
	private static String mostrarMenu(Scanner scanner) {
		System.out.println("\nCALCULADORA 4V \n===============");
		System.out.println(" 1.SUMA \n 2.RESTA \n 3.MULTIPLICACION \n 4.DIVISION \n ");
		System.out.print("Introduce tipo de operación a realizar: ");
		String operacion = scanner.nextLine();
		return operacion;
	}
}
