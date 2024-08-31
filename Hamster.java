import java.util.Scanner;

public class Hamster {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float v_investido, v_hora;
        float v_porcento;
        do{
            System.out.println("Digite valor investido: ");
            v_investido= teclado.nextFloat();
            System.out.println("Digite valor pago por hora: ");
            v_hora=teclado.nextFloat();
            v_porcento=(v_hora/v_investido)*100;
            if (v_porcento>=0.5 && v_porcento <=1){
                System.out.println("o valor em porcetagem e "+v_porcento+" %");
            }
            else if (v_porcento>1){
                System.out.println("Invista sem medo!");
            }
            else{
                System.out.println("Valor por hora nao compensa!");
                System.out.println("Valor em porcentagem "+v_porcento+" %");
            }
        }while(v_investido > v_hora);
    }
}
