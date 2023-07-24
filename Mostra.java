//Daniel Pablo Mesquita de Sousa Junior - 2331063

import java.util.ArrayList;
import java.util.List;

public class Mostra {
    private List<Animal> animais;
    private int numVacas, numCavalos, numPorcos, numGalinhas;
    

    public Mostra() {
        this.animais = new ArrayList<>();
        this.numVacas = 0;
        this.numCavalos = 0;
        this.numGalinhas = 0;
        this.numPorcos =0;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        if (animal instanceof Vaca) {
            numVacas++;
        }

        if (animal instanceof Cavalo) {
            numCavalos++;
        }

        if (animal instanceof Porco) {
            numPorcos++;
        }

        if (animal instanceof Galinha) {
            numGalinhas++;
        }
    }

    public int mostraAnimais() {
        for (Animal animal : animais) {
            if (animal.getClass() == new Vaca().getClass()) {
                System.out.println("ID: " + animal.getId() +
                                   "\nIdade: " + animal.getIdade() +
                                   "\nPeso: " + animal.getPeso() +
                                   "\nSaude: " + animal.getSaude() +
                                   "\nRaca: " + animal.getRaca() +
                                   "\nLitros por dia de Leite: " + ((Vaca)animal).getQtdLeite() + "L" +
                                   "\nPartos: " + ((Vaca)animal).getPartos() +
                                   "\nCarne provavel: " + ((Vaca)animal).getProdCarne() + " kg" +
                                   "\nPreco de Venda: " + ((Vaca)animal).calculaVaca(((Vaca)animal).getPeso()));
            }

            else if (animal instanceof Cavalo cavalo) {
                System.out.println("\nID: " + cavalo.getId() +
                                   "\nIdade: " + cavalo.getIdade() +
                                   "\nPeso: " + cavalo.getPeso() +
                                   "\nSaude: " + cavalo.getSaude() +
                                   "\nRaca: " + cavalo.getRaca() +
                                   "\nTempo de Treinamento " + cavalo.getTempoTreinamento() +
                                   "\nAltura: " + cavalo.getAltura() +
                                   "\nVitorias: " + cavalo.getVitorias());
            }

            else if (animal instanceof Porco porco) {
                System.out.println("\nID: " + porco.getId() +
                                   "\nIdade: " + porco.getIdade() +
                                   "\nPeso: " + porco.getPeso() +
                                   "\nSaude: " + porco.getSaude() +
                                   "\nRaca: " + porco.getRaca() +
                                   "\nAlimentacao: " + porco.getAlimentacao() +
                                   "\nPeso para Abate: " + porco.getPesoAbate());
            }
                   
            else if (animal instanceof Galinha galinha) {
                System.out.println("\nID: " + galinha.getId() +
                                   "\nIdade: " + galinha.getIdade() +
                                   "\nPeso: " + galinha.getPeso() +
                                   "\nSaude: " + galinha.getSaude() +
                                   "\nRaca: " + galinha.getRaca() +
                                   "\nQuantidade de Ovos: " + galinha.getQtdOvos() +
                                   "\nCor dos Ovos: " + galinha.getCorOvos() +
                                   "\nQualidade dos Ovos: " + galinha.getQualiOvos());
            }

            if (numVacas == 0 && numCavalos == 0 && numGalinhas == 0 && numPorcos == 0){
                return 0;
            }
        }
        return 1;
    }
}
