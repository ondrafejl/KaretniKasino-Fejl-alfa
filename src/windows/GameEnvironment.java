package windows;

import components.Betting;
import components.OptionButtons;
import components.Options;
import users.Gambler;

import javax.swing.JFrame;
import java.awt.Color;

/**
 * Class to create the main gaming window
 * @author Ondřej Fejl
 */
public class GameEnvironment extends JFrame {

    /**
     * Class constructor for creating the game
     */
    public GameEnvironment(){

        Gambler player = new Gambler();

        //setting game page
        this.setSize(800, 600);
        this.setTitle("Karetni Kasino");
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(3, 115, 50));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding components from class Betting to game page
        Betting BettingButtons = new Betting(player, this);
            this.add(BettingButtons.getBet10());
            this.add(BettingButtons.getBet50());
            this.add(BettingButtons.getBet200());
            this.add(BettingButtons.getBet500());
            this.add(BettingButtons.getBet5000());
            this.add(BettingButtons.getDeleteValue());
            this.add(BettingButtons.getLeaveTheGame());
            this.add(BettingButtons.getFortunePanel());
            this.add(BettingButtons.getFortuneValuePanel());
            this.add(BettingButtons.getBettingValuePanel());

        //adding components from class OptionButtons to game page
        OptionButtons OptionsForBetting = new OptionButtons(player, BettingButtons);
            this.add(OptionsForBetting.getSpades());
            this.add(OptionsForBetting.getHearts());
            this.add(OptionsForBetting.getClubs());
            this.add(OptionsForBetting.getDiamonds());
            this.add(OptionsForBetting.getLow());
            this.add(OptionsForBetting.getHigh());
            this.add(OptionsForBetting.getRed());
            this.add(OptionsForBetting.getBlack());

            this.add(OptionsForBetting.getCardOne());
            this.add(OptionsForBetting.getCardTwo());
            this.add(OptionsForBetting.getCardThree());

            this.add(OptionsForBetting.getPrizePanel());
            this.add(OptionsForBetting.getCollectPrize());

        //adding components from class Option to game page
        Options OptionPanels = new Options();
            this.add(OptionPanels.getSpades());
            this.add(OptionPanels.getSpadesChance());
            this.add(OptionPanels.getHearts());
            this.add(OptionPanels.getHeartsChance());
            this.add(OptionPanels.getClubs());
            this.add(OptionPanels.getClubsChance());
            this.add(OptionPanels.getDiamonds());
            this.add(OptionPanels.getDiamondsChance());
            this.add(OptionPanels.getLow());
            this.add(OptionPanels.getLowChance());
            this.add(OptionPanels.getHigh());
            this.add(OptionPanels.getHighChance());
            this.add(OptionPanels.getRed());
            this.add(OptionPanels.getRedChance());
            this.add(OptionPanels.getBlack());
            this.add(OptionPanels.getBlackChance());
    }
}
