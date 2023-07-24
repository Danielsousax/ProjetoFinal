//Daniel Pablo Mesquita de Sousa Junior - 2331063

public abstract class Animal {
    private int id;
    private int idade;
    private float peso;
    private String saude;
    private String raca;

    Proprietario proprietario;

    //Polimorfismo por sobrecarga
    public Animal(){
        id = 0;
        idade = 0;
        peso = 0;
        saude = "";
        raca = "";
        proprietario = new Proprietario();
    }

    public Animal(int id, int idade, float peso, String saude, String raca, Proprietario proprietario) {
        this.id = id;
        this.idade = idade;
        this.peso = peso;
        this.saude = saude;
        this.raca = raca;
        this.proprietario = proprietario;
    }
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSaude() {
        return saude;
    }

    public void setSaude(String saude) {
        this.saude = saude;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Proprietario getProprietario(){
        return proprietario;
    }
    
    public void setProprietario( Proprietario proprietario){
        this.proprietario = proprietario;
    }

    public abstract int quantidadeVacinas();
}