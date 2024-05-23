import java.util.Scanner;
public class MainQuiz {
    public static void main(String[] args) {
    Scanner entradaUsuario = new Scanner(System.in);
    System.out.println();
    System.out.println("-------Faculdade Unifan-------");
    System.out.println("Aluno: Bernardo Jose Oliveira Botelho");
    System.out.println("Professor: Brenno Pimenta");
    System.out.println("Tema das Perguntas: Conhecimentos básicos sobre Java!");
    System.out.println();
    // Criação de um objeto LogicaQuiz e início do quiz
        LogicaQuiz quiz = new LogicaQuiz();
        quiz.iniciarQuiz(entradaUsuario);

    }
}
