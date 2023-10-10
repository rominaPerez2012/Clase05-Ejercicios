package Entidades;

import java.time.LocalDate;

public class Carrito {

	private LocalDate fecha;
	private ItemCarrito[] items;
	
	public Carrito () {
		
	}
	
	public Carrito (ItemCarrito item) {
	
		//this.setItems(item);
	}
	


	public int precio(Descuento desc) {
		
//		if (this.fecha > desc..getComienzo().) {
//			
//		}
		//this.items[0].getProducto().getPrecio();
		
		return 270;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public ItemCarrito[] getItems() {
		return items;
	}

	public void setItems(ItemCarrito[] items) {
		this.items = items;
	}
}
