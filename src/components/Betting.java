package components;

import users.Gambler;
import windows.GameEnvironment;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Class to create components for betting
 * @author Ondřej Fejl
 */
public class Betting implements ActionListener {

    private final Gambler player;
    private final GameEnvironment GameEnvironment;
    private final JLabel BettingValueLabel = new JLabel();  //label showing your current bet
    private final JLabel FortuneValueLabel = new JLabel();  //label showing your current fortune
    JPanel FortunePanel = new JPanel(); //panel containing title fortune
    JPanel FortuneValuePanel = new JPanel();    //panel containing value of your fortune
    JPanel BettingValuePanel = new JPanel();    //panel containing your current bet
    JButton Bet10 = new JButton();
    JButton Bet50 = new JButton();
    JButton Bet200 = new JButton();
    JButton Bet500 = new JButton();
    JButton Bet5000 = new JButton();
    JButton DeleteValue = new JButton();
    JButton LeaveTheGame  = new JButton();

    /**
     * Class constructor for creating the components
     * @param player for setting his current bet and fortune
     * @param GameEnvironment for closing window after click on LeaveTheGame
     */
    public Betting(Gambler player, GameEnvironment GameEnvironment) {

        this.GameEnvironment = GameEnvironment;
        this.player = player;

        Bet10.setBounds(10,475 , 146, 80);
        Bet10.addActionListener(this);
        Bet10.setText("10");
        Bet10.setFont(new Font("Arial", Font.BOLD, 24));
        Bet10.setBackground(Color.blue);
        Bet10.setForeground(Color.black);
        Bet10.setFocusable(false);
        Bet10.setEnabled(true);
        Bet10.setBorder(BorderFactory.createEtchedBorder());

        Bet50.setBounds(166, 475, 146, 80);
        Bet50.addActionListener(this);
        Bet50.setText("50");
        Bet50.setFont(new Font("Arial", Font.BOLD, 24));
        Bet50.setBackground(Color.blue);
        Bet50.setForeground(Color.black);
        Bet50.setFocusable(false);
        Bet50.setEnabled(true);
        Bet50.setBorder(BorderFactory.createEtchedBorder());

        Bet200.setBounds(322, 475, 146, 80);
        Bet200.addActionListener(this);
        Bet200.setText("200");
        Bet200.setFont(new Font("Arial", Font.BOLD, 24));
        Bet200.setBackground(Color.blue);
        Bet200.setForeground(Color.black);
        Bet200.setFocusable(false);
        Bet200.setEnabled(true);
        Bet200.setBorder(BorderFactory.createEtchedBorder());

        Bet500.setBounds(478, 475, 146, 80);
        Bet500.addActionListener(this);
        Bet500.setText("500");
        Bet500.setFont(new Font("Arial", Font.BOLD, 24));
        Bet500.setBackground(Color.blue);
        Bet500.setForeground(Color.black);
        Bet500.setFocusable(false);
        Bet500.setEnabled(true);
        Bet500.setBorder(BorderFactory.createEtchedBorder());

        Bet5000.setBounds(634, 475, 146, 80);
        Bet5000.addActionListener(this);
        Bet5000.setText("5000");
        Bet5000.setFont(new Font("Arial", Font.BOLD, 24));
        Bet5000.setBackground(Color.blue);
        Bet5000.setForeground(Color.black);
        Bet5000.setFocusable(false);
        Bet5000.setEnabled(true);
        Bet5000.setBorder(BorderFactory.createEtchedBorder());

        DeleteValue.setBounds(600, 420, 200, 45);
        DeleteValue.addActionListener(this);
        DeleteValue.setText("delete current bet");
        DeleteValue.setFont(new Font("Arial", Font.BOLD, 15));
        DeleteValue.setBackground(Color.red);
        DeleteValue.setForeground(Color.orange);
        DeleteValue.setFocusable(false);
        DeleteValue.setEnabled(true);
        DeleteValue.setBorder(BorderFactory.createEtchedBorder());

        LeaveTheGame.setBounds(640, 0, 160, 170);
        LeaveTheGame.addActionListener(this);
        LeaveTheGame.setText("LEAVE GAME");
        LeaveTheGame.setFont(new Font("Arial", Font.BOLD, 19));
        LeaveTheGame.setBackground(Color.red);
        LeaveTheGame.setForeground(Color.orange);
        LeaveTheGame.setFocusable(false);
        LeaveTheGame.setEnabled(true);
        LeaveTheGame.setBorder(BorderFactory.createEtchedBorder());

        BettingValueLabel.setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
        BettingValueLabel.setVerticalAlignment(JLabel.CENTER);
        BettingValueLabel.setHorizontalAlignment(JLabel.LEFT);
        BettingValueLabel.setForeground(Color.white);
        BettingValueLabel.setFont(new Font("Calibri", Font.BOLD,19));
        BettingValueLabel.setOpaque(false);
        BettingValueLabel.setLayout(new BorderLayout());

        BettingValuePanel.setBounds(0,420,600,45);
        BettingValuePanel.setBackground(Color.BLACK);
        BettingValuePanel.setLayout(new BorderLayout());
        BettingValuePanel.setOpaque(true);
        BettingValuePanel.add(BettingValueLabel);

        JLabel FortuneLabel = new JLabel();
        FortuneLabel.setText(" YOUR FORTUNE: ");
        FortuneLabel.setVerticalAlignment(JLabel.CENTER);
        FortuneLabel.setHorizontalAlignment(JLabel.CENTER);
        FortuneLabel.setForeground(Color.white);
        FortuneLabel.setBackground(Color.black);
        FortuneLabel.setFont(new Font("Calibri", Font.ITALIC,19));
        FortuneLabel.setOpaque(true);
        FortuneLabel.setLayout(new BorderLayout());

        FortuneValueLabel.setText(player.getFortune() + " €");
        FortuneValueLabel.setVerticalAlignment(JLabel.CENTER);
        FortuneValueLabel.setHorizontalAlignment(JLabel.CENTER);
        FortuneValueLabel.setForeground(Color.white);
        FortuneValueLabel.setBackground(Color.black);
        FortuneValueLabel.setFont(new Font("Calibri", Font.ITALIC,33));
        FortuneValueLabel.setOpaque(true);
        FortuneValueLabel.setLayout(new BorderLayout());

        FortuneValuePanel.setBounds(0, 0, 160, 70);
        FortuneValuePanel.setBackground(Color.white);
        FortuneValuePanel.setLayout(new BorderLayout());
        FortuneValuePanel.add(FortuneLabel);

        FortunePanel.setBounds(0, 70, 160, 100);
        FortunePanel.setBackground(Color.white);
        FortunePanel.setLayout(new BorderLayout());
        FortunePanel.add(FortuneValueLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Bet10) {
            player.VerifyFortune(10);
            BettingValueLabel.setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
            FortuneValueLabel.setText(player.getFortune() + " €");
        }else if(e.getSource()==Bet50){
            player.VerifyFortune(50);
            BettingValueLabel.setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
            FortuneValueLabel.setText(player.getFortune() + " €");
        }else if(e.getSource()==Bet200){
            player.VerifyFortune(200);
            BettingValueLabel.setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
            FortuneValueLabel.setText(player.getFortune() + " €");
        }else if(e.getSource()==Bet500) {
            player.VerifyFortune(500);
            BettingValueLabel.setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
            FortuneValueLabel.setText(player.getFortune() + " €");
        }else if(e.getSource()==Bet5000) {
            player.VerifyFortune(5000);
            BettingValueLabel.setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
            FortuneValueLabel.setText(player.getFortune() + " €");
        }else if(e.getSource()==DeleteValue){
            player.DeleteCurrentBet();
            BettingValueLabel.setText("YOUR CURRENT BET: " + player.getCurrentBet() + " €");
            FortuneValueLabel.setText(player.getFortune() + " €");
        }else if(e.getSource() == LeaveTheGame){
            GameEnvironment.dispose();
        }
    }

