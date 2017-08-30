import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	ArrayList<Horista> lHorista = new ArrayList<>();
	ArrayList<Comissionado> lComissionado = new ArrayList<>();
	ArrayList<Assalariado> lAssalariado = new ArrayList<>();
	ArrayList<Funcionario> lFuncionario = new ArrayList<>();
	
	//1 - Adicionar funcionario
	public void addF(Funcionario f) {
		lFuncionario.add(f); //Aqui o funcionario eh adicionado na lista geral de todos os tipos de funcionarios
		System.out.println("Funcionario "+f.getNome()+" cadastrado com sucesso!");
	}

	//Buscar funcionario
	public Funcionario buscarF(int ident) {
		Funcionario resultado = null;
		for(int i=0; i<lFuncionario.size(); ++i){
			if(ident == lFuncionario.get(i).getIdentification()){
				resultado = (lFuncionario.get(i));
			}
		}
		return resultado;
	}
	
	//2 - Remover funcionario
	public void remF(int ident) {
		for(int i=0; i<=lFuncionario.size(); ++i){
			if(ident == lFuncionario.get(i).getIdentification()){
				System.out.println("Funcionario "+lFuncionario.get(i).getNome()+" removido com sucesso!");
				lFuncionario.remove(i);
			}
		}
	}
	
	//3 - Lancar Cartao de Ponto
	public void lancarCartao(int ident, String data,int horas) {
		//Aqui alteramos o cartao de pontos do horista cuja identificacao foi passado como parametro
		if(ident == 1)
		{
			Horista h = (Horista) this.buscarF(ident);
			h.setCartao(new CartaoDePonto(data,horas));
		}
		else
		{
			System.out.print("Funcionário não é do tipo horista\n");
		}
	}
	
	//4 - Lancar Resultado de Venda
	public void lancarResutadoDeVenda(int ident,String data,double valor) {
		//Aqui alteramos o resultado de venda do comissionado cuja identificacao foi passado como parametro
		if(ident == 3)
		{
			Comissionado c = (Comissionado) this.buscarF(ident);
			c.setResultadoVenda(new ResultadoDeVenda(data,valor));
		}
		else
		{
			System.out.print("Funcionário não é do tipo comissionado\n");
		}
	}
	
	//5 - Lançar uma taxa de serviço
	public void lancarTaxaDeServico(int ident, double valor) {
		if(ident == 2)
		{
			Assalariado a = (Assalariado) this.buscarF(ident);
			a.setSalarioMensal(a.getSalarioMensal() + valor);
		}
		else
		{
			System.out.print("Funcionário não é do tipo assalariado\n");
		}
	}
	
	
	//6 - Alterar detalhes funcionario
	public void alterarDetalhes(int ident,int op) {
		Scanner scanner = new Scanner(System.in);
		
		switch (op){
			case 1: 
				System.out.print("Digite o novo nome: ");
				String nome = scanner.nextLine();
				this.buscarF(ident).setNome(nome);
				break;
				
			case 2:
				System.out.print("Digite seu novo endereco: ");
				String endereco = scanner.nextLine();
				this.buscarF(ident).setEndereco(endereco);
				break;
			
			case 3: 
				System.out.println("Digite o novo metodo de pagamento: ");
				String tipoPagamento = scanner.nextLine();
				this.buscarF(ident).setTipoPagamento(tipoPagamento);
				break;
			
			case 4:
				System.out.println("Digite o novo status no sindicado\n1-Sindicalizado 0-Nao Sindicalizado\n");
				int status = scanner.nextInt();
				boolean resultado = false;
				if(status == 1) {
					resultado = true;
				}
				else if(status == 0) {
					resultado = false;
				}
				this.buscarF(ident).getMembro().setSindicalizado(resultado);
				break;
				
			case 5:
				System.out.println("Digite a nova identificaÃ§Ã£o no sindicato: ");
				int identMembro = scanner.nextInt();
				this.buscarF(ident).getMembro().setIdentMembro(identMembro);
				break;
				
			case 6:
				System.out.println("Digite a nova taxa sindical: ");
				String s = scanner.next();
				double taxa = Double.parseDouble(s);
				this.buscarF(ident).getMembro().setTaxaSindicato(taxa);
				break;
		}
	}
	
	//7 - Gerar folha de pagamento
	public void gerarFolha(String data) {
		for(int i=0; i<lFuncionario.size(); ++i){
			Funcionario f =lFuncionario.get(i);
			Pagamento p = new Pagamento(f,"01/08/17");
			System.out.println(f.getNome());
			System.out.println(p);
		}
	}
}
