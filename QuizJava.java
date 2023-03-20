import java.util.Scanner;
import java.util.Random;

public class QuizJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomValue = new Random();

        System.out.println("Seja bem vindo ao jogo SalesForce Quiz, antes de iniciarmos, informe seu nome: ");
        String playerName = scanner.nextLine();

        String[][] questions = {
                { "Qual é a plataforma de desenvolvimento de aplicativos de negócios líder da Salesforce?", "c" },
                { "Qual é a ferramenta de gerenciamento de relacionamento com o cliente da Salesforce?", "b" },
                { "Qual é a plataforma da Salesforce para gerenciamento de vendas?", "b" },
                { "Qual é a ferramenta da Salesforce que permite a colaboração entre equipes?", "b" },
                { "Qual é a solução da Salesforce para gerenciamento de atendimento ao cliente?", "a" },
                { "Qual é a ferramenta de análise de dados da Salesforce?", "a" },
                { "Qual é a ferramenta de automação de marketing da Salesforce?", "b" },
                { "Qual é a solução da Salesforce para construção de comunidades online?", "c" },
                { "Qual é a plataforma de inteligência artificial da Salesforce?", "a" },
                { "Qual é a ferramenta da Salesforce para análise de dados de dispositivos conectados?", "b" }

        };

        String[][] alternatives = {
                { "1", "a", "Service Cloud" },
                { "1", "b", "Sales Cloud" },
                { "1", "c", "Salesforce Platform" },
                { "1", "d", "Marketing Cloud" },
                { "2", "a", "Salesforce Chatter" },
                { "2", "b", "Salesforce CRM" },
                { "2", "c", "Salesforce Wave Analytics" },
                { "2", "d", "Salesforce IoT Cloud" },
                { "3", "a", "Service Cloud" },
                { "3", "b", "Sales Cloud" },
                { "3", "c", "Marketing Cloud" },
                { "3", "d", "Community Cloud" },
                { "4", "a", "Salesforce CRM" },
                { "4", "b", "Salesforce Chatter" },
                { "4", "c", "Salesforce Marketing Cloud" },
                { "4", "d", "Salesforce Service Cloud" },
                { "5", "a", "Salesforce Service Cloud" },
                { "5", "b", "Salesforce Sales Cloud" },
                { "5", "c", "Salesforce Marketing Cloud" },
                { "5", "d", "Salesforce IoT Cloud" },
                { "6", "a", "Salesforce Wave Analytics" },
                { "6", "b", "Salesforce Chatter" },
                { "6", "c", "Salesforce Platform" },
                { "6", "d", "Salesforce Community Cloud" },
                { "7", "a", "Salesforce Service Cloud" },
                { "7", "b", "Salesforce Marketing Cloud" },
                { "7", "c", "Salesforce Sales Cloud" },
                { "7", "d", "Salesforce IoT Cloud" },
                { "8", "a", "Salesforce Service Cloud" },
                { "8", "b", "Salesforce Sales Cloud" },
                { "8", "c", "Salesforce Community Cloud" },
                { "8", "d", "Salesforce IoT Cloud" },
                { "9", "a", "Salesforce Einstein" },
                { "9", "b", "Salesforce Wave Analytics" },
                { "9", "c", "Salesforce Chatter" },
                { "9", "d", "Salesforce IoT Cloud" },
                { "10", "a", "Salesforce Service Cloud" },
                { "10", "b", "Salesforce IoT Cloud" },
                { "10", "c", "Salesforce Sales Cloud" },
                { "10", "d", "Salesforce Marketing Cloud" },
        };

        Integer i = 1;
        Double prize = 0.5 + (3.0 - 0.5) * randomValue.nextDouble();
        Double prizeGiveUp = 0.1 + (0.35 - 0.1) * randomValue.nextDouble();

        System.out.println("Olá " + playerName
                + ", vamos iniciar o nosso quiz, se a qualquer momento quiser desistir basta pressionar a tecla '[F]', no campo de resposta de qualquer pergunta");


        for (String[] question : questions) {
                System.out.println(i + ") " + question[0] + "\n");
                for (String[] alternative : alternatives) {
                    if (Integer.parseInt(alternative[0]) == i) {
                        System.out.println(alternative[1] + ") " + alternative[2]);
                    }
                }
                System.out.println("Digite sua resposta");
                String answer = scanner.nextLine().toLowerCase();
                if (answer.equals("f")) {
                    System.out.println(
                            "Você desistiu, a sua pontuação final é: " + (prize - prize * (prizeGiveUp)) + "!");
                    System.exit(0);
                } else {
                    if (answer.equals(question[1])) {
                        prize = prize * 2;
                        System.out.printf("Reposta correta, seu prêmio atual é:%.2f ", prize);
                    } else {
                        prize = 0.0;
                        System.out.println("Resposta incorreta, você foi eliminado! \n Sua pontuação final foi zerada");
                        System.exit(0);
                    }
                }

                if (i == questions.length) {
                    System.out.printf(
                            "Parabéns, você venceu o quiz de perguntas sobre Salesforce, sua pontuação final é:%.2f ", prize);
                }

                System.out.println("\n\n");
                i++;
        }
    }
}