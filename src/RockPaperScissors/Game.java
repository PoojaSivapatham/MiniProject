package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;
public class Game {
    public void start(){
        printWelcome();

        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter your choice");
        int pCh=sc.nextInt();
        while(pCh<1 || pCh>3 ){
            System.out.println("pls enter valid options");
            pCh=sc.nextInt();
        }
        int cCh=generateComputerChoice();
        displayChoice(pCh,cCh);
        String result=decideWinner(pCh,cCh);
        System.out.println(result);
    }
    private void printWelcome(){
        System.out.println("************************");
        System.out.println("   ROCK PAPER SCISSORS  ");
        System.out.println("************************");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
    }
    private int generateComputerChoice(){
        Random rn = new Random();
        return rn.nextInt(3)+1;
    }
    private void displayChoice(int p,int c){
        System.out.println("You chose: "+getChoiceName(p));
        System.out.println("Computer chose: "+getChoiceName(c));
    }
    private String decideWinner(int pCh,int cCh){
        //int computerCh=generateComputerChoice(rn);
        //System.out.println("Pls enter your choice");
        //int playerCh=sc.nextInt();
        if(cCh==pCh){
            return "Draw!!";
        }
        else if((pCh==1 && cCh==3)||(pCh==2 && cCh==1)||(pCh==3 && cCh==2)){
            return "Player Wins!!";
        }
        else{
            return "Computer Wins";
        }
    }
    private String getChoiceName(int ch){
        switch(ch){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }
}
