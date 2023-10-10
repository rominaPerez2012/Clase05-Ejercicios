package Entidades;

public class DescuentoFijo extends Descuento {

	private int monto;
	
	public int descuento(int base) {
		return base - this.monto;
	}
}
