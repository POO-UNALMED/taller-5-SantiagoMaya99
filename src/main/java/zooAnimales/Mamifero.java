package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Mamifero extends Animal {
	private List<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	private static int totalMamiferos;
	
	public Mamifero() {
		super();
		totalMamiferos++;
		listado.add(this);
	}
	public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona,
			List<Mamifero> listado, int caballos, int leones, boolean pelaje, int patas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
		totalMamiferos++;
		listado.add(this);

	}
	
	
	public Mamifero crearCaballo(int totalAnimales, String nombre, int edad, String genero, Zona zona,
			List<Mamifero> listado, int caballos, int leones) {
		caballos++;
		return new Mamifero(totalAnimales,nombre,edad,"pradera",genero,zona,listado,caballos,leones,true,4);
	}
	
	public Mamifero crearLeon(int totalAnimales, String nombre, int edad, String genero, Zona zona,
			List<Mamifero> listado, int caballos, int leones) {
		leones++;
		return new Mamifero(totalAnimales,nombre,edad,"selva",genero,zona,listado,caballos,leones,true,4);
	}
	
	public int cantidadMamiferos(){
		return listado.size();
	}
	
	
	
	public List<Mamifero> getListado() {
		return listado;
	}
	public void setListado(List<Mamifero> listado) {
		this.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static int getTotalMamiferos() {
		return totalMamiferos;
	}
	public static void setTotalMamiferos(int totalMamiferos) {
		Mamifero.totalMamiferos = totalMamiferos;
	}
	


}
