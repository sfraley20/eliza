import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        String welcomeMessage = "Welcome to ElizaChats! my name is Eliza! What is your name?: ";
        System.out.println(welcomeMessage);

        Scanner scanner = new Scanner(System.in);



//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Welcome to ElizaChats! my name is Eliza! What is your name?: ");
        String name = scanner.nextLine();

        System.out.println("Nice to meet you, how has your day been, " + name + "?" );

        String response = scanner.nextLine();

        String elizaResponse = "Okay Anything in particular that makes you feel " + response + "?";
        System.out.println(elizaResponse);

        String lastResponse = scanner.nextLine();

        String elizaGoodbye = "Okay, it has been nice to speak with you have a nice day " + name + "!";

        String allAnswers = name + " " + response + " " + lastResponse;

        System.out.println(elizaGoodbye + "\n Here are your responses: " + allAnswers);




    }
}