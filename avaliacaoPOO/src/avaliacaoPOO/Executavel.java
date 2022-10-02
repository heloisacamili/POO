package avaliacaoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<calca>listaDeCalcas = new ArrayList<>();
		ArrayList<camisas>listaDeCamisas = new ArrayList<>();
		
		do {
			System.out.println("\nMENU"
					+"\n1- Cadastrar"
					+"\n2- Listar"
					+"\n3- Editar"
					+"\n4- Remover"
					+"\n5- Fechar");
			int escolha = sc.nextInt();
			switch (escolha) {
			case 1: {
				int opcao;
				do {
					System.out.println("\nVocê deseja cadastrar qual peça?"
							+"\n1- Camisa"
							+"\n2- Calça"
							+"\n3- Voltar");
					opcao = sc.nextInt();
					switch (opcao) {
					case 1: {
						System.out.print("\nInforme o tipo da camisa: ");
						String tipo = sc.next();
						System.out.print("Informe a cor da camisa: ");
						String cor = sc.next();
						System.out.print("Informe o custo da camisa: "
								+"\nR$");
						double custo = sc.nextDouble();
						System.out.print("Estampa: ");
						boolean estampa = sc.nextBoolean();
						listaDeCamisas.add(new camisas (tipo, cor, custo, estampa));
						break;
					}
					case 2: {
						System.out.print("\nInforme o tecido da calça: ");
						String tecido = sc.next();
						System.out.print("Informe o gênero da calça: ");
						String genero = sc.next();
						System.out.print("Informe o tipo da calça: ");
						String tipo = sc.next();
						System.out.print("Informe o custo da calça: "
								+"\nR$");
						double custo = sc.nextDouble();
						listaDeCalcas.add(new calca(tecido, genero, tipo, custo));
						break;
					}
					}
				} while (opcao != 3);
				break;
			}
			case 2: {
				int listar;
				do {
					System.out.println("\nMENU"
							+"\nListar: "
							+"\n1- Uma camisa/calça."
							+"\n2- Todas as camisas/calças"
							+"\n3- Voltar");
					listar = sc.nextInt();
					switch (listar) {
					case 1: {
						System.out.println("\nDeseja listar: "
								+"\n1- Calça"
								+"\n2- Camisa");
						int escolhaListar = sc.nextInt();
						switch (escolhaListar) {
						case 1: {
							System.out.print("\nInforme o código da peça de roupa: ");
							int codigoEscolhido = sc.nextInt();
							for(int i = 0; i < listaDeCalcas.size(); i++) {
								if (codigoEscolhido == listaDeCalcas.get(i).getCodigo()) {
									System.out.println(listaDeCalcas.get(i).getMostrarInformacoes());
								}
							}
							break;
						}
						case 2: {
							System.out.print("\nInforme o código da peça de roupa: ");
							int codigoEscolhido = sc.nextInt();
							for (int i = 0; i < listaDeCamisas.size(); i++) {
								if (codigoEscolhido == listaDeCamisas.get(i).getCodigo()) {
									System.out.println(listaDeCamisas.get(i).getMostrarInformacoes());
								}
							}
							break;
						}
						}
						break;
					}
					case 2: {
						System.out.println("\nListar todas: "
								+"\n1- Calças"
								+"\n2- Camisas");
						int opcaoListar = sc.nextInt();
						switch (opcaoListar) {
						case 1: {
							for(int i = 0; i < listaDeCalcas.size(); i++) {
								System.out.println(listaDeCalcas.get(i).getMostrarInformacoes());
							}
							break;
						}
						case 2: {
							for(int i = 0; i < listaDeCamisas.size(); i++) {
								System.out.println(listaDeCamisas.get(i).getMostrarInformacoes());
							}
							break;
						}
						}
						break;
					}
					}
				} while (listar != 3);
				break;
			}
			case 3: {
				int escolhaEdicao;
				do {
					System.out.println("\nInforme o que deseja editar: "
							+"\n1- Camisa"
							+"\n2- Calça"
							+"\n3- Voltar");
					escolhaEdicao = sc.nextInt();
					
					switch (escolhaEdicao) {
					case 1: {
						System.out.println("\nInforme o código da peça a ser editada: ");
						int codigoEscolhido = sc.nextInt();
						for(int i = 0; i < listaDeCamisas.size(); i++) {
							if (codigoEscolhido == listaDeCamisas.get(i).getCodigo()) {
								int escolha2;
								do {
									System.out.println("\nEscolha a opção a ser editada: "
											+"\n1- Tipo"
											+"\n2- Cor"
											+"\n3- Custo"
											+"\n4- Estampa"
											+"\n5- Voltar");
									escolha2 = sc.nextInt();
									switch (escolha2) {
									case 1: {
										System.out.print("\nInforme o novo tipo: ");
										String novoTipo = sc.next();
										listaDeCamisas.get(i).setTipo(novoTipo);
										break;
									}
									case 2: {
										System.out.print("\nInforme a nova cor: ");
										String novaCor = sc.next();
										listaDeCamisas.get(i).setCor(novaCor);
										break;
									}
									case 3: {
										System.out.print("\nInforme o novo custo: R$");
										double novoCusto = sc.nextDouble();
										listaDeCamisas.get(i).setCusto(novoCusto);
										break;
									}
									case 4: {
										System.out.print("\nInforme se a peça contém estampa: ");
										boolean novaEstampa = sc.nextBoolean();
										listaDeCamisas.get(i).setEstampa(novaEstampa);
										break;
									}
									}
								} while (escolha2 != 5);
							}
						}
						break;
					}
					case 2: {
						System.out.println("\nInforme o código da peça a ser editada: ");
						int codigoEscolhido = sc.nextInt();
						for(int i = 0; i < listaDeCamisas.size(); i++) {
							if (codigoEscolhido == listaDeCamisas.get(i).getCodigo()) {
								int escolha2;
								do {
									System.out.println("\nEscolha a opção a ser editada: "
											+"\n1- Tecido"
											+"\n2- Gênero"
											+"\n3- Tipo"
											+"\n4- Custo"
											+"\n5- Voltar");
									escolha2 = sc.nextInt();
									
									switch (escolha2) {
									case 1: {
										System.out.print("\nInforme o novo tipo de tecido:");
										String novoTecido = sc.next();
										listaDeCalcas.get(i).setTecido(novoTecido);
										break;
									}
									case 2: {
										System.out.print("\nInforme o novo gênero: ");
										String novoGenero = sc.next();
										listaDeCalcas.get(i).setGenero(novoGenero);
										break;
									}
									case 3: {
										System.out.print("\nInforme o novo tipo: ");
										String novoTipo = sc.next();
										listaDeCalcas.get(i).setTipo(novoTipo);
										break;
									}
									case 4: {
										System.out.println("\nInforme o novo custo: R$");
										double novoCusto = sc.nextDouble();
										listaDeCalcas.get(i).setCusto(novoCusto);
										break;
									}
									}
								} while (escolha2 != 5);
							}
						}
						break;
					}
					}
				} while (escolhaEdicao != 3);
				
				break;
			}
			case 4: {
				System.out.println("\nInforme qual o tipo de peça que deseja remover: "
						+"\n1- Calça"
						+"\n2- Camisa");
				int escolhaRemover = sc.nextInt();
				switch (escolhaRemover) {
				case 1: {
					System.out.println("\nInforme o código da peça de roupa: ");
					int codigoEscolhido = sc.nextInt();
					for (int i = 0; i < listaDeCalcas.size(); i++) {
						if (codigoEscolhido == listaDeCalcas.get(i).getCodigo()) {
							listaDeCalcas.remove(i);
						}	
					}
					break;
				}
				case 2: {
					System.out.println("\nInforme o código da peça de roupa: ");
					int codigoEscolhido = sc.nextInt();
					for (int i = 0; i < listaDeCamisas.size(); i++) {
						if (codigoEscolhido == listaDeCamisas.get(i).getCodigo()) {
							listaDeCamisas.remove(i);
						}
					}
				}
				}
				break;
			}
			case 5: {
				System.exit(0);
			}
			}
		} while (true);
	}

}