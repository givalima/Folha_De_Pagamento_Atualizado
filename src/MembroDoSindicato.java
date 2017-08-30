
public class MembroDoSindicato {
	private int identMembro;
	private double taxaSindicato;
	private boolean sindicalizado;
	
	public MembroDoSindicato() {
		
	}
	
	public MembroDoSindicato(int identMembro, double taxaSindicato, boolean sindicalizado) {
		super();
		this.identMembro = identMembro;
		this.taxaSindicato = taxaSindicato;
		this.sindicalizado = sindicalizado;
	}
	
	public int getIdentMembro() {
		return identMembro;
	}
	
	public void setIdentMembro(int identMembro) {
		this.identMembro = identMembro;
	}
	
	public double getTaxaSindicato() {
		return taxaSindicato;
	}
	
	public void setTaxaSindicato(double taxaSindicato) {
		this.taxaSindicato = taxaSindicato;
	}

	public boolean isSindicalizado() {
		return sindicalizado;
	}

	public void setSindicalizado(boolean sindicalizado) {
		this.sindicalizado = sindicalizado;
	}
}
