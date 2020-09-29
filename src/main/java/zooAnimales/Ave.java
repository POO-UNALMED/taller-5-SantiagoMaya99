package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Ave extends Animal {
	private static List<Ave> listado= new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	private static int totalAves;
	
	
	public Ave() {
		super();
		totalAves++;
		listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		totalAves++;
		listado.add(this);
	}
	
	public static Ave crearHalcon( String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String habitat, String genero) {
		aguilas++;
		return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static List<Ave> getListado() {
		return listado;
	}
	public static void setListado(List<Ave> listado) {
		Ave.listado = listado;
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
