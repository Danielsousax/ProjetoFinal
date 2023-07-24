//Daniel Pablo Mesquita de Sousa Junior - 2331063

public class Vaca extends Animal implements Verif_preco {
    private float qtdLeite;
    private int partos;
    private float prodCarne;

    //Polimorfismo por sobrecarga
    public Vaca(){
        qtdLeite = 0;
        partos = 0;
        prodCarne = 0;
    }

    //Construtor
    public Vaca(int id, int idade, float peso, String saude, String raca, Proprietario proprietario, float qtdLeite, int partos, float prodCarne) {
        super(id, idade, peso, saude, raca, proprietario);
        this.qtdLeite = qtdLeite;
        this.partos = partos;
        this.prodCarne = prodCarne;
    }

    //Getters e Setters
    public float getQtdLeite() {
        return qtdLeite;
    }

    public void setQtdLeite (float qtdLeite) throws LeiteException{
        if (qtdLeite < 10){
            throw new LeiteException();
        }
        this.qtdLeite = qtdLeite;
    }

    public int getPartos() {
        return partos;
    }

    public void setPartos(int partos) {
        this.partos = partos;
    }

    public float getProdCarne() {
        return prodCarne;
    }

    public void setProdCarne(float prodCarne) {
        this.prodCarne = prodCarne;
    }

    public double calculaVaca (float peso) {
        return (peso* Verif_preco.preco_kilo_vaca);
    } 
    
    //Polimorfismo por Sobrescrito
    public int quantidadeVacinas(){

        if(getIdade()>1){
            return 1;
        }
        
        return 0;
    }
}
