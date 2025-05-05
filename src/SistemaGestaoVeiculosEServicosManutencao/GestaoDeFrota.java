package SistemaGestaoVeiculosEServicosManutencao;

import java.util.Scanner;
import java.util.ArrayList;

class GestaoDeFrota {
	
	//Shows the Home menu
	static void menu() {
		System.out.println("---------------------------------");
		System.out.println("  	Sistema de Gestão de Veículos\n");
		System.out.println("1. Cadastro de Novo Veículo");
		System.out.println("2. Lista de Veículos");
		System.out.println("3. Excluir Veículo");
		System.out.println("4. Registrar Manutenção");
		System.out.println("5. Consulta Histórico de Manutenção");
		System.out.println("6. Exibir próxima Manutenção");
		System.out.println("7. Excluir Manutenção");
		System.out.println("8. Sair");
		System.out.println("---------------------------------");
	}
	
	//Tests if there is already a vehicle with the same plate, returns the result
	static boolean check(String placa,ArrayList<Veiculo> veiculos) {
		for(Veiculo veiculo : veiculos) {
			if(veiculo.getPlaca().equals(placa)) {return true;}
		}
		return false;
	}
	
	//Tests and Adds the vehicle 
	static void cadastroVeiculo(ArrayList<Veiculo> veiculos) {
		@SuppressWarnings ("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("  Cadastro de Veículo");
		System.out.println("É um Carro ou um Caminhão? 1 para Carro, 2 para Caminhão");
		int qualTipo = input.nextInt();input.nextLine();
		if(qualTipo == 1) {
			System.out.println("Placa: ");String placa = input.nextLine();
			boolean check = check(placa,veiculos);
			if(!check) {
				System.out.println("Marca: ");String marca = input.nextLine();
				System.out.println("Modelo: ");String modelo = input.nextLine();
				System.out.println("Ano: ");int ano = input.nextInt();
				System.out.println("Quilometragem: ");double kmRodados= input.nextDouble();
				System.out.println("Numero de Portas: ");int numeroPortas = input.nextInt();
				Carro carro = new Carro(placa,marca,modelo,ano,kmRodados,numeroPortas);
				veiculos.add(carro);
			}else {
				System.out.println("Veículo já cadastrado\nRetornando ao Menu\n");
					
			}
		}else if(qualTipo == 2) {
			System.out.println("Placa: ");String placa = input.nextLine();
			boolean check = check(placa,veiculos);
			if(!check) {
				System.out.println("Marca: ");String marca = input.nextLine();
				System.out.println("Modelo: ");String modelo = input.nextLine();
				System.out.println("Ano: ");int ano = input.nextInt();
				System.out.println("Quilometragem: ");double kmRodados= input.nextDouble();
				System.out.println("Capacidade de Carga: ");double capacidadeCarga = input.nextDouble();
				Caminhao caminhao = new Caminhao(placa,marca,modelo,ano,kmRodados,capacidadeCarga);
				veiculos.add(caminhao);
			}else {
				System.out.println("Veículo já cadastrado\nRetornando ao Menu\n");
					
			}
		}else {
			System.out.println("ERROR\n");
		}
	}
	
	//Shows all the vehicles in the system
	static void listaVeiculos(ArrayList<Veiculo> veiculos){
		if(veiculos.isEmpty()) {
			System.out.println("Lista Vazia\nCadastre novos Veiculos");
		}else {
			int i = 1;
			System.out.println("\n  Lista de Veículos");
			for(Veiculo veiculo:veiculos){
				System.out.println("\nVeículo " + i + ": ");
				veiculo.exibirInformacoes(true);
				i++;
				System.out.println();
			}
		}
		
	}
	
	//Excludes Vehicle
	static void excluirVeiculo(String placa,ArrayList<Veiculo>veiculos) {
		@SuppressWarnings ("resource")
		Scanner input = new Scanner(System.in);
		boolean found = false;
		if(veiculos.isEmpty()) {
			System.out.println("\nLista de Veículos Vazia\nRetornando ao Menu");
		}else {
			for(Veiculo veiculo:veiculos) {
				if(veiculo.getPlaca().equals(placa)) {
					System.out.println("Deseja excluir o Veículo de placa: " +placa + "\nModelo: " + veiculo.getModelo() + "\n(S/N)");
					String confirma = input.next();
					confirma.toUpperCase();
					found = true;
					switch(confirma) {
					case "S":System.out.println("Veículo Excluído\nRetornando");veiculos.remove(veiculo);break;
					case "N":System.out.println("Cancelando Exclusão\nRetornando ao Menu");break;
					default:System.out.println("Resposta Inválida\nCancelando Exclusão");
					}
				}
				if(found == true)break;
			}
			if(!found)System.out.println("\nPlaca não encontrada\nRetornando ao Menu\n");
		}
	}
	
	//Registers a Maintenance
	static void registrarManutencao(String placa,ArrayList<Veiculo>veiculos) {
		@SuppressWarnings ("resource")
		Scanner input = new Scanner(System.in);
		boolean found = false;
		if(veiculos.isEmpty()) {
			System.out.println("\nLista de Veículos Vazia\nRetornando ao Menu");
		}else {
			for(Veiculo veiculo:veiculos) {
				if(veiculo.getPlaca().equals(placa)) {
					System.out.println(veiculo.getPlaca());
					System.out.println("Data da Manutenção: ");
					String data = input.nextLine();
					System.out.println("Descrição: ");
					String descricao = input.nextLine();
					System.out.println("Quilometragem: ");input.reset();
					double kmRealizada = input.nextDouble();
					Manutencao manutencao = new Manutencao(data,descricao,kmRealizada);
					veiculo.adicionarManutencao(manutencao);
					veiculo.setKmRodados(kmRealizada);
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println("\nPlaca não encontrada\nRetornando ao Menu\n");
			}
		}
	}
	
	//Shows all the maintenances a vehicle has suffered
	static void historicoManutencoes(String placa,ArrayList<Veiculo>veiculos) {
		boolean found = false;
		if(veiculos.isEmpty()) {
			System.out.println("\nLista de Veículos Vazia\nRetornando ao Menu");
		}else {
			for(Veiculo veiculo:veiculos) {
				if(veiculo.getPlaca().equals(placa)) {
					found = true;
					if(veiculo.getManutencoes().isEmpty()) {
						System.out.println("   Veículo de Placa: " + placa + "\n");
						System.out.println("\nLista de Manutencoes Vazia\nRetornando ao Menu");
					}else {
						System.out.println("    Histórico de Manutenções");
						System.out.println("   Veículo de Placa: " + placa + "\n");
						int i = 1;
						for(Manutencao manutencao : veiculo.getManutencoes()) {
							System.out.println("Manutenção " + i + "\n");
							manutencao.exibirDetalhes();
							i++;
							System.out.println();
						}
					}
				}
			}
			if(!found){
				System.out.println("\nPlaca não encontrada\nVoltando ao Menu\n");
			}
		}
		
	}
	
	//Displays next Maintenance
	static void exibirProximaManutencao(String placa,ArrayList<Veiculo>veiculos) {
		boolean found = false;
		if(veiculos.isEmpty()) {
			System.out.println("Lista de Veículos Vazia\nRetornando ao Menu\n");
		}else {
			for(Veiculo veiculo:veiculos) {
				if(veiculo.getPlaca().equals(placa)) {
					found = true;
					System.out.println("Próxima Manutenção em: " + veiculo.calcularProximaManutencao()+ "km");
				}
			}
			if(!found){
				System.out.println("\nPlaca não encontrada\nVoltando ao Menu\n");
			}
		}
	}
	
	//Excludes Maintenance of a Vehicle
	static void excluirManutencao(String placa,double kmRealizada,ArrayList<Veiculo>veiculos) {
		@SuppressWarnings ("resource")
		Scanner input = new Scanner(System.in);
		boolean foundManutencao = false;
		boolean foundPlaca = false;
		if(veiculos.isEmpty()) {
			System.out.println("\nLista de Veículos Vazia\nRetornando ao Menu");
		}else {
			for(Veiculo veiculo:veiculos) {
				if(veiculo.getPlaca().equals(placa)) {
					foundPlaca = true;	
					for(Manutencao manutencao:veiculo.getManutencoes()) {
							if(manutencao.getKmRealizada()==kmRealizada) {
								System.out.println("Deseja excluir a Manutenção de Data: " + manutencao.getData() + " (S/N)?");
								String confirma = input.next();
								confirma.toUpperCase();
								foundManutencao = true;
								switch(confirma) {
								case "S":System.out.println("Manutenção Excluída\nRetornando ao Menu");veiculo.getManutencoes().remove(manutencao);break;
								case "N":System.out.println("Exclusão Cancelada\nRetornando ao Menu");break;
								default:System.out.println("Opção Inválida\nRetornando ao Menu");
								}
							}
							if(foundManutencao == true)break;
					}
					if(!foundManutencao) {
						System.out.println("Manutenção não Encontrada");
					}
				}
			}
			if(!foundPlaca)System.out.println("\nPlaca não encontrada\nRetornando ao Menu\n");
		}
	}
	
	public static void main(String[]args) {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		Scanner teclado = new Scanner(System.in);
		int option;
		do {
			menu();
			option = teclado.nextInt();
			switch(option) {
			case 1:cadastroVeiculo(veiculos);break;
			case 2:listaVeiculos(veiculos);break;
			case 3:System.out.println("Placa do Veículo: ");excluirVeiculo(teclado.next(),veiculos);break;
			case 4:System.out.println("Placa do Veículo: ");registrarManutencao(teclado.next(),veiculos);break;
			case 5:System.out.println("Placa do Veículo: ");historicoManutencoes(teclado.next(),veiculos);break;
			case 6:System.out.println("Placa do Veículo: ");exibirProximaManutencao(teclado.next(),veiculos);break;
			case 7:System.out.println("Placa do Veículo: ");String placa = teclado.next();System.out.println("Quilometragem da Manutenção: ");excluirManutencao(placa,teclado.nextDouble(),veiculos);break;
			case 8:System.out.println("Saindo...");;break;
			default:System.out.println("Opção Inválida\nEscolha entre 1 a 6\n");
			
			}
		}while(option != 6);
	
		teclado.close();
	}
	
}
