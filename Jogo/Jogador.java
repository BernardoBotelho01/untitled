package Jogo;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Jogador {
    Scanner teclado = new Scanner(System.in);
    private String nome;
    private int escolha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;


    }


}
