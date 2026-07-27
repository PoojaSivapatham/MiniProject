package NumberGuessGame;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public void start(){
        printWelcome();
        Scanner sc = new Scanner(System.in);
        char playagain;
        do {
            Random rn = new Random();
            playgame(sc,rn);
            playagain=askPlayAgain(sc);
        }while((playagain=='Y')||(playagain=='y'));
    }
    private void printWelcome(){
        System.out.println("******************************");
        System.out.println("       GUESS THE NUMBER");
        System.out.println("******************************");
    }
    private int generateRandomNo(Random random){
        return random.nextInt(100) + 1;
    }
    private char askPlayAgain(Scanner sc){
        System.out.print("Wanna play again??(Y/N): ");
        sc.nextLine();
        return sc.nextLine().charAt(0);
    }
    private void playgame(Scanner sc,Random rn){
        int secretNumber = generateRandomNo(rn);
        int attempts = 0;
        boolean isCorrect = false;
        //Get user guess compare repeat
        while (!isCorrect) {
            int playerGuess;
            System.out.print("Enter your guess[1-100]: ");
            playerGuess = sc.nextInt();
            attempts++;
            if (playerGuess == secretNumber) {
                System.out.println("Congratulations!!You guessed right!!!");
                isCorrect = true;
            } else if (playerGuess > secretNumber) {
                System.out.println("Your guess is High!!");
            } else {
                System.out.println("Your guess is Low!!");
            }
        }
        //show attempts
        System.out.println("Number of attempts: " + attempts);
    }
}
