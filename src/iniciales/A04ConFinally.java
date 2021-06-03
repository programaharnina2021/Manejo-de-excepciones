package Iniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A04ConFinally {
	public void agarraExcepcion() {
		Scanner leer = new Scanner(System.in);
		// Scanner leer=null;
		int cosa = 1;
		float resultado = 0;
		// La gran mayoria de las excepciones vienen dadas por
		// errores de usuario
		System.out.println("introduce un numero ");
		try {
			cosa = leer.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("error de numero");
			cosa = 1;
		} catch (ArithmeticException e) {
			cosa = 2;

		} catch (Exception e) {
			System.out.println("algun otro tipo de error");
			// Se ejecuta siempre que de o no de fallo
		} finally {
			System.out.println("Se ejecuta en cualquier caso anterior (siempre)");
			// Aqui se hacen las cowsas comunes para todos los fallos o no
			resultado = 56 / cosa;
		}
		System.out.println("La division es " + resultado);
	}

	public A04ConFinally() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new A04ConFinally().agarraExcepcion();
	}

}
