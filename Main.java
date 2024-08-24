import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner T = new Scanner(System.in);
        int cont, soma=0;
        cont = T.nextInt();
        for (int i = 0; i < cont; i++) {

            int x = T.nextInt();
            int y = T.nextInt();
            if (x < y) {
                for (int j = x+1; j <y; j++) {
                    if (j % 2 != 0) {
                        soma = soma + j;

                    }
                }
            }
                else  {
                    for (int j = y+1; j < x; j++) {
                        if (j % 2 != 0) {
                            soma = soma + j;

                        }
                    }

                }
                System.out.println(soma);


        }
    }
}