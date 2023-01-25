package gestao_reciclados;

public class Lata {
	private double peso;
	private double pesoUnitario;
	private double valorAproximado;

	public Lata(double peso, double pesoUnitario, double valorAproximado) {
		this.peso = peso;
		this.pesoUnitario = pesoUnitario;
		this.valorAproximado = valorAproximado;
	}

	public double getPesoUnitario() {
		return pesoUnitario;
	}

	public void setPesoUnitario(double pesoUnitario) {
		this.pesoUnitario = pesoUnitario;
	}

	public double getValorAproximado() {
		return valorAproximado;
	}

	public void setValorAproximado(double valorAproximado) {
		this.valorAproximado = valorAproximado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