    /**
     * Method for hiding or viewing betting panel after bet
     * @param visible setting visible or unvisible
     */
    //method for hiding betting panel after bet
    public void hide(boolean visible) {
        Bet10.setVisible(visible);
        Bet50.setVisible(visible);
        Bet200.setVisible(visible);
        Bet500.setVisible(visible);
        Bet5000.setVisible(visible);
        DeleteValue.setVisible(visible);
        BettingValuePanel.setVisible(visible);
    }

    //region GETTERS
    public JButton getBet10() {
        return Bet10;
    }

    public JButton getBet50() {
        return Bet50;
    }

    public JButton getBet200() {
        return Bet200;
    }

    public JButton getBet500() {
        return Bet500;
    }

    public JButton getBet5000() {
        return Bet5000;
    }

    public JButton getDeleteValue() {
        return DeleteValue;
    }

    public JButton getLeaveTheGame() {
        return LeaveTheGame;
    }

    public JPanel getBettingValuePanel() {
        return BettingValuePanel;
    }

    public JPanel getFortuneValuePanel() {
        return FortuneValuePanel;
    }

    public JPanel getFortunePanel() {
        return FortunePanel;
    }

    public JLabel getBettingValueLabel() {
        return BettingValueLabel;
    }

    public JLabel getFortuneValueLabel() {
        return FortuneValueLabel;
    }

    //endregion
}
