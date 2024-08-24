public class Vetor {
    public static void main(String[] args) {
        int [] v=new int [5];
        for(int i=0;i<v.length;i++){
            v[i]=i;
            System.out.print(v[i]+" ");
        }
        System.out.println();
for(int valor:v){
    System.out.print(valor+" ");
}

    }
}
