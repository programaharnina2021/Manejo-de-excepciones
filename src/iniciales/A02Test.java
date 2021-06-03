package iniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A02Test {
	public void agarraExcepcion() {
		Scanner leer = new Scanner(System.in);
		int cosa = 0;
		float resultado = 0;
		// La gran mayoria de las excepciones vienen dadas por
		// errores de usuario
		System.out.println("introduce un numero ");
		try {
			cosa = leer.nextInt();
			resultado = 56 / cosa;
		}  catch (Exception e) {
			System.out.println("era una letra");
			e.printStackTrace();
			cosa = 1;
		}finally {
			resultado=56/1;
		}
		System.out.println("La division es " + resultado);

	}

	public static void main(String[] args) {
		new A02Test().agarraExcepcion();
	}

}
