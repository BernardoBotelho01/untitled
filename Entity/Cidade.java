package Entity;

import java.util.Scanner;

public class Cidade {
    Scanner T= new Scanner(System.in);
    public String nome;
    public Estado estado;

    public String nome() {
        System.out.print("Digite o nome da sua cidade: ");
        nome=T.nextLine();
        return nome;
    }

    public Estado estado() {
        return estado;
    }
}
