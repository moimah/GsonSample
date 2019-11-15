package dad.maven.gson;

import java.util.*;

public class Persona {

	private String nombre;
	private String apellidos;
	private Integer edad;

	public Persona(String nombre, String apellidos, Integer edad) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	/*
	 * Este constructor sin parámetros llama automaticamente al método:
	 * introducirDatos(), al instanciar un objeto automaticamente se podrá rellenar
	 * dicho objeto.
	 */
	public Persona() {
		IntroducirDatos();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	/*
	 * Hace uso de la clase Scanner para introducir datos en cada parámetro Captura
	 * excepciones al introducir datos incorrectos (edad) Devuelve por pantalla los
	 * datos introducidos
	 */

	public void IntroducirDatos() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre");
		this.nombre = sc.next();
		System.out.println("Introduce los apellidos");
		this.apellidos = sc.next();

		// A continuación verificación de entrada númerica

		while (edad == null) {

			System.out.println("Introduce la edad");
			try {
				this.edad = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
			}

		}

		sc.close();

		System.out.println("Nombre: " + this.nombre + ", Apellidos: " + this.apellidos + ", Edad: " + edad);
	}

}
