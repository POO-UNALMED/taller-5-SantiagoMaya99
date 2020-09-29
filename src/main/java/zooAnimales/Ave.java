package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Ave extends Animal {
	private List<Ave> listado= new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	private static int totalAves;
	
	
	public Ave() {
		super();
		totalAves++;
		listado.add(this);
	}
	public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona,
			List<Ave> listado, int halcones, int aguilas, String colorPlumas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
		totalAves++;
		listado.add(this);
	}
	
	public Ave crearHalcon(int totalAnimales, String nombre, int edad, String genero, Zona zona,
			List<Ave> listado, int halcones, int aguilas) {
		halcones++;
		return new Ave(totalAnimales,nombre,edad,"montanas",genero,zona, listado,halcones,aguilas,"cafe glorioso");
	}
	
	public Ave crearAguila(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona,
			List<Ave> listado, int halcones, int aguilas, String colorPlumas) {
		aguilas++;
		return new Ave(totalAnimales,nombre,edad,"montanas",genero,zona, listado,halcones,aguilas,"blanco y amarillo");
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public List<Ave> getListado() {
		return listado;
	}
	public void setListado(List<Ave> listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public static int getTotalAves() {
		return totalAves;
	}
	public static void setTotalAves(int totalAves) {
		Ave.totalAves = totalAves;
	}
	
	

}
