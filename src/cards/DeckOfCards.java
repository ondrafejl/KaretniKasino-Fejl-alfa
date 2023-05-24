package cards;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class to create deck of cards
 * @author Ondřej Fejl
 */
public class DeckOfCards {

    private final ArrayList<Card> cards = new ArrayList<>();    //deck of cards

    /**
     * Class constructor for creating a deck of cards
     */
    public DeckOfCards() {

        //Creating and loading clubs
        for(int i = 1; i <= 13; i++) {
            if(i < 11) {
                cards.add(new Card(i, DeckOfCards.class.getResource("/clubs/" + i + "_of_clubs.png"), true, "clubs"));
            }else{
                cards.add(new Card(10, DeckOfCards.class.getResource("/clubs/" + i + "_of_clubs.png"), true, "clubs"));
            }
        }
        //Creating and loading hearts
        for(int i = 1; i <= 13; i++) {
            if(i < 11) {
                cards.add(new Card(i, DeckOfCards.class.getResource("/hearts/" + i + "_of_hearts.png"), false, "hearts"));
            }else{
                cards.add(new Card(10, DeckOfCards.class.getResource("/hearts/" + i + "_of_hearts.png"), false, "hearts"));
            }
        }
        //Creating and loading spades
        for(int i = 1; i <= 13; i++) {
            if(i < 11) {
                cards.add(new Card(i, DeckOfCards.class.getResource("/spades/" + i + "_of_spades.png"), true, "spades"));
            }else{
                cards.add(new Card(10, DeckOfCards.class.getResource("/spades/" + i + "_of_spades.png"), true, "spades"));
            }
        }
        //Creating and loading diamonds
        for(int i = 1; i <= 13; i++) {
            if(i < 11) {
                cards.add(new Card(i,DeckOfCards.class.getResource("/diamonds/" + i + "_of_diamonds.png"),false, "diamonds"));
            }else{
                cards.add(new Card(10,DeckOfCards.class.getResource("/diamonds/" + i + "_of_diamonds.png"), false, "diamonds"));
            }
        }
    }

    /**
     * Method for shuffling and picking three cards
     * @return three drawn cards
     */
    public ArrayList<Card> ShuffleAndPick(){

        ArrayList<Card> ThreePaths = new ArrayList<>();

        Random Generator = new Random();
        int FirstPick;
        int SecondPick;
        int ThirdPick;
            FirstPick = Generator.nextInt(52);
            SecondPick = Generator.nextInt(52);
            ThirdPick = Generator.nextInt(52);

        ThreePaths.add(cards.get(FirstPick));
        ThreePaths.add(cards.get(SecondPick));
        ThreePaths.add(cards.get(ThirdPick));

        return ThreePaths;
    }
    /**
     * Method for analyzing win by option of selection and analyzing cards
     * @param Option type of selection bet
     * @param ThreeCards contains three drawn cards
     * @return if you win or not
     */
    public boolean AnalyzeWin(String Option, ArrayList<Card> ThreeCards) {

        boolean Winning = false;

        switch (Option) {
            case "spades" -> {
                if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(1).getTypeCard()) && ThreeCards.get(1).getTypeCard().equals("spades")) {
                    Winning = true;
                } else if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(0).getTypeCard().equals("spades")) {
                    Winning = true;
                } else if (ThreeCards.get(1).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(2).getTypeCard().equals("spades")) {
                    Winning = true;
                }
            }
            case "hearts" -> {
                if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(1).getTypeCard()) && ThreeCards.get(1).getTypeCard().equals("hearts")) {
                    Winning = true;
                } else if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(0).getTypeCard().equals("hearts")) {
                    Winning = true;
                } else if (ThreeCards.get(1).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(2).getTypeCard().equals("hearts")) {
                    Winning = true;
                }
            }
            case "clubs" -> {
                if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(1).getTypeCard()) && ThreeCards.get(1).getTypeCard().equals("clubs")) {
                    Winning = true;
                } else if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(0).getTypeCard().equals("clubs")) {
                    Winning = true;
                } else if (ThreeCards.get(1).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(2).getTypeCard().equals("clubs")) {
                    Winning = true;
                }
            }
            case "diamonds" -> {
                if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(1).getTypeCard()) && ThreeCards.get(1).getTypeCard().equals("diamonds")) {
                    Winning = true;
                } else if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(0).getTypeCard().equals("diamonds")) {
                    Winning = true;
                } else if (ThreeCards.get(1).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(2).getTypeCard().equals("diamonds")) {
                    Winning = true;
                }
            }
            case "low" -> {
                if ((ThreeCards.get(0).getValue() + ThreeCards.get(1).getValue() + ThreeCards.get(2).getValue()) < 20) {
                    Winning = true;
                }
            }
            case "high" -> {
                if ((ThreeCards.get(0).getValue() + ThreeCards.get(1).getValue() + ThreeCards.get(2).getValue()) > 20) {
                    Winning = true;
                }
            }
            case "red" -> {
                if (ThreeCards.get(0).getBlack().equals(ThreeCards.get(1).getBlack()) && ThreeCards.get(1).getBlack().equals(false)) {
                    Winning = true;
                } else if (ThreeCards.get(0).getBlack().equals(ThreeCards.get(2).getBlack()) && ThreeCards.get(0).getBlack().equals(false)) {
                    Winning = true;
                } else if (ThreeCards.get(1).getBlack().equals(ThreeCards.get(2).getBlack()) && ThreeCards.get(2).getBlack().equals(false)) {
                    Winning = true;
                }
            }
            case "black" -> {
                if (ThreeCards.get(0).getBlack().equals(ThreeCards.get(1).getBlack()) && ThreeCards.get(1).getBlack().equals(true)) {
                    Winning = true;
                } else if (ThreeCards.get(0).getBlack().equals(ThreeCards.get(2).getBlack()) && ThreeCards.get(0).getBlack().equals(true)) {
                    Winning = true;
                } else if (ThreeCards.get(1).getBlack().equals(ThreeCards.get(2).getBlack()) && ThreeCards.get(2).getBlack().equals(true)) {
                    Winning = true;
                }
            }
        }
        return Winning;
    }
    //getter
    public ArrayList<Card> getCards() {
        return cards;
    }
}
