package Jogo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    Scanner teclado = new Scanner(System.in);
    private Jogador jogador;
    private int escola_usu;

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public int getEscola_usu() {
        return escola_usu;
    }

    public void setEscola_usu(int escola_usu) {
        this.escola_usu = escola_usu;
    }

    public void jogar() {
        Random iaJokenpo = new Random();
        while (true) {
            System.out.println("1 = pedra  2 = papel  3 = tesoura: ");
            setEscola_usu(teclado.nextInt());

            if (escola_usu < 1 || escola_usu > 3) {
                System.out.println("Opcao invalida");

            }

            int IA = iaJokenpo.nextInt(3) + 1;

            System.out.print(jogador.getNome() + " escolheu: ");
            if (escola_usu == 1) {
                System.out.println("pedra");
            } else if (escola_usu == 2) {
                System.out.println("papel");
            } else if (escola_usu == 3) {
                System.out.println("tesoura");
            }
            System.out.print("Computador escolheu: ");

            if (IA == 1) {
                System.out.println("pedra");
            } else if (IA == 2) {
                System.out.println("papel");
            } else if (IA == 3) {
                System.out.println("tesoura");
            }
            if (escola_usu == IA) {
                System.out.println(" empate");
            } else if ((escola_usu == 1 && IA == 3) || (escola_usu == 2 && IA == 1) || (escola_usu == 3 && IA == 2)) {
                System.out.println(" voce ganhou");
            } else {
                System.out.println(" voce perdeu");
            }




        }


    }
}

