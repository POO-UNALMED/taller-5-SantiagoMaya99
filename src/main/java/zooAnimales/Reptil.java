package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Reptil extends Animal {
	private static List<Reptil> listado= new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	private static int totalReptiles;
	public Reptil() {
		super();
		totalReptiles++;
		listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		totalReptiles++;
		listado.add(this);
	}
	
	
	
	public static  Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre,edad,"humedal",genero,"verde",3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad,  String genero) {
		serpientes++;
		return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
	}
	
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static List<Reptil> getListado() {
		return listado;
	}
	public static void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public static int getTotalReptiles() {
		return totalReptiles;
	}
	public static void setTotalReptiles(int totalReptiles) {
		Reptil.totalReptiles = totalReptiles;
	}
	

}
