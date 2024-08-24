import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Scanner usuario= new Scanner(System.in);
        //criei minha pilha
        Stack<Integer> pilha= new Stack<>();
        // push inseri os valores na minha pilha
    //pop remove item da lista
    //peek olha proximo elemento a ser removido
    //add adiciona elemento na posicao desejada
    //remove voce escolhe qual posicao remover
    //size fala o tamanho da pilha
    //clear limpa toda a pilha
    //isEmpty olha se a pilha esta vazia ou nao
        for(int i=0;i<5;i++){
            // push inseri os valores na minha pilha
            pilha.push(i);
        }
        //pop remove item da lista
        pilha.pop();
        //peek olha proximo numero a ser removido
        int olhar= pilha.peek();
        System.out.println(olhar);
        //add adiciona elemento na posicao desejada
        pilha.add(4,4);
        //remove voce escolhe qual posicao remover
        pilha.remove(2);
        //size fala o tamanho da pilha
        System.out.println("tamanho da pilha = "+pilha.size());
        //limpa a pilha
        pilha.clear();
        //isEmpty olha se a pilha esta vazia ou nao
        if(!pilha.isEmpty()){
            System.out.println("Nao esta vazia");
        }
        else{
            System.out.println("Esta vazia");
        }
        System.out.println(pilha);
    }
}
