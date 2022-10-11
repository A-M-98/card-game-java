import java.sql.SQLOutput;
import java.util.Scanner;

public class Snap extends CardGame{

    // ONE PLAYER CLASS
    // TWO INSTANCES OF THAT CLASS

    public static void startGame(){
        CardGame cardGame = new CardGame();
        System.out.println("!!!! WELCOME TO A GAME OF SNAP !!!!");
        System.out.println("***************************************************");
        System.out.println("!!!! PRESS ENTER TO START THE GAME !!!!");
        System.out.println("***************************************************");
        Scanner scanner = new Scanner(System.in);
        cardGame.shuffleDeck();
        boolean gameInPlay = true;
        Card previousCard = null;
// two symbols match the player wins. if they don't the next player has a turn.
        while (gameInPlay && cardGame.cardsLeft() > 0){

            Card dealtcard = cardGame.dealCard();
            System.out.println(dealtcard);
            scanner.nextLine();
            if(previousCard == null){
                previousCard = (dealtcard);
            } else if (previousCard.getSymbol().equals(dealtcard.getSymbol())){
                System.out.println("Its a match!! Player has won.");
                return;
            }
//            System.out.println("Type s to Snap or press enter to continue");
//            if (scanner.nextLine().equals("s")){
//                if (previousCard.getSymbol().equals(dealtcard.getSymbol())){
//                System.out.println("Its a match!! Player has won.");
//                return;
//            } else {
//                    System.out.println("!!!Card symbol does not match!!!");
//                    continue;
//                }
//            }
//            if(scanner.nextLine().equals("")){
//                continue;
//            }
            // DISPLAY OPTIONS
            // SNAP / CONTINUE
            // SAVE CHOICE
            // - SNAP -> DO YOUR CHECKING OF PREVCARD AND DEALTCARD
            // - CONTINUE

        }
    }


}
