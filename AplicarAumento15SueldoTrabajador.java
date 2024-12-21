package com.estructurasSelectivas.com.ejercicio1;

import java.util.Scanner;

public class AplicarAumento15SueldoTrabajador {

	public static void main(String[] args) {
		//Escribir un algoritmo que aplique un aumento del 15% al sueldo de un trabajador,
		//si éste es menor a $1,000.00.
		Scanner entrada = new Scanner(System.in);
		double sueldo, nuevoSueldo;
		System.out.println("El sueldo del trabajado es: ");
		sueldo = entrada.nextDouble();
		if(sueldo<1000) {
			nuevoSueldo = sueldo * 1.15;
			System.out.println("El nuevo Sueldo del Trabajador es: " +nuevoSueldo);
		}//
		entrada.close();
	}

}
