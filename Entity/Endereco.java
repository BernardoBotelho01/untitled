package Entity;

import java.util.Scanner;

public class Endereco {
    Scanner T= new Scanner(System.in);
    public String rua;
    public int numero;
    public String bairro;
    public String cep;
    public Cidade cidade;

    public String rua() {
        System.out.print("Digite o nome da sua rua: ");
        rua= T.nextLine();
        return rua;
    }

    public int numero() {
        System.out.print("Digite o numero da sua residencia: ");
        numero=T.nextInt();
        return numero;
    }

    public String bairro() {
        System.out.print("Digite nome do seu bairro: ");
        bairro= T.nextLine();
        return bairro;
    }

    public String cep() {
        System.out.print("Digite seu cep: ");
        cep= T.nextLine();

        return cep;
    }

    public Cidade cidade() {

        return cidade;
    }
}
