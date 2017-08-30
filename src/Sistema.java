import java.util.Scanner;

public class Sistema {
	
	static Banco banco = new Banco();
	
	public Sistema() {
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int acumulador = 1;
		
		while(true) {
			System.out.println("********************************************************************");
			System.out.print("O que voce deseja fazer?\n1-Adicionar empregado\n2-Remover empregado\n3-Lancar um cartao de ponto\n4-Lancar um resultado venda" +
					"\n5-Lancar uma taxa de servico\n6-Alterar detalhes de um empregado\n7-Rodar a folha de pagamento para hoje, " +
					"\n8-Desfazer/refazer a ultima operacao\n9-Criacao de nova agenda de pagamento\n");
			int opcao = scanner.nextInt();			
			
			switch(opcao){
				case 1:					
					System.out.println("Qual o tipo de empregado:\n 1-Horista, 2-Assalariado, 3-Comissionado");
					int tipo = scanner.nextInt();
					System.out.println("Digite seu nome: ");
					String nome = scanner.next();
					System.out.println("Digite seu endereco:");
					String endereco = scanner.nextLine();
					scanner.nextLine();
					//Recebendo dados de acordo com os tipos especificos
					switch(tipo) {
						case 1:
							System.out.println("Digite seu salario por hora:");
							double salarioHora = scanner.nextDouble();
							Horista horista = new Horista(); //Instanciando um tipo de empregado horista
							horista.setNome(nome);
							horista.setEndereco(endereco);
							horista.setIdentification(acumulador);
							horista.setSalarioHora(salarioHora);
							horista.setType(tipo);
							
							banco.addF(horista);
							break;
						case 2:
							System.out.println("Digite seu salario mensal:");
							double salarioMensal = scanner.nextDouble();
							Assalariado assalariado = new Assalariado(); //Instanciando um tipo de empregado assalariado
							assalariado.setSalarioMensal(salarioMensal);
							assalariado.setNome(nome);
							assalariado.setEndereco(endereco);
							assalariado.setIdentification(acumulador);
							assalariado.setType(tipo);
							
							banco.addF(assalariado);
							break;
						case 3:
							System.out.println("Digite seu salario mensal:");
							double salMensal = scanner.nextDouble();
							System.out.println("Digite sua taxa de comissao:\n");
							String s = scanner.next();
							double taxaComissao = Double.parseDouble(s);
							Comissionado comissionado = new Comissionado(); //Instanciando um tipo de empregado comissionado
							comissionado.setSalMensal(salMensal);
							comissionado.setNome(nome);
							comissionado.setTaxaComissao(taxaComissao);
							comissionado.setEndereco(endereco);
							comissionado.setIdentification(acumulador);
							comissionado.setType(tipo);
							
							banco.addF(comissionado);
							break;
					}
					
					acumulador++;
					break;
					
				case 2:
					System.out.print("Digite a identificacao do funcionario a ser removido: ");
					int remove = scanner.nextInt();
					banco.remF(remove);
					break;
					
				case 3:
					System.out.println("Digite a identificacao do funcionario a ser lancado o cartao de pontos: ");
					int ident = scanner.nextInt();
					System.out.println("Digite o numero de horas trabalhadas");
					int horas = scanner.nextInt();
					System.out.println("Digite a data");
					String data = scanner.next();
					banco.lancarCartao(ident, data, horas);
					break;
					
				case 4:
					System.out.println("Digite a identificacao do funcionario a ser lancado resultado de vendas: ");
					int id = scanner.nextInt();
					System.out.println("Digite a data");
					String date = scanner.next();
					System.out.println("Digite o valor:");
					double valor = scanner.nextDouble();
					banco.lancarResutadoDeVenda(id, date, valor);
					break;
					
				case 5:
					System.out.println("Digite a taxa de serviço: ");
					double taxa = scanner.nextDouble();
					System.out.println("Digite a identificação do funcionário: ");
					int ide = scanner.nextInt();
					banco.lancarTaxaDeServico(ide, taxa);
					break;
					
				case 6:
					System.out.println("Digite a identificacao do funcionario que deseja alterar detalhes: ");
					int iden = scanner.nextInt();
					System.out.println("Digite a informaÃ§Ã£o que deseja alterar:\n1-Nome 2-Endereco 3-Metodo de pagamento 4-Status sindicato 5-Identificacao sindicato 6-Taxa sindical\n");
					int op = scanner.nextInt();
					banco.alterarDetalhes(iden,op);
					break;
				case 7:
					banco.gerarFolha("01/08/17");
					break;
			}
			System.out.println("********************************************************************");
		}
	}
}
