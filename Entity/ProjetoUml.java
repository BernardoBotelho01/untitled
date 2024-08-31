package Entity;

public class ProjetoUml {
    public static void main(String[] args) {
        Funcionario f1=new Funcionario();
        f1.nome();
        f1.cpf();

        Endereco en1=new Endereco();
        en1.rua();
        en1.numero();
        en1.bairro();
        en1.cep();

        Cidade c1=new Cidade();


        Estado es1= new Estado();


        System.out.println(f1.endereco().rua());



    }
}
