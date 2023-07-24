public class Proprietario {

    private int cpf;
    private String nome;
    private int codFazendeiro;

    //Polimorfismo por sobrecarga
    public Proprietario(){
        cpf = 0;
        nome = "";
        codFazendeiro = 0;
    }

    public Proprietario(int cpf, String nome, int codFazendeiro) {
        this.cpf = cpf;
        this.nome = nome;
        this.codFazendeiro = codFazendeiro;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getcodFazendeiro(){
        return codFazendeiro;
    }
    
    public void setCodFazendeiro( int codFazendeiro){

        this.codFazendeiro = codFazendeiro;
    }
    
}
