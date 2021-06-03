package Iniciales;

import java.util.Scanner;

public class A09CosasQuePasan {
	public boolean leerNumero(int refe[]) {
		Scanner leer = new Scanner(System.in);
		boolean correcto = false;
		while (!correcto) {
			try {
				System.out.println("introduce un  numero");
				refe[0] = leer.nextInt();				
				correcto = true;
			} catch (Exception e) {
				System.out.println("no te he dicho que solo numeros?");
			}
			//Si la cosa es multicatch
			finally {
				leer.next();
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int pillar[] = new int[1];
		A09CosasQuePasan nuevo = new A09CosasQuePasan();
		boolean resultado = nuevo.leerNumero(pillar);
		System.out.println("pillar vale " + pillar[0]);
	}
}
