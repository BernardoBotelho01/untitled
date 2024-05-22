import java.util.Scanner;

public class LogicaQuiz {
        // Variável para armazenar a pontuação do usuário
        int pontuacaoUsuario = 0;

        // Scanner para ler a entrada do usuário
        Scanner entradaUsuario = new Scanner(System.in);

        // Vetor de strings para armazenar as perguntas do quizk
        String[] perguntasQuiz = {
                "1: Qual é a palavra-chave usada para criar uma instância de uma classe?\n" +
                        "(a) Class\n" +
                        "(b) New\n" +
                        "(c) Public\n" +
                        "(d) Void\n",
                "2: Como você pode criar um comentário de uma linha em Java?\n" +
                        "(a) /*\n" +
                        "(b) =!\n" +
                        "(c) //\n" +
                        "(d) #\n",
                "3: Qual é a saída do código System.out.println(2+3*4)?\n" +
                        "(a) 18\n" +
                        "(b) 20\n" +
                        "(c) 14\n" +
                        "(d) 11\n",
                "4: Como declara um array de inteiros em java?\n" +
                        "(a) Int array[];\n" +
                        "(b) int array;\n" +
                        "(c) int[] array;\n" +
                        "(d) array int;\n",
                "5: Qual palavra-chave é usada para importar pacotes em Java?\n" +
                        "(a) package\n" +
                        "(b) include\n" +
                        "(c) import\n" +
                        "(d) use\n",
                "6: Qual é a funcionalidade do método equals() em java?\n" +
                        "(a) Compara o conteúdo dos objetos\n" +
                        "(b) Compara referência de objetos\n" +
                        "(c) Compara os tipos dos objetos\n" +
                        "(d) Compara uma cópia dd objeto\n" ,
                "7: Qual é a palavra-chave usada para criar um novo objeto em Java?\n" +
                        "(a) create\n" +
                        "(b) class\n" +
                        "(c) new\n" +
                        "(d) static\n" ,
                "8: Qual pacote precisa ser importado para usar ArrayList em Java?\n" +
                        "(a) java.ArrayList\n" +
                        "(b) java.util.Collection\n" +
                        "(c) java.util.List\n" +
                        "(d) java.util.Scanner\n" ,
                "9: Como você obtém o tamanho de um ArrayList em Java?\n" +
                        "(a) List.size()\n" +
                        "(b) List.Length\n" +
                        "(c) List.count()\n" +
                        "(d) List.capacity()\n" ,
                "10: Qual é a palavra-chave usada para declarar uma interface em Java?\n" +
                        "(a) interface\n" +
                        "(b) abstract\n" +
                        "(c) implements\n" +
                        "(d) extends\n" ,
                "11: Qual é a palavra-chave usada para declarar uma classe em Java?\n" +
                        "(a) class\n" +
                        "(b) object\n" +
                        "(c) type\n" +
                        "(d) struct\n" ,
                "12: Qual é a palavra-chave usada para declarar uma variável de instância em Java?\n" +
                        "(a) var\n" +
                        "(b) let\n" +
                        "(c) instance\n" +
                        "(d) Não há uma palavra-chave específica para declarar uma variável de instância\n" ,
                "13: Qual é a palavra-chave usada para declarar um método em Java?\n" +
                        "(a) function\n" +
                        "(b) method\n" +
                        "(c) procedure\n" +
                        "(d) Não há uma palavra-chave específica para declarar um método.\n" ,
                "14: Qual é a palavra-chave usada para declarar um bloco de código que será sempre executado, independentemente de uma exceção ser lançada e capturada?\n" +
                        "(a) always\n" +
                        "(b) finally\n" +
                        "(c) end\n" +
                        "(d) last\n" ,
                "15: Qual é a palavra-chave usada para declarar um bloco de código que pode lançar uma exceção?\n" +
                        "(a) try\n" +
                        "(b) catch\n" +
                        "(c) throw\n" +
                        "(d) erro\n"};
        // Vetor de char para armazenar as respostas corretas para as perguntas do quiz
        char[] respostasCorretas = {'b', 'c', 'c','c', 'c', 'a', 'c', 'a', 'a', 'a', 'a', 'd', 'd', 'b', 'a'};

        public void iniciarQuiz(Scanner entradaUsuario) {
            System.out.println("\n-------Inicio do Quiz-------\n");
            // Loop através de todas as perguntas e respostas
            for (int i = 0; i < perguntasQuiz.length; i++) {
                fazerPergunta(perguntasQuiz[i], respostasCorretas[i]);
            }
            System.out.println("\n-------Fim do Quiz--------\n");
            // Impressão da pontuação final do usuário
            System.out.println("Você acertou " + pontuacaoUsuario + " de " + perguntasQuiz.length + " perguntas.\n");
            System.out.println("-------Gabarito-------\n");
            System.out.print("1 (b) New\n"+
                    "2 (c) //\n"+
                    "3 (c) 14\n"+
                    "4 (c) int[] array;\n"+
                    "5 (c) import\n" +
                    "6 (a) Compara o conteúdo dos objetos\n" +
                    "7 (c) new\n" +
                    "8 (a) java.ArrayList\n" +
                    "9 (a) List.size()\n" +
                    "10 (a) interface\n" +
                    "11 (a) class\n" +
                    "12 (d) Não há uma palavra-chave específica para declarar uma variável de instância.\n"+
                    "13 (d) Não há uma palavra-chave específica para declarar um método.\n"+
                    "14 (b) finally\n" +
                    "15 (a) try");
        }
        public void fazerPergunta(String pergunta, char respostaCorreta) {
            // Impressão da pergunta
            System.out.println(pergunta);
            System.out.print("Digite sua alternativa: ");
            // Leitura da resposta do usuário
            char respostaUsuario = entradaUsuario.next().charAt(0);
            System.out.println();
            // Verificação se a resposta do usuário é uma letra minúscula
            while (respostaUsuario != 'a' && respostaUsuario != 'b' && respostaUsuario != 'c' && respostaUsuario != 'd') {
                System.out.println("Opção inválida, digite como pede, letra minúscula para opção!");
                respostaUsuario = entradaUsuario.next().charAt(0);
            }
            // Verificação se a resposta do usuário é igual à resposta correta
            if (respostaUsuario == respostaCorreta) {
                // Se a resposta estiver correta, incrementa a pontuação do usuário
                pontuacaoUsuario++;
            }
            else{
                System.out.println("Alternativa errada a correta e: "+respostaCorreta+"\n");

            }
        }
    }
