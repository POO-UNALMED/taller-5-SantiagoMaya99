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
	public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona,
			List<Pez> listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		totalAnimales++;
		listado.add(this);
	}
	
	public Pez crearSalmon(int totalAnimales, String nombre, int edad, String genero, Zona zona,
			List<Pez> listado, int salmones, int bacalaos) {
		salmones++;
		return new Pez(totalAnimales,nombre,edad,"oceano",genero,zona,listado,salmones,bacalaos,"rojo",6);
	}
	
	public Pez crearBacalao(int totalAnimales, String nombre, int edad, String genero, Zona zona,
			List<Pez> listado, int salmones, int bacalaos) {
		bacalaos++;
		return new Pez(totalAnimales,nombre,edad,"oceano",genero,zona,listado,salmones,bacalaos,"gris",6);
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
