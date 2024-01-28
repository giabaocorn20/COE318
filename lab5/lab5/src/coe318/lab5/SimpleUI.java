package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        //FIX THIS
        System.out.println("House holds: " + this.game.getHouseCards().toString());
        System.out.println("You hold: " + this.game.getYourCards().toString());
        System.out.println("Your score is: " + this.game.score(this.game.getYourCards()));
    }

  @Override
    public boolean hitMe() {
        //FIX THIS
        System.out.println("Would you like to hit? (y/n)");
        String input = user.nextLine();
        if(input.equals( "y")){
            return true;
        }
        return false;
    }

  @Override
    public void gameOver() {
        //FIX THIS
        int yourScore = this.game.score(this.game.getYourCards());
        int houseScore = this.game.score(this.game.getHouseCards());
        System.out.println("Game over! Your score was: " + yourScore);
        System.out.println("House score was: " + houseScore);
        if((yourScore) > 21){
            System.out.println("You lose!");
        }
        else if((houseScore) > 21){
            System.out.println("You win!");
        }
        else if(yourScore > houseScore ){
            System.out.println("You win!");
        }
        else if(yourScore < houseScore ){
            System.out.println("You lose!");
        }
        else{
            System.out.println("It's a tie!");
        }
    }

}