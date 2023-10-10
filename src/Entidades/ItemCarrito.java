package Entidades;

public class ItemCarrito {

	private int cantidad;
	private Producto producto;
	
	public ItemCarrito(int cantidad) {
		this.setCantidad(cantidad);
	}
	
	
	public int precio() {
		
		return this.producto.getPrecio() * this.cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
