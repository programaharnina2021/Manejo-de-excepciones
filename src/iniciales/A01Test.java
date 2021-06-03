package iniciales;

import java.util.Scanner;

public class A01Test {
	public void agarraExcepcion() {
		Scanner leer = new Scanner(System.in);
		int cosa;
		System.out.println("introduce un numero ");
		try {
			cosa = leer.nextInt();
		} catch (Exception e) {
			cosa=0;
		}
		try {
			System.out.println("La division es "+56/cosa);
		} catch (Exception e) {
			System.out.println("me estas poniendo nervioso");
		}
	}

	public static void main(String[] args) {
		new A01Test().agarraExcepcion();
	}
}
