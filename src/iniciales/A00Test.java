package iniciales;

public class A00Test {
public static void main(String[] args) {
	int a=10,b=0,c;
	try {
		System.out.println("empieza la ejecucion");
		System.out.println("el resultado es "+a/b);
		System.out.println("que bien me ha salido");
	} catch (Exception e) {
		System.out.println("error porque "+e.getMessage());
		System.out.println("el resultado es "+a/1);
		e.printStackTrace();
	}
	System.out.println("ya fuera de la excepcion");
}
}
