package Entidades;

public class DescuentoPorcentaje extends Descuento {

	private Double porcentaje;
	
	public int descuento(int base) {
		return (int) (base*this.porcentaje);
	}
}
