//Daniel Pablo Mesquita de Sousa Junior - 2331063

public class Cavalo extends Animal {
    private int tempoTreinamento;
    private float altura;
    private int vitorias;

    //Polimorfismo por sobrecarga
    public Cavalo(){
        tempoTreinamento = 0;
        altura = 0;
        vitorias = 0;
    }

    //Construtor
    public Cavalo(int id, int idade, float peso, String saude, String raca, Proprietario proprietario, int tempoTreinamento, float altura, int vitorias) {
        super(id, idade, peso, saude, raca, proprietario);
        this.tempoTreinamento = tempoTreinamento;
        this.altura = altura;
        this.vitorias = vitorias;
    }

    //Getters e Setters
    public int getTempoTreinamento() {
        return tempoTreinamento;
    }

    public void setTempoTreinamento(int tempoTreinamento) {
        this.tempoTreinamento = tempoTreinamento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    //Polimorfismo por Sobrescrito
    public int quantidadeVacinas(){
        if(getIdade()>1){
            return 2;
        }
        return 0;
    }
}
