package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Anfibio extends Animal {
	private List<Anfibio> listado =new ArrayList<>();
	public static  int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	private static int totalAnfibios;
	public Anfibio() {
		super();
		totalAnfibios++;
		listado.add(this);
	}
	public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona,
			List<Anfibio> listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		totalAnimales++;
		listado.add(this);
	}
	
	public Anfibio crearRana(int totalAnimales, String nombre, int edad, String genero, Zona zona,
			List<Anfibio> listado, int ranas, int salamandras) {
		ranas++;
		return new Anfibio(totalAnimales,nombre,edad,"selva",genero,zona,listado,ranas,salamandras,"rojo",true);
	}
	
	public Anfibio crearSalamandra(int totalAnimales, String nombre, int edad, String genero, Zona zona,
			List<Anfibio> listado, int ranas, int salamandras) {
		salamandras++;
		return new Anfibio(totalAnimales,nombre,edad,"selva",genero,zona,listado,ranas,salamandras,"negro y amarillo",false);
	}
	
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	
	public List<Anfibio> getListado() {
		return listado;
	}
	public void setListado(List<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public static int getTotalAnfibios() {
		return totalAnfibios;
	}
	public static void setTotalAnfibios(int totalAnfibios) {
		Anfibio.totalAnfibios = totalAnfibios;
	}
	
	

}
