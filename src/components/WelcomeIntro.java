package components;

import windows.GameEnvironment;
import windows.MainWindow;
import windows.RulesWindow;

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
 * Class to create components to MainWindow
 * @author Ondřej Fejl
 */
public class WelcomeIntro implements ActionListener {

    private final MainWindow WindowToClose; //atribute which is on closing main window after redirection
    JPanel HeaderPanel;
    JPanel MiddlePanel;
    JButton Rules;
    JButton Game;

    /**
     * Class constructor for creating the components
     * @param WindowToClose for closing main window after clicking on another page
     */
    public WelcomeIntro(MainWindow WindowToClose){

        this.WindowToClose = WindowToClose;

        JLabel HeaderLabel = new JLabel();  //label for title
        HeaderLabel.setText("K A R E T N Í   K A S I N O");
        HeaderLabel.setVerticalAlignment(JLabel.CENTER);
        HeaderLabel.setHorizontalAlignment(JLabel.CENTER);
        HeaderLabel.setForeground(Color.WHITE);
        HeaderLabel.setFont(new Font("Calibri", Font.BOLD, 42));

        HeaderPanel = new JPanel(); //panel for HeaderLabel
        HeaderPanel.setBounds(0, 0, 800, 250);
        HeaderPanel.setBackground(Color.darkGray);
        HeaderPanel.setLayout(new BorderLayout());
        HeaderPanel.add(HeaderLabel);

        JLabel MiddleLabel = new JLabel();  //welcome label
        MiddleLabel.setText("Welcome to the Karetni Kasino by clicking the button you confirm that you are over 18 years old.");
        MiddleLabel.setVerticalAlignment(JLabel.CENTER);
        MiddleLabel.setHorizontalAlignment(JLabel.CENTER);
        MiddleLabel.setForeground(Color.orange);
        MiddleLabel.setFont(new Font("Calibri", Font.ITALIC, 19));

        MiddlePanel = new JPanel();  //panel for MiddleLabel
        MiddlePanel.setBounds(0, 250, 800, 150);
        MiddlePanel.setBackground(Color.gray);
        MiddlePanel.setLayout(new BorderLayout());
        MiddlePanel.add(MiddleLabel);

        Rules = new JButton();  //button on redirection to rules page
        Rules.setBounds(150, 430, 200, 100);
        Rules.addActionListener(this);
        Rules.setText("RULES");
        Rules.setFocusable(false);
        Rules.setBackground(Color.gray);
        Rules.setForeground(Color.black);
        Rules.setBorder(BorderFactory.createEtchedBorder());
        Rules.setEnabled(true);

        Game = new JButton();   //button on redirection to main game page
        Game.setBounds(450, 430, 200, 100);
        Game.addActionListener(this);
        Game.setText("PLAY!");
        Game.setFocusable(false);
        Game.setBackground(Color.gray);
        Game.setForeground(Color.black);
        Game.setBorder(BorderFactory.createEtchedBorder());
        Game.setEnabled(true);
}

    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == Rules){
            RulesWindow Rules = new RulesWindow();
            WindowToClose.dispose();
        }else if (e.getSource() == Game) {
            GameEnvironment Game = new GameEnvironment();
            WindowToClose.dispose();
        }
    }

    //region GETTERS
    public JPanel getHeaderPanel() {
        return HeaderPanel;
    }

    public JPanel getMiddlePanel() {
        return MiddlePanel;
    }

    public JButton getRules() {
        return Rules;
    }

    public JButton getGame() {
        return Game;
    }

    //endregion
}
