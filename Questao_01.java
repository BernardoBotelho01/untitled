import java.util.Scanner;

public class Questao_01 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int[] vetor= new int[10];
        System.out.print("Digite os valores para o vetor: ");
        for (int i=0; i<vetor.length; i++){
            vetor[i]= teclado.nextInt();
        }
        for (int imprimir : vetor){
            System.out.print("["+imprimir+"]");
        }
    }
}
