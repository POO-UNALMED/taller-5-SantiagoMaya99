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
	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public  int cantidadTotalAnimales() {
		int count=0;
		for(int i=0;i<zonas.size();i++) {
			count+=zonas.get(i).cantidadAnimales();
		}
		
		return count;
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
	public List<Zona> getZona() {
		return zonas;
	}
	public void setZona(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
	
	

}
