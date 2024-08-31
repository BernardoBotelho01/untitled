import java.util.Scanner;

public class ForPar {
    public static void main(String[] args) {
        Scanner T= new Scanner(System.in);
        int n1;
        int[] n2= new int[3];
        System.out.println("insira um numero: ");
        n1= T.nextInt();
        for(int i=1; i<=n1;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=1; i<=n1;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        for(int i=0; i<3;i++) {
            n2[i] = T.nextInt();
        }
        int maior =0;
        maior=n2[0];
        for(int i=0; i< n2.length;i++){
            if(n2[i]>maior){
                maior=n2[i];

            }
        }
        System.out.println(maior);
    }
}
