
public class CartaoDePonto {
	private String data;
	private int horasTrabalhadas;
	
	public CartaoDePonto(String data, int horasTrabalhadas) {
		super();
		this.data = data;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
}
