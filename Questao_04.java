import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[3];
        float media=0;
        System.out.println("Digite os numeros: ");
        for (int i=0; i< num.length; i++){
            num[i]=teclado.nextInt();
            media=(media+num[i]);
        }
        int menor=num[0];
        int maior=num[0];
        for(int i=0; i< num.length; i++){
            if(num[i]>maior){
                maior=num[i];
            }
            if(num[i]<menor){
                menor=num[i];
            }
        }
        System.out.println("Menor numero digitado = "+menor);
        System.out.println("Maior numero digitado = "+maior);
        System.out.println("Media dos numeros digitado = "+media/num.length);
    }
}