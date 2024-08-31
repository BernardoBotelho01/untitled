import java.util.Locale;
import java.util.Scanner;

public class Questao_02 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in).useLocale(Locale.US);
        String[] nome = new String[10];
        int[] idade= new int[10];
        float[] altura= new float[10];
        for (int i=0; i<idade.length; i++){
            System.out.print("Digite o "+(i+1)+" nome: ");
            nome[i]=teclado.nextLine();
            System.out.print("Digite a "+(i+1)+" idade: ");
            idade[i]=teclado.nextInt();
            System.out.print("Digite a "+(i+1)+" altura: ");
            altura[i]=teclado.nextFloat();
            System.out.println();

            teclado.nextLine();
        }

        System.out.println();
        System.out.println("Nome que esta na posicao 3 e: "+nome[2]);
        System.out.println("Idade que esta na posicao 6 e: "+idade[5]);
        System.out.printf("Altura que esta na posicao 10 e: %.2f",altura[9]);
    }
}
