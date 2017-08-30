
public class Pagamento {
	private Funcionario f;
	private String data;
	
	
	
	public Pagamento(Funcionario f, String data) {
		super();
		this.f = f;
		this.data = data;
	}

	@Override
	public String toString() {
		String resultado = "";
		
		if(f.getType() == 1) {
			Horista h = (Horista) f;
			resultado = "HORISTA ->	"
					+"\nNome: "+h.getNome()+"\nHoras: "+h.getCartao().getHorasTrabalhadas()+"\nSalario: "+h.getSalarioTotal()+
					"\nMetodo: "+h.getTipoPagamento()+"\n";
		}
		else if(f.getType() == 2) {
			Assalariado a = (Assalariado) f;
			resultado = "ASSALARIADO -> "	
					+"\nNome: "+a.getNome()+"\nSalario: "+a.getSalarioMensal()+"\nMetodo: "+a.getTipoPagamento()+"\n";
		}
		else if(f.getType() == 3) {
			Comissionado a = (Comissionado) f;
			resultado = "COMISSIONADO -> "
					+"\nNome: "+a.getNome()+"\nSalario Fixo: "+a.getSalMensal()+"\nVendas: "+a.getResultadoVenda().getValor()+"\nComissao: "+a.getTaxaComissao()*a.getResultadoVenda().getValor()+"\nSalario Total: "+a.getSalTotal()+"\nMetodo: "+a.getTipoPagamento()+"\n";
		}
		return resultado;
	}

	public Funcionario getF() {
		return f;
	}

	public void setF(Funcionario f) {
		this.f = f;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}	
}
