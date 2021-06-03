package Iniciales;

public class A08TirarASolucion {
	int divisor = 0;

	public void viendoFallo() {
		if (divisor == 0)
			throw new ArithmeticException("el divisor era cero");
	}

	public static void main(String[] args) {
		A08TirarASolucion instancia = new A08TirarASolucion();
		try {
			instancia.viendoFallo();
		} catch (Exception e) {
			System.out.println("pillando mi excepcion");
			System.out.println(e.getMessage());
		}
	}
}
