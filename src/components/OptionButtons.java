package components;

import cards.Card;
import cards.DeckOfCards;
import users.Gambler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Class to create components for choosing what you want to bet on
 * @author Ondřej Fejl
 */
public class OptionButtons implements ActionListener {

    Betting HidingBetting;
    private final Gambler player;
    private final JLabel PlayersPrize = new JLabel();
    JPanel PrizePanel;
    JButton CollectPrize;
    private final JLabel FirstCard = new JLabel();  //label for first drawn card
    private final JLabel SecondCard = new JLabel(); //label for second drawn card
    private final JLabel ThirdCard = new JLabel();  //label for third drawn card
    JPanel CardOne = new JPanel();  //panel containing the first card
    JPanel CardTwo = new JPanel();  //panel containing the second card
    JPanel CardThree = new JPanel();   //panel containing the third card
    JButton Spades; //choose option spades
    JButton Hearts; //choose option hearts
    JButton Clubs; //choose option clubs
    JButton Diamonds; //choose option diamonds
    JButton Low; //choose option low cards
    JButton High; //choose option high cards
    JButton Red; //choose option red cards
    JButton Black; //choose option black cards

    /**
     * Class constructor for creating components
     * @param player for finding out his current bet
     * @param HidingBetting for method on hding betting components
     */
    public OptionButtons(Gambler player, Betting HidingBetting) {

        this.player = player;
        this.HidingBetting = HidingBetting;

        //region SPADES
        Spades = new JButton();
        Spades.setBounds(0,240 , 200, 55);
        Spades.addActionListener(this);
        Spades.setText("BET");
        Spades.setFont(new Font("Arial", Font.BOLD, 15));
        Spades.setBackground(new Color(1, 80, 28));
        Spades.setForeground(Color.white);
        Spades.setFocusable(false);
        Spades.setEnabled(true);
        Spades.setBorder(BorderFactory.createEtchedBorder());
        //endregion
        //region HEARTS
        Hearts = new JButton();
        Hearts.setBounds(200,240 , 200, 55);
        Hearts.addActionListener(this);
        Hearts.setText("BET");
        Hearts.setFont(new Font("Arial", Font.BOLD, 15));
        Hearts.setBackground(new Color(1, 80, 28));
        Hearts.setForeground(Color.white);
        Hearts.setFocusable(false);
        Hearts.setEnabled(true);
        Hearts.setBorder(BorderFactory.createEtchedBorder());
        //endregion
        //region CLUBS
        Clubs = new JButton();
        Clubs.setBounds(400,240 , 200, 55);
        Clubs.addActionListener(this);
        Clubs.setText("BET");
        Clubs.setFont(new Font("Arial", Font.BOLD, 15));
        Clubs.setBackground(new Color(1, 80, 28));
        Clubs.setForeground(Color.white);
        Clubs.setFocusable(false);
        Clubs.setEnabled(true);
        Clubs.setBorder(BorderFactory.createEtchedBorder());
        //endregion
        //region DIAMONDS
        Diamonds = new JButton();
        Diamonds.setBounds(600,240 , 200, 55);
        Diamonds.addActionListener(this);
        Diamonds.setText("BET");
        Diamonds.setFont(new Font("Arial", Font.BOLD, 15));
        Diamonds.setBackground(new Color(1, 80, 28));
        Diamonds.setForeground(Color.white);
        Diamonds.setFocusable(false);
        Diamonds.setEnabled(true);
        Diamonds.setBorder(BorderFactory.createEtchedBorder());
        //endregion
        // region LOW
        Low = new JButton();
        Low.setBounds(0,365 , 200, 55);
        Low.addActionListener(this);
        Low.setText("BET");
        Low.setFont(new Font("Arial", Font.BOLD, 15));
        Low.setBackground(new Color(1, 80, 28));
        Low.setForeground(Color.white);
        Low.setFocusable(false);
        Low.setEnabled(true);
        Low.setBorder(BorderFactory.createEtchedBorder());
        //endregion
        //region HIGH
        High = new JButton();
        High.setBounds(200,365 , 200, 55);
        High.addActionListener(this);
        High.setText("BET");
        High.setFont(new Font("Arial", Font.BOLD, 15));
        High.setBackground(new Color(1, 80, 28));
        High.setForeground(Color.white);
        High.setFocusable(false);
        High.setEnabled(true);
        High.setBorder(BorderFactory.createEtchedBorder());
        //endregion
        //region RED
        Red = new JButton();
        Red.setBounds(400,365 , 200, 55);
        Red.addActionListener(this);
        Red.setText("BET");
        Red.setFont(new Font("Arial", Font.BOLD, 15));
        Red.setBackground(new Color(1, 80, 28));
        Red.setForeground(Color.white);
        Red.setFocusable(false);
        Red.setEnabled(true);
        Red.setBorder(BorderFactory.createEtchedBorder());
        //endregion
        //region BLACK
        Black = new JButton();
        Black.setBounds(600,365 , 200, 55);
        Black.addActionListener(this);
        Black.setText("BET");
        Black.setFont(new Font("Arial", Font.BOLD, 15));
        Black.setBackground(new Color(1, 80, 28));
        Black.setForeground(Color.white);
        Black.setFocusable(false);
        Black.setEnabled(true);
        Black.setBorder(BorderFactory.createEtchedBorder());
        //endregion

        //creating back of cards
        ImageIcon OffImage = new ImageIcon(OptionButtons.class.getResource("/back_of_cards.jpg"));

        //setting first card
        FirstCard.setIcon(OffImage);
        FirstCard.setVerticalAlignment(JLabel.CENTER);
        FirstCard.setHorizontalAlignment(JLabel.CENTER);
        FirstCard.setBackground(new Color(3, 115, 50));
        FirstCard.setOpaque(true);
        FirstCard.setLayout(new BorderLayout());

        CardOne.setBounds(160, 0, 160, 170);
        CardOne.setBackground(new Color(1, 80, 28));
        CardOne.setLayout(new BorderLayout());
        CardOne.add(FirstCard);

        //setting second card
        SecondCard.setIcon(OffImage);
        SecondCard.setVerticalAlignment(JLabel.CENTER);
        SecondCard.setHorizontalAlignment(JLabel.CENTER);
        SecondCard.setBackground(new Color(3, 115, 50));
        SecondCard.setOpaque(true);
        SecondCard.setLayout(new BorderLayout());

        CardTwo.setBounds(320, 0, 160, 170);
        CardTwo.setBackground(new Color(1, 80, 28));
        CardTwo.setLayout(new BorderLayout());
        CardTwo.add(SecondCard);

        //crating third card
        ThirdCard.setIcon(OffImage);
        ThirdCard.setVerticalAlignment(JLabel.CENTER);
        ThirdCard.setHorizontalAlignment(JLabel.CENTER);
        ThirdCard.setBackground(new Color(3, 115, 50));
        ThirdCard.setOpaque(true);
        ThirdCard.setLayout(new BorderLayout());

        CardThree.setBounds(480, 0, 160, 170);
        CardThree.setBackground(new Color(1, 80, 28));
        CardThree.setLayout(new BorderLayout());
        CardThree.add(ThirdCard);

        //label showing if you won or not
        PlayersPrize.setText(" ");
        PlayersPrize.setVerticalAlignment(JLabel.CENTER);
        PlayersPrize.setHorizontalAlignment(JLabel.CENTER);
        PlayersPrize.setForeground(Color.white);
        PlayersPrize.setBackground(new Color(196,95,0));
        PlayersPrize.setFont(new Font("Calibri", Font.ITALIC,24));
        PlayersPrize.setOpaque(true);
        PlayersPrize.setLayout(new BorderLayout());

        PrizePanel = new JPanel();
        PrizePanel.setBounds(0, 420, 800, 80);
        PrizePanel.setLayout(new BorderLayout());
        PrizePanel.add(PlayersPrize);
        PrizePanel.setVisible(false);
        PrizePanel.setOpaque(true);

        //button on continue to next round
        CollectPrize = new JButton();
        CollectPrize.setBounds(200,500 , 400, 64);
        CollectPrize.addActionListener(this);
        CollectPrize.setText("CONTINUE");
        CollectPrize.setFont(new Font("Arial", Font.BOLD, 15));
        CollectPrize.setBackground(new Color(2,48,32));
        CollectPrize.setForeground(Color.white);
        CollectPrize.setFocusable(false);
        CollectPrize.setEnabled(true);
        CollectPrize.setVisible(false);
        CollectPrize.setBorder(BorderFactory.createEtchedBorder());
    }

