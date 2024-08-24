
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        //add adiciona elemento na posicao desejada
        //poll retira o primeiro da fila
        //peek olha proximo a ser removido da fila
        //remove escolhe qual indice remover
        //size ver tamanho da fila
        //clear limpa toda a fila
        //isEmpty olha se a fila esta vazia ou nao
        for(int i =0;i<5;i++){
            //add inserir elemento na fila
            fila.add(i);
        }
        //poll retira o primeiro da fila
        fila.poll();
        //peek olha proximo a ser removido da fila
        int olhar=fila.peek();
        System.out.println(olhar);
        //remove escolho qual indice remover
        fila.remove(2);
        //size ver tamanho da fila
        int tamanho=fila.size();
        System.out.println(tamanho);
        if(!fila.isEmpty()){
            System.out.println("nao esta vazia");
        }
        else {
            System.out.println("esta vazia");
        }
        System.out.println(fila);
    }
}