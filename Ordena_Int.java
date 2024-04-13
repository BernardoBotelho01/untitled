import java.util.ArrayList;
import java.util.Arrays;

public interface Ordena_Int {
    public static void main(String[] args) {
        int [] vet = new int[]{12,8,4,1,6,9,7,5,2,3,10,11};
        int aux=0;
        System.out.println("Desordenado");
        for(int num : vet){
            System.out.print(num+" ");
        }
        System.out.println();
        Arrays.sort(vet);
        System.out.println("Organizado");
        for (int num : vet){
            System.out.print(num+" ");
        }
        System.out.println();
        for (int i=0;i<12;i++){
            for (int j=0;j<11;j++){
                if (vet[j] > vet[j+1]){
                     aux=vet[j];
                     vet[j]=vet[j+1];
                     vet[j+1]=aux;
                }
            }
        }
        System.out.println("Usando Bubble sort pra ordenar");
        for (int i=0;i<12;i++){
            System.out.print(vet[i]+" ");
        }
    }
}
