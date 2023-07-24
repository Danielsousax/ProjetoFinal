//Daniel Pablo Mesquita de Sousa Junior - 2331063

public class Galinha extends Animal {
    private int qtdOvos;
    private String corOvos;
    private String qualiOvos;

    //Polimorfismo por sobrecarga
    public Galinha(){
        qtdOvos = 0;
        corOvos = "";
        qualiOvos = "";
    }

    //Construtor
    public Galinha(int id, int idade, float peso, String saude, String raca, Proprietario proprietario, int qtdOvos, String corOvos, String qualiOvos) {
        super(id, idade, peso, saude, raca, proprietario);
        this.qtdOvos = qtdOvos;
        this.corOvos = corOvos;
        this.qualiOvos = qualiOvos;

    }

    //Getters e Setters
    public int getQtdOvos() {
        return qtdOvos;
    }

    public void setQtdOvos(int qtdOvos) {
        this.qtdOvos = qtdOvos;
    }

    public String getCorOvos() {
        return corOvos;
    }

    public void setCorOvos(String corOvos) {
        this.corOvos = corOvos;
    }

    public String getQualiOvos() {
        return qualiOvos;
    }

    public void setQualiOvos(String qualiOvos) {
        this.qualiOvos = qualiOvos;
    }

    //Polimorfismo por Sobrescrito
    public int quantidadeVacinas(){
        if(getIdade()>1){
            return 3;
        }
        return 0;
    }
}
