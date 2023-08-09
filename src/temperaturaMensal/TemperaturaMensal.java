package temperaturaMensal;

import temperaturaMensal.meses.Meses;

public class TemperaturaMensal {
	private Meses mes;
	private double temperatura;
	
	public TemperaturaMensal(Meses mes, double temperatura) {
		this.mes = mes;
		this.temperatura = temperatura;
	}
	
	public Meses getMes() {
		return mes;
	}
	public void setMes(Meses mes) {
		this.mes = mes;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
}
