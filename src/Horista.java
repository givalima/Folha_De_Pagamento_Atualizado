
public class Horista extends Funcionario{
	private double salarioHora;
	private CartaoDePonto cartao;	
	private double salarioTotal;

	public Horista() {
		
	}

	public Horista(String nome, String endereco, int type, int identification) {
		super(nome, endereco, type, identification);
		// TODO Auto-generated constructor stub
	}

	public Horista(float salarioHora) {
		super();
		this.salarioHora = salarioHora;
	}
	
	public double getSalarioHora() {
		return salarioHora;
	}
	
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public CartaoDePonto getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDePonto cartao) {
		this.cartao = cartao;
	}

	public double getSalarioTotal() {
		int horas = cartao.getHorasTrabalhadas();
		int horasExtras = horas - 8;
		if(horas > 8) {
			salarioTotal = (salarioHora*horas) + (salarioHora*horasExtras*1.5);
		}
		else {
			salarioTotal = (salarioHora*horas);
		}
		return salarioTotal;
	}

	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}	
}
