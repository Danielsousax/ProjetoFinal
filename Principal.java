//Daniel Pablo Mesquita de Sousa Junior - 2331063

public class Principal {

    public static void main(String[] args) {

        Mostra mostraDados = new Mostra();
        Leitura leitura = new Leitura();

        int id;
        int idade;
        float peso;
        String saude;
        String raca;
        int cpf = 465456;
        String nome = "jose";
        int codFazendeiro = 154;
        int opcao;

        do {

            Animal animal = null;
            System.out.println("\nDigite o tipo de animal que deseja cadastrar:");
            System.out.println("1 - Vaca");
            System.out.println("2 - Porco");
            System.out.println("3 - Galinha");
            System.out.println("4 - Cavalo");
            System.out.println("5 - Mostrar animais cadastrados");
            System.out.println("0 - Sair\n");

            System.out.print("Opcao: ");
            opcao = leitura.entDadosInt("");

            switch (opcao) {
                case 1 -> {
                    animal = new Vaca();
                    System.out.print("Digite o ID do animal: ");
                    id = leitura.entDadosInt("");
                    animal.setId(id);

                    System.out.print("Digite a idade do animal: ");
                    idade = leitura.entDadosInt("");
                    animal.setIdade(idade);

                    System.out.print("Digite o peso do animal: ");
                    peso = leitura.entDadosFloat("");
                    animal.setPeso(peso);

                    System.out.print("Digite a saude do animal: ");
                    saude = leitura.entDados("");
                    animal.setSaude(saude);

                    System.out.print("Digite a raca do animal: ");
                    raca = leitura.entDados("");
                    animal.setRaca(raca);

                    try {
                        System.out.print("\nDigite a quantidade de leite produzido pela vaca diariamente (Em litros): ");
                        float qtdLeite = leitura.entDadosFloat("");
                        ((Vaca) animal).setQtdLeite(qtdLeite);
                    } catch (LeiteException le) {
                        le.corrigeLeite((Vaca) animal);
                    }

                    System.out.print("Digite a quantidade de partos que a vaca ja teve: ");
                    int partos = leitura.entDadosInt("");
                    ((Vaca) animal).setPartos(partos);

                    System.out.print("Digite a quantidade de carne que a vaca podera render (Em Kg): ");
                    float prodCarne = leitura.entDadosFloat("");
                    ((Vaca) animal).setProdCarne(prodCarne);

                    System.out.print("\nAnimal Cadastrado!\n");
                    mostraDados.adicionarAnimal(animal);
                    break;
                }
                    case 2 -> {
                        System.out.print("Digite o ID do animal: ");
                        id = leitura.entDadosInt("");
                        System.out.print("Digite a idade do animal: ");
                        idade = leitura.entDadosInt("");
                        System.out.print("Digite o peso do animal: ");
                        peso = leitura.entDadosFloat("");
                        System.out.print("Digite a saude do animal: ");
                        saude = leitura.entDados("");
                        System.out.print("Digite a raca do animal: ");
                        raca = leitura.entDados("");
                        System.out.print("\nDigite a alimentacao do porco (racao ou restos): ");
                        String alimentacao = leitura.entDados("");
                        System.out.print("Digite o peso para o abate do porco: ");
                        float pesoAbate = leitura.entDadosFloat("");
                        animal = new Porco(id, idade, peso, saude, raca, new Proprietario(cpf, nome, codFazendeiro), alimentacao, pesoAbate);
                        //mostraDados.adicionarAnimal(animal);
                        break;
                    }
                    case 3 -> {
                        System.out.print("Digite o ID do animal: ");
                        id = leitura.entDadosInt("");
                        System.out.print("Digite a idade do animal: ");
                        idade = leitura.entDadosInt("");
                        System.out.print("Digite o peso do animal: ");
                        peso = leitura.entDadosFloat("");
                        System.out.print("Digite a saude do animal: ");
                        saude = leitura.entDados("");
                        System.out.print("Digite a raca do animal: ");
                        raca = leitura.entDados("");
                        System.out.print("\nDigite a quantidade de ovos que a galinha produz diariamente: ");
                        int qtdOvos = leitura.entDadosInt("");
                        System.out.print("Digite a cor dos ovos da galinha: ");
                        String corOvos = leitura.entDados("");
                        System.out.print("Digite a qualidade dos ovos da galinha: ");
                        String qualiOvos = leitura.entDados("");
                        animal = new Galinha(id, idade, peso, saude, raca, new Proprietario(cpf, nome, codFazendeiro), qtdOvos, corOvos, qualiOvos);
                        //mostraDados.adicionarAnimal(animal);
                        break;
                    }
                    case 4 -> {
                        System.out.print("Digite o ID do animal: ");
                        id = leitura.entDadosInt("");
                        System.out.print("Digite a idade do animal: ");
                        idade = leitura.entDadosInt("");
                        System.out.print("Digite o peso do animal: ");
                        peso = leitura.entDadosFloat("");
                        System.out.print("Digite a saude do animal: ");
                        saude = leitura.entDados("");
                        System.out.print("Digite a raca do animal: ");
                        raca = leitura.entDados("");
                        System.out.print("\nDigite o tempo de treinamento do cavalo: ");
                        int tempoTreinamento = leitura.entDadosInt("");
                        System.out.print("Digite a altura do cavalo: ");
                        float altura = leitura.entDadosFloat("");
                        System.out.print("Digite o numero de vitorias do cavalo: ");
                        int vitorias = leitura.entDadosInt("");
                        animal = new Cavalo(id, idade, peso, saude, raca, new Proprietario(cpf, nome, codFazendeiro), tempoTreinamento, altura, vitorias);
                        //mostraDados.adicionarAnimal(animal);
                        break;
                    }
                    case 5 -> {
                        if (mostraDados.mostraAnimais() == 0) {
                            System.out.print("Nenhum animal cadastrado.\n");
                        } else {
                            System.out.println("\nDados do animal cadastrado:\n");
                            mostraDados.mostraAnimais();
                        }
                        break;
                    }
                    case 0 -> System.out.println("...");
                    default -> System.out.println("Opcao invalida.");
                }

            } while (opcao != 0);

    }
}
