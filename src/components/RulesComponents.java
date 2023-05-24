package components;

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
 * Class to create components to RulesWindow
 * @author Ondřej Fejl
 */
public class RulesComponents implements ActionListener {
    private final RulesWindow RulesWindow;
    JPanel HeaderLine;
    JPanel FirstLine;
    JPanel SecondLine;
    JPanel ThirdLine;
    JPanel FourthLine;
    JPanel FifthLine;
    JButton Back;

    /**
     * Class constructor for creating components
     * @param RulesWindow for closing the window after clicking on another page
     */
    public RulesComponents(RulesWindow RulesWindow) {

        this.RulesWindow = RulesWindow;

        JLabel Head = new JLabel(); //label for title rules
        Head.setText("RULES");
        Head.setVerticalAlignment(JLabel.CENTER);
        Head.setHorizontalAlignment(JLabel.CENTER);
        Head.setForeground(Color.orange);
        Head.setFont(new Font("Calibri", Font.ITALIC, 46));

        JLabel First = new JLabel();    //label for first line rule
        First.setText("At the beginning you start with 1000 euro.");
        First.setVerticalAlignment(JLabel.BOTTOM);
        First.setHorizontalAlignment(JLabel.CENTER);
        First.setForeground(Color.orange);
        First.setFont(new Font("Calibri", Font.ITALIC, 24));

        JLabel Second = new JLabel();   //label for second line rule
        Second.setText("You can bet on 8 different combinations.");
        Second.setVerticalAlignment(JLabel.BOTTOM);
        Second.setHorizontalAlignment(JLabel.CENTER);
        Second.setForeground(Color.orange);
        Second.setFont(new Font("Calibri", Font.ITALIC, 24));

        JLabel Third = new JLabel();    //label for third line rule
        Third.setText("Before bet is necessarily to choose some amount to bet.");
        Third.setVerticalAlignment(JLabel.BOTTOM);
        Third.setHorizontalAlignment(JLabel.CENTER);
        Third.setForeground(Color.orange);
        Third.setFont(new Font("Calibri", Font.ITALIC, 24));

        JLabel Fourth = new JLabel();   //label for fourth line rule
        Fourth.setText("If you bet on only something then at least two of these cards must fall to win.");
        Fourth.setVerticalAlignment(JLabel.BOTTOM);
        Fourth.setHorizontalAlignment(JLabel.CENTER);
        Fourth.setForeground(Color.orange);
        Fourth.setFont(new Font("Calibri", Font.ITALIC, 24));

        JLabel Fifth = new JLabel();    //label for fifth line rule
        Fifth.setText("After bet you will see if yo won or not.");
        Fifth.setVerticalAlignment(JLabel.BOTTOM);
        Fifth.setHorizontalAlignment(JLabel.CENTER);
        Fifth.setForeground(Color.orange);
        Fifth.setFont(new Font("Calibri", Font.ITALIC, 24));

        HeaderLine = new JPanel();  //panel containining title
        HeaderLine.setBounds(200, 0, 400, 100);
        HeaderLine.setBackground(new Color(1, 80, 28));
        HeaderLine.setLayout(new BorderLayout());
        HeaderLine.add(Head);

        FirstLine = new JPanel();   //panel containing first rule
        FirstLine.setBounds(0, 175, 800, 50);
        FirstLine.setBackground(new Color(1, 80, 28));
        FirstLine.setLayout(new BorderLayout());
        FirstLine.add(First);

        SecondLine = new JPanel();  //panel containing second rule
        SecondLine.setBounds(0, 225, 800, 50);
        SecondLine.setBackground(new Color(1, 80, 28));
        SecondLine.setLayout(new BorderLayout());
        SecondLine.add(Second);

        ThirdLine = new JPanel();   //panel containing third rule
        ThirdLine.setBounds(0, 275, 800, 50);
        ThirdLine.setBackground(new Color(1, 80, 28));
        ThirdLine.setLayout(new BorderLayout());
        ThirdLine.add(Third);

        FourthLine = new JPanel();  //panel containing fourth rule
        FourthLine.setBounds(0, 325, 800, 50);
        FourthLine.setBackground(new Color(1, 80, 28));
        FourthLine.setLayout(new BorderLayout());
        FourthLine.add(Fourth);

        FifthLine = new JPanel();   //panel containing fifth rule
        FifthLine.setBounds(0, 375, 800, 50);
        FifthLine.setBackground(new Color(1, 80, 28));
        FifthLine.setLayout(new BorderLayout());
        FifthLine.add(Fifth);

        Back = new JButton();   //returning button to starting page
        Back.setBounds(200, 500, 400, 64);
        Back.addActionListener(this);
        Back.setText("BACK TO START");
        Back.setFont(new Font("Arial", Font.BOLD, 15));
        Back.setBackground(new Color(2, 48, 32));
        Back.setForeground(Color.white);
        Back.setFocusable(false);
        Back.setEnabled(true);
        Back.setVisible(true);
        Back.setBorder(BorderFactory.createEtchedBorder());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Back) {
            MainWindow MainWindow = new MainWindow();
            RulesWindow.dispose();
        }
    }


    //region GETTERS

    public JPanel getHeaderLine() {
        return HeaderLine;
    }

    public JPanel getFirstLine() {
        return FirstLine;
    }

    public JPanel getSecondLine() {
        return SecondLine;
    }

    public JPanel getThirdLine() {
        return ThirdLine;
    }

    public JPanel getFourthLine() {
        return FourthLine;
    }

    public JPanel getFifthLine() {
        return FifthLine;
    }

    public JButton getBack() {
        return Back;
    }

    //endregion
}