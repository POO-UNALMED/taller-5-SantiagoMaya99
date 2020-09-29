package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas=new ArrayList<Zona>();
	
	public Zoologico() {
		super();
	}
	public Zoologico(String nombre, String ubicacion, List<Zona> zonas) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public static int cantidadTotalAnimales() {
		return Animal.getTotalAnimales();
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
	
	

}
