import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        //set muda o elementos na posicao desejada
        //remove retira elemento da posicao desejada
        //add adiciono elemento na posicao desejada
        //get eu olho o numero na posicao desejda
        //size olha tamanho
        //isEmpty olha se o array esta vazio ou nao
        for(int i =0;i<5;i++){
            array.add(i);
        }
        //for wite
        for(int valor:array){
            System.out.println(valor);
        }
        System.out.println();
        //set muda o elementos na posicao desejada
        array.set(0,-1);
        //remove retira elemento da posicao desejada
        array.remove(4);
        //add adiciono elemento na posicao desejada
        array.add(4,9);
        //get eu olho o numero na posicao desejda
        int olhar=array.get(3);
        System.out.println(olhar);
        //size olha tamanho
        int tamanho=array.size();
        System.out.println(tamanho);
        if(!array.isEmpty()){
            System.out.println("nao esta vazia");
        }
        else{
            System.out.println("esta vazia");
        }
        System.out.println(array);
    }
}