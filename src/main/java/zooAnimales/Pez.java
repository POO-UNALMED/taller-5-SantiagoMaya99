package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Pez extends Animal {
	private List<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	private static int totalPeces;
	public Pez() {
		super();
		totalPeces++;
		listado.add(this);
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		totalPeces++;
		listado.add(this);
	}
	
	public Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	
	public Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	
	public List<Pez> getListado() {
		return listado;
	}
	public void setListado(List<Pez> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public static int getTotalPeces() {
		return totalPeces;
	}
	public static void setTotalPeces(int totalPeces) {
		Pez.totalPeces = totalPeces;
	}

}
