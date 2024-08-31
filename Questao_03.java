public class Questao_03{
    public static void main(String[] args) {

        for(int cont=1; cont<=100; cont++){
            if (cont%10==0) {
                System.out.println(cont+" E multiplo de 10");
            }
            else{
                System.out.println(cont);
            }
        }
    }
}