    /**
     * Method for printing winning
     * @param Option what user bet on
     * @param Chance chance of winning
     */
    public void ShowPrize(String Option, double Chance) {

        if(player.getCurrentBet() > 0) {

            DeckOfCards Cards = new DeckOfCards();
            ArrayList<Card> ChooseCards = Cards.ShuffleAndPick();

            ImageIcon FirstImage = new ImageIcon(ChooseCards.get(0).getPath());
            ImageIcon SecondImage = new ImageIcon(ChooseCards.get(1).getPath());
            ImageIcon ThirdImage = new ImageIcon(ChooseCards.get(2).getPath());

            FirstCard.setIcon(FirstImage);
            SecondCard.setIcon(SecondImage);
            ThirdCard.setIcon(ThirdImage);
            if (Cards.AnalyzeWin(Option, ChooseCards)) {
                PlayersPrize.setText("YOU WON " + player.getCurrentBet() * Chance + " €");
                player.setFortune(player.getFortune() + (player.getCurrentBet() * Chance));
                player.setCurrentBet(0);
                HidingBetting.getBettingValueLabel().setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
                HidingBetting.getFortuneValueLabel().setText(player.getFortune() + " €");
            } else {
                PlayersPrize.setText("UNFORTUNATELY YOU LOST " + player.getCurrentBet() + " €");
                player.setCurrentBet(0);
                HidingBetting.getBettingValueLabel().setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
            }
            HidingBetting.hide(false);
            CollectPrize.setVisible(true);
            PrizePanel.setVisible(true);

        }else{
            JOptionPane.showMessageDialog(null, "You haven't bet yet, please choose the value which you want to bet!", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Spades) {
            ShowPrize("spades",2.06);
        }else if(e.getSource()==Hearts){
            ShowPrize("hearts",2.06);
        }else if(e.getSource()==Clubs){
            ShowPrize("clubs",2.06);
        }else if(e.getSource()==Diamonds) {
            ShowPrize("diamonds",2.06);
        }else if(e.getSource()==Low) {
            ShowPrize("low",2.06);
        }else if(e.getSource()==High){
            ShowPrize("high",2.06);
        }else if(e.getSource()==Red) {
            ShowPrize("red",2.06);
        }else if(e.getSource()==Black) {
            ShowPrize("black",2.06);
        }else if(e.getSource()== CollectPrize){
            HidingBetting.hide(true);
            CollectPrize.setVisible(false);
            PrizePanel.setVisible(false);
            ImageIcon OffImage = new ImageIcon(OptionButtons.class.getResource("/back_of_cards.jpg"));
            FirstCard.setIcon(OffImage);
            SecondCard.setIcon(OffImage);
            ThirdCard.setIcon(OffImage);
        }
    }
    //region GETTERS
    public JButton getSpades() {
        return Spades;
    }
    public JButton getHearts() {
        return Hearts;
    }
    public JButton getClubs() {
        return Clubs;
    }
    public JButton getDiamonds() {
        return Diamonds;
    }
    public JButton getLow() {
        return Low;
    }
    public JButton getHigh() {
        return High;
    }
    public JButton getRed() {
        return Red;
    }
    public JButton getBlack() {
        return Black;
    }
    public JPanel getCardOne() {
        return CardOne;
    }
    public JPanel getCardTwo() {
        return CardTwo;
    }
    public JPanel getCardThree() {
        return CardThree;
    }
    public JPanel getPrizePanel() {
        return PrizePanel;
    }
    public JButton getCollectPrize() {
        return CollectPrize;
    }
    //endregion
}
