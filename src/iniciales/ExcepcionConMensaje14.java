package Iniciales;

 
class MiExcepcion14 extends Exception {
	MiExcepcion14(String mensaje) {
//		Al crear la excepcion le doy un mensaje que subo al constructor
//		del padre. De esa forma puedo acceder al mensaje de la excepcion
		super(mensaje);
	}
}

public class ExcepcionConMensaje14 {
	int divisor = 0;

	public void viendoFallo() throws MiExcepcion14 {
		if (divisor == 0)
			throw new MiExcepcion14("Error generado en viendoFallo()");
	}

	public static void main(String[] args) {
		ExcepcionConMensaje14 nuevo = new ExcepcionConMensaje14();
		try {
			nuevo.viendoFallo();			
		} catch (MiExcepcion14 e) {
			//Usando el m�todo de Exception para mi excepcion
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
	}

}