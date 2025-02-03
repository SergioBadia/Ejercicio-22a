package ejercicio22atema6;

import java.util.Scanner;

public class Ej22a {

	public static class Palabra {
		String termino;
		String definicion;

		public Palabra(String termino, String definicion) {
			this.termino = termino;
			this.definicion = definicion;

		}

		public String getTermino() {
			return termino;
		}

		public void setTermino(String termino) {
			this.termino = termino;
		}

		public String getDefinicion() {
			return definicion;
		}

		public void setDefinicion(String definicion) {
			this.definicion = definicion;
		}
	}

	static void mostrarMenu() {
		System.out.println("Seleccione opción:");
		System.out.println("1. Introducir un término y su defición en el diccionario");
		System.out.println("2. Mostrar todos los términos (sin definiciones)");
		System.out.println("3. Obtener la definición de un término");
		System.out.println("4. Eliminar un término y su definición");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Palabra[] diccionario = new Palabra[100];
		int opcion;
		int contadorPalabra = 0;

		do {
			System.out.println("-------------------");
			mostrarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Introduce un término: ");
				String termino = sc.next();
				sc.nextLine();
				System.out.print("Introduce la definición: ");
				String definicion = sc.nextLine();
				diccionario[contadorPalabra] = new Palabra(termino, definicion);
				contadorPalabra++;
				break;

			case 2:
				for (int i = 0; i < contadorPalabra; i++) {
					System.out.println(diccionario[i].getTermino());
				}
				break;

			case 3:

			}

		} while (opcion != 0);

	}

}
