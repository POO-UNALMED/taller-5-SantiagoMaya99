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
	public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		totalAnfibios++;
		listado.add(this);
	}
	
	
	public Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
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
