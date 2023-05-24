package users;

import javax.swing.JOptionPane;

/**
 * Class to create the player
 * @author Ondřej Fejl
 */
public class Gambler {
    private double Fortune;
    private int CurrentBet;

    /**
     * Class constructor to create the player with initial input 1000 euros
     */
    public Gambler() {
        Fortune = 1000;
        CurrentBet = 0;
    }

    /**
     * Method for veryfiing if current bet can be made
     * @param VerifyBet bet to check
     */
    public void VerifyFortune(int VerifyBet){
        if(Fortune - VerifyBet >= 0){
            CurrentBet += VerifyBet;
            Fortune -= VerifyBet;
        }else{
            JOptionPane.showMessageDialog(null, "You don't have too much cash!!!", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * Method for deleting current bet
     */
    public void DeleteCurrentBet(){
        Fortune += CurrentBet;
        CurrentBet = 0;
    }

    //region Getters and Setters
    public double getFortune() {
        return Fortune;
    }
    public void setFortune(double fortune) {
        Fortune = fortune;
    }
    public int getCurrentBet() {
        return CurrentBet;
    }
    public void setCurrentBet(int currentBet) {
        CurrentBet = currentBet;
    }

    //endregion
}
