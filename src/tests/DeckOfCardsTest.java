package tests;

import cards.Card;
import cards.DeckOfCards;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {

    @org.junit.jupiter.api.Test
    void shuffleAndPick() {

        ArrayList<Card> ThreePaths = new ArrayList<>();

        DeckOfCards cards = new DeckOfCards();


        int FirstPick = 2;
        int SecondPick = 16;
        int ThirdPick = 51;

        ThreePaths.add(cards.getCards().get(FirstPick));
        ThreePaths.add(cards.getCards().get(SecondPick));
        ThreePaths.add(cards.getCards().get(ThirdPick));

        Card one = cards.getCards().get(FirstPick);
        Card second = cards.getCards().get(SecondPick);
        Card third= cards.getCards().get(ThirdPick);

        assertEquals(one, ThreePaths.get(0));
        assertEquals(second, ThreePaths.get(1));
        assertEquals(third, ThreePaths.get(2));

    }
    @org.junit.jupiter.api.Test
    void shuffleAndPick2() {

        ArrayList<Card> ThreePaths = new ArrayList<>();

        DeckOfCards cards = new DeckOfCards();


        int FirstPick = 0;
        int SecondPick = 52;
        int ThirdPick = 56;

        ThreePaths.add(cards.getCards().get(FirstPick));
        ThreePaths.add(cards.getCards().get(SecondPick));
        ThreePaths.add(cards.getCards().get(ThirdPick));

        Card one = cards.getCards().get(FirstPick);
        Card second = cards.getCards().get(SecondPick);
        Card third= cards.getCards().get(ThirdPick);

        assertEquals(one, ThreePaths.get(0));
        assertEquals(second, ThreePaths.get(1));
        assertEquals(third, ThreePaths.get(2));

    }
    //teesting spades win
    @org.junit.jupiter.api.Test
    void analyzeWinSpades() {

        boolean Winning = false;
        String Option = "spades";
        DeckOfCards cards = new DeckOfCards();
        ArrayList<Card> ThreeCards = new ArrayList<>();

        int FirstPick = 27;
        int SecondPick = 28;
        int ThirdPick = 1;

        ThreeCards.add(cards.getCards().get(FirstPick));
        ThreeCards.add(cards.getCards().get(SecondPick));
        ThreeCards.add(cards.getCards().get(ThirdPick));

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
        }
        assertTrue(Winning);
    }
    //teesting hearts win
    @org.junit.jupiter.api.Test
    void analyzeWinHearts() {

        boolean Winning = false;
        String Option = "hearts";
        DeckOfCards cards = new DeckOfCards();
        ArrayList<Card> ThreeCards = new ArrayList<>();

        int FirstPick = 17;
        int SecondPick = 18;
        int ThirdPick = 1;

        ThreeCards.add(cards.getCards().get(FirstPick));
        ThreeCards.add(cards.getCards().get(SecondPick));
        ThreeCards.add(cards.getCards().get(ThirdPick));

        switch (Option) {
            case "hearts" -> {
                if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(1).getTypeCard()) && ThreeCards.get(1).getTypeCard().equals("hearts")) {
                    Winning = true;
                } else if (ThreeCards.get(0).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(0).getTypeCard().equals("hearts")) {
                    Winning = true;
                } else if (ThreeCards.get(1).getTypeCard().equals(ThreeCards.get(2).getTypeCard()) && ThreeCards.get(2).getTypeCard().equals("hearts")) {
                    Winning = true;
                }
            }
        }
        assertTrue(Winning);
    }
    //teesting black win
    @org.junit.jupiter.api.Test
    void analyzeWinBlack() {

        boolean Winning = false;
        String Option = "black";
        DeckOfCards cards = new DeckOfCards();
        ArrayList<Card> ThreeCards = new ArrayList<>();

        int FirstPick = 17;
        int SecondPick = 30;
        int ThirdPick = 1;

        ThreeCards.add(cards.getCards().get(FirstPick));
        ThreeCards.add(cards.getCards().get(SecondPick));
        ThreeCards.add(cards.getCards().get(ThirdPick));

        switch (Option) {
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
        assertTrue(Winning);
    }
    //teesting low win
    @org.junit.jupiter.api.Test
    void analyzeWinLow() {

        boolean Winning = false;
        String Option = "black";
        DeckOfCards cards = new DeckOfCards();
        ArrayList<Card> ThreeCards = new ArrayList<>();

        int FirstPick = 0;
        int SecondPick = 30;
        int ThirdPick = 17;

        ThreeCards.add(cards.getCards().get(FirstPick));
        ThreeCards.add(cards.getCards().get(SecondPick));
        ThreeCards.add(cards.getCards().get(ThirdPick));

        switch (Option) {
            case "black" -> {
                if ((ThreeCards.get(0).getValue() + ThreeCards.get(1).getValue() + ThreeCards.get(2).getValue()) < 20) {
                    Winning = true;
                }
            }
        }
        assertTrue(Winning);
    }


}