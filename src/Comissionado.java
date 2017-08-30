
public class Comissionado extends Funcionario{
	private double taxaComissao;
	private double salMensal;
	private double salTotal;
	private ResultadoDeVenda resultadoVenda;

	public Comissionado() {
		
	}
	

	public Comissionado(double taxaComissao, float salMensal) {
		super();
		this.taxaComissao = taxaComissao;
		this.salMensal = salMensal;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	public double getSalMensal() {
		return salMensal;
	}

	public void setSalMensal(double salMensal) {
		this.salMensal = salMensal;
	}


	public ResultadoDeVenda getResultadoVenda() {
		return resultadoVenda;
	}

	public void setResultadoVenda(ResultadoDeVenda resultadoVenda) {
		this.resultadoVenda = resultadoVenda;
	}

	public double getSalTotal() {
		salTotal = (salMensal/2)+(resultadoVenda.getValor()*taxaComissao);
		return salTotal;
	}

	public void setSalTotal(double salTotal) {
		this.salTotal = salTotal;
	}	
}
