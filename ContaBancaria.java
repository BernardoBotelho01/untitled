import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancaria {
    Scanner T=new Scanner(System.in);
    //Atributos conta bancaria
    public ArrayList<String> dono = new ArrayList<>();
    private int[] cpf= new int[11];
    private int[] n_conta= new int[6];

    public boolean status;
    public float saldo;



public ContaBancaria(){
    status= false;
    saldo=0;
    System.out.println(status+" "+saldo);
}
public void AbriConta(){
    this.saldo=saldo;
    this.status=status;
    System.out.println("Deseja abrir conta 1 = sim ou  2 = nao");
    int abrir=T.nextInt();

    if (abrir==1){
        this.saldo=50;
        this.status=true;
        System.out.println("conta aberta, seu saldo e "+saldo);
    }
    else{
        System.out.println("nao abriu conta");
    }


}


    public void saldo() {
    }

    public void status() {
    }
}



