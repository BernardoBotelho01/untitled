package Jogo;

import java.util.Scanner;

public class MainJogo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Jogador j1=new Jogador();
        System.out.println("Digite seu nome: ");
        j1.setNome(teclado.nextLine());
        Jokenpo joke = new Jokenpo();
        joke.setJogador(j1);
        joke.jogar();





    }
}
