package Entity;

import java.util.Date;
import java.util.Scanner;

public class Funcionario {
    Scanner T= new Scanner(System.in);
    public String nome;
    public Date nascimento;
    public String cpf;
    public Endereco endereco;

    public String nome(){
        System.out.print("Digite seu nome: ");
        nome=T.nextLine();
        return nome;
    }
    public Date nascimento(){

        return nascimento;
    }
    public String cpf(){
        System.out.print("Digite seu CPF: ");
            cpf=T.nextLine();
        return cpf;
    }

    public Endereco endereco() {

        return endereco;
    }

}
