
class NodoPila {
	public NodoPila(double dato, NodoPila abajo) {
		this.dato = dato;
		this.abajo = abajo;
	}

	public NodoPila abajo;
	public double dato;
}
