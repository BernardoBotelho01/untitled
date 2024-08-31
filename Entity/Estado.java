package Entity;

import java.util.Scanner;

public class Estado {
    Scanner T= new Scanner(System.in);
    public String nome;
    public String sigla;
    public String nome(){
        System.out.print("Digite nome do seu estado: ");
        nome= T.nextLine();
        return nome;
    }
    public String sigla(){
        System.out.print("Digite a sigla do seu estado: ");
        sigla=T.nextLine();
        return sigla;
    }
}
