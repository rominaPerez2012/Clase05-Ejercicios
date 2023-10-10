package Entidades;

import java.time.LocalDate;

public abstract class Descuento {

	private LocalDate comienzo;
	private LocalDate fin;
	
	public int descuento(int base) {
		return base;
	}
	
	public LocalDate getComienzo() {
		return comienzo;
	}

	public void setComienzo(LocalDate comienzo) {
		this.comienzo = comienzo;
	}

	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}


}
