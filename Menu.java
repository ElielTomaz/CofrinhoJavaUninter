package AtividadePratica;

import java.util.Scanner;

public class Menu {
	
	private Scanner sca;
	private Cofrinho cofrinho;
	
	public Menu() {
		sca = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
//Menu Principal em que o usuario podera escolher os comandos do programa	
	public void menuPrincipal() {
		System.out.println("Cofrinho de moedas do Eliel!");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Listar moedas");
		System.out.println("4-Calcular valor total convertido para reais");
		System.out.println("0-Encerrar programa");
		
		String opcao = sca.next();
		
//Todas as ações que serao executadas com base nas escolhas do usuario
		switch (opcao) {
		case "0":
			System.out.println("Programa encerrado!");
			break;
		
		case "1":
			adicionarMoedas();
			menuPrincipal();
			break;
			
		case "2":
			removerMoedas();
			menuPrincipal();
			break;
			
		case "3":
			cofrinho.listagemMoedas();
			menuPrincipal();
			break;
			
		case "4":
			double conversao = cofrinho.totalConvertido();
			String conversaoTexto = String.format("%2f", conversao);
			conversaoTexto = conversaoTexto.replace(".",",");
			System.out.println("O valor convertido é de R$ " + conversaoTexto);
			menuPrincipal();
			break;
			
		default:
			System.out.println("Opção invalida! Tente novamente!");
			menuPrincipal();
			break;
		}
		
	}
	
//Menu que aparece caso o usuario escolha adicionar moedas
	private void adicionarMoedas() {
		System.out.println("Escolha a moeda: ");
		System.out.println("1- Real: ");
		System.out.println("2- Dólar: ");
		System.out.println("3- Euro: ");
		
		int opcaoMoeda = sca.nextInt();
		
		System.out.println("Digite o valor: ");
		String valorTexto = sca.next();
		valorTexto = valorTexto.replace(",",".");
		double valorMoeda = Double.valueOf(valorTexto);
		Moeda moeda = null;
		
		if (opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro (valorMoeda);
		} else {
			System.out.println("Moeda invalida!");
		}
		
//Adicionar moeda no cofrinho
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adcionada!");	
	}
	
	
//Menu que aparece caso o usuario escolha remover moedas	
	private void removerMoedas() {
		System.out.println("Escolha a moeda: ");
		System.out.println("1- Real: ");
		System.out.println("2- Dólar: ");
		System.out.println("3- Euro: ");
		
		int opcaoMoeda = sca.nextInt();
		System.out.println("Digite o valor: ");
		String valorTextoDaMoeda = sca.next();
		valorTextoDaMoeda = valorTextoDaMoeda.replace(",",".");
		double valorMoeda = Double.valueOf(valorTextoDaMoeda);
		Moeda moeda = null;
		
		if(opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Moeda invalida!");
		}
		
		cofrinho.remover(moeda);
				}
}
