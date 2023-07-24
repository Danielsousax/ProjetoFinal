//Daniel Pablo Mesquita de Sousa Junior - 2331063

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String entDados(String mensagem) {
        System.out.print(mensagem);
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.err.print("Erro ao ler entrada do usuario.");
            return "";
        }
    }
    public int entDadosInt(String mensagem) {
        int valor = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensagem);
                valor = Integer.parseInt(reader.readLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.print("Entrada invalida. Digite um numero inteiro: ");

            } catch (IOException e) {
                System.err.print("Erro ao ler entrada do usuario.");
                return 0;
            }
        }
        return valor;
    }
    public float entDadosFloat(String mensagem) {
        System.out.print(mensagem);
        float valor = 0;
        boolean valido = false;
        while(!valido){
            try {
                System.out.print(mensagem);
                valor = Float.parseFloat(reader.readLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.err.print("Entrada invalida. Digite um numero float: ");

            } catch (IOException e) {
                System.err.print("Erro ao ler entrada do usuario.");
                return 0;
            }
        }
        return valor;
    }
     
}