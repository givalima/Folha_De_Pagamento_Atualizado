import java.util.Date;


public class TaxaServico {
	private String data;
	private double valor;
	public TaxaServico(String data, double valor) {
		super();
		this.data = data;
		this.valor = valor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
