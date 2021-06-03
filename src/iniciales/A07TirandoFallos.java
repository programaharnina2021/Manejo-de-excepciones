package iniciales;

public class A07TirandoFallos {
	public int divideByZero() throws ArithmeticException {
		return 25 / 0;
	}

	public static void main(String[] args) {

		Otra instancia = new Otra();
		int valor = 0;
		try {
			valor = instancia.llamandoErrores();
			System.out.println("mi valor " + valor);
		} catch (ArithmeticException e) {
			System.out.println("fallo");
		}
	}

}

class Otra {
	A07TirandoFallos instancia = new A07TirandoFallos();

	public int[] createArray(int size) {
		return new int[size];
	}

	public int llamandoErrores() throws ArithmeticException {
		int valor = 0;
		// Como obligar al tratamiento del error
		valor = instancia.divideByZero();
		return valor;
	}
}
