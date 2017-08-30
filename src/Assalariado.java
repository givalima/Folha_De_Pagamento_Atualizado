
public class Assalariado extends Funcionario{
	private double salarioMensal;
	
	public Assalariado() {
		
	}

	public Assalariado(double salarioMensal) {
		super();
		this.salarioMensal = salarioMensal;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}
