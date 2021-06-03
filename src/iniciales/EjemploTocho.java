package iniciales;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploTocho {

	public static void main(String[] args) {
		File miArchivo = new File("cosica.data");
		if (miArchivo.exists()) {
			System.out.println("existe");
		} else {
			System.out.println("no existe");
			boolean seguir = false;
			do {
				try {
					FileWriter flujoW = new FileWriter(miArchivo);
					seguir = true;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("error");
					e.printStackTrace();
				}
			} while (seguir);
		}

	}

}
