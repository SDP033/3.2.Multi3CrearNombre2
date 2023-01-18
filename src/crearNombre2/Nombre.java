package crearNombre2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nombre {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(in);

		String numero = br.readLine();

		if (numero.length() == 0) {

			System.out.println(-1);
			System.exit(-1);
		} else {
			try {
				Integer i = Integer.parseInt(numero);
				if (i < 0) {
					System.out.println(-2);
					System.exit(-2);
				} else {
					System.out.println(0);
					System.exit(0);
				}

			} catch (Exception e) {
				System.out.println("No has escrito un numero");

				System.out.println(-3);
				System.exit(-3);
			}
		}

	}

}
