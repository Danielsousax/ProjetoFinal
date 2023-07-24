//Daniel Pablo Mesquita de Sousa Junior - 2331063

public class Porco extends Animal{
    private String alimentacao;
    private float pesoAbate;

    //Polimorfismo por sobrecarga
    public Porco(){
        alimentacao = "";
        pesoAbate = 0;
    }

    //Construtor
    public Porco(int id, int idade, float peso, String saude, String raca, Proprietario proprietario, String alimentacao, float pesoAbate) {
        super(id, idade, peso, saude, raca, proprietario);
        this.alimentacao = alimentacao;
        this.pesoAbate = pesoAbate;
    }

    //Getters e setters
    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public float getPesoAbate() {
        return pesoAbate;
    }

    public void setPesoAbate(float pesoAbate) {
        this.pesoAbate = pesoAbate;
    }

    //Polimorfismo por Sobrescrito
    public int quantidadeVacinas(){
        if(getIdade()>1){
            return 2;
        }
        return 0;
    }
}
