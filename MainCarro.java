import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner T=new Scanner(System.in);

        Carro carro1= new Carro();
        System.out.println("marca");

     carro1.marca= T.nextLine();
        System.out.println("nome");
     carro1.nome= T.nextLine();

        System.out.println(carro1.marca+" "+carro1.nome);

        carro1.Ano();
        System.out.println(carro1.ano);


    }
}
