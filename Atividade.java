import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        int linhas= 5;
        int colunas=5;
        int [][] matriz=new int[linhas][colunas];

        Scanner teclado=new Scanner(System.in);
        System.out.println("Insira os valores da matriz");
        for (int i=0; i < linhas; i++){
            for (int j=0; j< colunas; j++){
                System.out.print("Posicao ["+i+"]"+"["+j+"]: ");
                matriz[i][j]=teclado.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matriz 5x5");
        for (int i=0; i<linhas; i++){
            for (int j=0; j< colunas; j++){
                System.out.print("["+matriz[i][j]+"]"+" ");


            }
            System.out.println();
        }
        System.out.println("Diagonal principal da matriz");
        for (int i=0; i<colunas; i++){

                System.out.println(matriz[i][i]);

        }
    }
}
