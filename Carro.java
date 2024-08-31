import java.util.Scanner;

public class Carro {
    String nome,marca;
    int velocidade,placa,ano;

    public void Carro(String marca, String nome){
        this.nome=nome;
        this.marca=marca;

    }
    public int acelerar(int velocidade){
        this.velocidade=velocidade;
        return velocidade;
    }
    public int Placa(int placa){
        this.placa=placa;
        return placa;
    }
    public void Ano(){
        Scanner T=new Scanner(System.in);
        this.ano=ano;


        while(true) {
            System.out.println("ano do carro");;
            ano = T.nextInt();
            if (ano >= 2000) {
                System.out.println("valido");
                break;
            }
            else {
                System.out.println("invalido");
            }

        }
    }

}
