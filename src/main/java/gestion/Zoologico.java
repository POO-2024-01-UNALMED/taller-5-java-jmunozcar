package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	 
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico() {
		this(null, null);
	}
	
	public int cantidadTotalAnimales() {
		int contador = 0;
		
		for(int zona = 0; zona < zonas.size(); zona++) {
			contador = contador + zonas.get(zona).getAnimales().size();
		}
		
		return contador;
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
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	

}