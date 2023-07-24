public class LeiteException extends Exception {

    Leitura leitura = new Leitura();

    public void corrigeLeite(Vaca vaca){

        try {
            vaca.setQtdLeite(leitura.entDadosFloat("A quantidade de Leite deve ser maior que 10L. Insira Novamemte "));

        } catch (LeiteException le){
            le.corrigeLeite(vaca);
        }

    }
}
