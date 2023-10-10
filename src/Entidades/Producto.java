package Entidades;

public class Producto {
	
	private int precio;
	private String nombre;
	
	public Producto(String nombre) {
		this.setNombre(nombre);		
	}

	public Producto(String nombre, int precio) {
		this.setNombre(nombre);		
		this.setPrecio(precio);
	}
	
	public int getPrecio() {
		
		return this.precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
