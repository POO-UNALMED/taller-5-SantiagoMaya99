package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Reptil extends Animal {
	private List<Reptil> listado= new ArrayList<Reptil>();
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
	public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona,
			List<Reptil> listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		totalAnimales++;
		listado.add(this);
	}
	
	
	
	public Reptil crearIguana(int totalAnimales, String nombre, int edad, String genero, Zona zona,
			List<Reptil> listado, int iguanas, int serpientes) {
		iguanas++;
		return new Reptil(totalAnimales,nombre,edad,"humedal",genero,zona,listado,iguanas,serpientes,"verde",3);
	}
	
	public Reptil crearSerpiente(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona,
			List<Reptil> listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		serpientes++;
		return new Reptil(totalAnimales,nombre,edad,"jungla",genero,zona,listado,iguanas,serpientes,"blanco",1);
	}
	
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public List<Reptil> getListado() {
		return listado;
	}
	public void setListado(List<Reptil> listado) {
		this.listado = listado;
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
