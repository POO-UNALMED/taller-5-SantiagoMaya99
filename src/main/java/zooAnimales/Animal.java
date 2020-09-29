package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	public Animal() {
		super();
		totalAnimales++;
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		super();
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		
	}

	public static String totalPorTipo() {
		return ("Mamiferos: " + Mamifero.getTotalMamiferos() + "\nAves: " + Ave.getTotalAves() + "\nReptiles: "
				+ Reptil.getTotalReptiles() + "\nPeces: " + Pez.getTotalPeces() + "\nAnfibios: "
				+ Anfibio.getTotalAnfibios());
	}
	
	public String movimiento() {
		return "desplazarse";
	}

	@Override
	public String toString() {
		if (zona != null) {
			return ("Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat
					+ " y mi genero es " + genero + ", la zona en la que me ubico es " + zona.getNombre() + ", en el "
					+ zona.getZoo().getNombre());
		} else {
			return ("Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat
					+ " y mi genero es " + genero);

		}

	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

}
