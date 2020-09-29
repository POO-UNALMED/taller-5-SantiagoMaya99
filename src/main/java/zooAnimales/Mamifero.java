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
	public Mamifero(String nombre, int edad, String habitat, String genero,boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		totalMamiferos++;
		listado.add(this);

	}
	
	
	public Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre,edad,"pradera",genero,true,4);
	}
	
	public Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre,edad,"selva",genero,true,4);
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
