
public class Funcionario {
	private String nome;
	private String endereco;
	private int type;
	private int identification;
	private MembroDoSindicato membro = new MembroDoSindicato();
	private String tipoPagamento;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String endereco, int type, int identification) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.type = type;
		this.identification = identification;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getIdentification() {
		return identification;
	}
	
	public void setIdentification(int identification) {
		this.identification = identification;
	}

	public MembroDoSindicato getMembro() {
		return membro;
	}

	public void setMembro(MembroDoSindicato membro) {
		this.membro = membro;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}


