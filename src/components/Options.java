package components;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

/**
 * Class to create option menu what does player want to bet on
 * @author Ondřej Fejl
 */
public class Options {
    JPanel Spades;
    JPanel SpadesChance;
    JPanel Hearts;
    JPanel HeartsChance;
    JPanel Clubs;
    JPanel ClubsChance;
    JPanel Diamonds;
    JPanel DiamondsChance;
    JPanel Low;
    JPanel LowChance;
    JPanel High;
    JPanel HighChance;
    JPanel Red;
    JPanel RedChance;
    JPanel Black;
    JPanel BlackChance;

    /**
     * Class constructor for creating the menu
     */
    public Options() {

        //region SPADES
        JLabel SpadesLabel = new JLabel();
        SpadesLabel.setText("ONLY SPADES");
        SpadesLabel.setVerticalAlignment(JLabel.BOTTOM);
        SpadesLabel.setHorizontalAlignment(JLabel.CENTER);
        SpadesLabel.setForeground(Color.orange);
        SpadesLabel.setFont(new Font("Calibri", Font.ITALIC,24));

        JLabel SpadesLabelChance = new JLabel();
        SpadesLabelChance.setText("1:2.06");
        SpadesLabelChance.setVerticalAlignment(JLabel.BOTTOM);
        SpadesLabelChance.setHorizontalAlignment(JLabel.CENTER);
        SpadesLabelChance.setForeground(Color.orange);
        SpadesLabelChance.setFont(new Font("Calibri", Font.ITALIC,24));

        Spades = new JPanel();
        Spades.setBounds(0, 170, 200, 35);
        Spades.setBackground(new Color(1, 80, 28));
        Spades.setLayout(new BorderLayout());
        Spades.add(SpadesLabel);

        SpadesChance = new JPanel();
        SpadesChance.setBounds(0, 205, 200, 35);
        SpadesChance.setBackground(new Color(1, 80, 28));
        SpadesChance.setLayout(new BorderLayout());
        SpadesChance.add(SpadesLabelChance);
        //endregion
        //region HEARTS
        JLabel HeartsLabel = new JLabel();
        HeartsLabel.setText("ONLY HEARTS");
        HeartsLabel.setVerticalAlignment(JLabel.BOTTOM);
        HeartsLabel.setHorizontalAlignment(JLabel.CENTER);
        HeartsLabel.setForeground(Color.orange);
        HeartsLabel.setFont(new Font("Calibri", Font.ITALIC,24));

        JLabel HeartsLabelChance = new JLabel();
        HeartsLabelChance.setText("1:2.06");
        HeartsLabelChance.setVerticalAlignment(JLabel.BOTTOM);
        HeartsLabelChance.setHorizontalAlignment(JLabel.CENTER);
        HeartsLabelChance.setForeground(Color.orange);
        HeartsLabelChance.setFont(new Font("Calibri", Font.ITALIC,24));

        Hearts = new JPanel();
        Hearts.setBounds(200, 170, 200, 35);
        Hearts.setBackground(new Color(1, 80, 28));
        Hearts.setLayout(new BorderLayout());
        Hearts.add(HeartsLabel);

        HeartsChance = new JPanel();
        HeartsChance.setBounds(200, 205, 200, 35);
        HeartsChance.setBackground(new Color(1, 80, 28));
        HeartsChance.setLayout(new BorderLayout());
        HeartsChance.add(HeartsLabelChance);
        //endregion
        //region Clubs
        JLabel ClubsLabel = new JLabel();
        ClubsLabel.setText("ONLY CLUBS");
        ClubsLabel.setVerticalAlignment(JLabel.BOTTOM);
        ClubsLabel.setHorizontalAlignment(JLabel.CENTER);
        ClubsLabel.setForeground(Color.orange);
        ClubsLabel.setFont(new Font("Calibri", Font.ITALIC,24));

        JLabel ClubsLabelChance = new JLabel();
        ClubsLabelChance.setText("1:2.06");
        ClubsLabelChance.setVerticalAlignment(JLabel.BOTTOM);
        ClubsLabelChance.setHorizontalAlignment(JLabel.CENTER);
        ClubsLabelChance.setForeground(Color.orange);
        ClubsLabelChance.setFont(new Font("Calibri", Font.ITALIC,24));

        Clubs = new JPanel();
        Clubs.setBounds(400, 170, 200, 35);
        Clubs.setBackground(new Color(1, 80, 28));
        Clubs.setLayout(new BorderLayout());
        Clubs.add(ClubsLabel);

        ClubsChance = new JPanel();
        ClubsChance.setBounds(400, 205, 200, 35);
        ClubsChance.setBackground(new Color(1, 80, 28));
        ClubsChance.setLayout(new BorderLayout());
        ClubsChance.add(ClubsLabelChance);
        //endregion
        //region Diamonds
        JLabel DiamondsLabel = new JLabel();
        DiamondsLabel.setText("ONLY DIAMONDS");
        DiamondsLabel.setVerticalAlignment(JLabel.BOTTOM);
        DiamondsLabel.setHorizontalAlignment(JLabel.CENTER);
        DiamondsLabel.setForeground(Color.orange);
        DiamondsLabel.setFont(new Font("Calibri", Font.ITALIC,24));

        JLabel DiamondsLabelChance = new JLabel();
        DiamondsLabelChance.setText("1:2.06");
        DiamondsLabelChance.setVerticalAlignment(JLabel.BOTTOM);
        DiamondsLabelChance.setHorizontalAlignment(JLabel.CENTER);
        DiamondsLabelChance.setForeground(Color.orange);
        DiamondsLabelChance.setFont(new Font("Calibri", Font.ITALIC,24));

        Diamonds = new JPanel();
        Diamonds.setBounds(600, 170, 200, 35);
        Diamonds.setBackground(new Color(1, 80, 28));
        Diamonds.setLayout(new BorderLayout());
        Diamonds.add(DiamondsLabel);

        DiamondsChance = new JPanel();
        DiamondsChance.setBounds(600, 205, 200, 35);
        DiamondsChance.setBackground(new Color(1, 80, 28));
        DiamondsChance.setLayout(new BorderLayout());
        DiamondsChance.add(DiamondsLabelChance);
        //endregion
        // region LOW
        JLabel LowLabel = new JLabel();
        LowLabel.setText("VALUE = 3 - 19");
        LowLabel.setVerticalAlignment(JLabel.BOTTOM);
        LowLabel.setHorizontalAlignment(JLabel.CENTER);
        LowLabel.setForeground(Color.orange);
        LowLabel.setFont(new Font("Calibri", Font.ITALIC,24));

        JLabel LowLabelChance = new JLabel();
        LowLabelChance.setText("1:2");
        LowLabelChance.setVerticalAlignment(JLabel.BOTTOM);
        LowLabelChance.setHorizontalAlignment(JLabel.CENTER);
        LowLabelChance.setForeground(Color.orange);
        LowLabelChance.setFont(new Font("Calibri", Font.ITALIC,24));

        Low = new JPanel();
        Low.setBounds(0, 295, 200, 35);
        Low.setBackground(new Color(1, 80, 28));
        Low.setLayout(new BorderLayout());
        Low.add(LowLabel);

        LowChance = new JPanel();
        LowChance.setBounds(0, 330, 200, 35);
        LowChance.setBackground(new Color(1, 80, 28));
        LowChance.setLayout(new BorderLayout());
        LowChance.add(LowLabelChance);
        //endregion
        //region HIGH
        JLabel HighLabel = new JLabel();
        HighLabel.setText("VALUE = 20 - 30");
        HighLabel.setVerticalAlignment(JLabel.BOTTOM);
        HighLabel.setHorizontalAlignment(JLabel.CENTER);
        HighLabel.setForeground(Color.orange);
        HighLabel.setFont(new Font("Calibri", Font.ITALIC,24));

        JLabel HighLabelChance = new JLabel();
        HighLabelChance.setText("1:1.81");
        HighLabelChance.setVerticalAlignment(JLabel.BOTTOM);
        HighLabelChance.setHorizontalAlignment(JLabel.CENTER);
        HighLabelChance.setForeground(Color.orange);
        HighLabelChance.setFont(new Font("Calibri", Font.ITALIC,24));

        High = new JPanel();
        High.setBounds(200, 295, 200, 35);
        High.setBackground(new Color(1, 80, 28));
        High.setLayout(new BorderLayout());
        High.add(HighLabel);

        HighChance = new JPanel();
        HighChance.setBounds(200, 330, 200, 35);
        HighChance.setBackground(new Color(1, 80, 28));
        HighChance.setLayout(new BorderLayout());
        HighChance.add(HighLabelChance);
        //endregion
        //region RED
        JLabel RedLabel = new JLabel();
        RedLabel.setText("ONLY RED");
        RedLabel.setVerticalAlignment(JLabel.BOTTOM);
        RedLabel.setHorizontalAlignment(JLabel.CENTER);
        RedLabel.setForeground(Color.orange);
        RedLabel.setFont(new Font("Calibri", Font.ITALIC,24));

        JLabel RedLabelChance = new JLabel();
        RedLabelChance.setText("1:1.9");
        RedLabelChance.setVerticalAlignment(JLabel.BOTTOM);
        RedLabelChance.setHorizontalAlignment(JLabel.CENTER);
        RedLabelChance.setForeground(Color.orange);
        RedLabelChance.setFont(new Font("Calibri", Font.ITALIC,24));

        Red = new JPanel();
        Red.setBounds(400, 295, 200, 35);
        Red.setBackground(new Color(1, 80, 28));
        Red.setLayout(new BorderLayout());
        Red.add(RedLabel);

        RedChance = new JPanel();
        RedChance.setBounds(400, 330, 200, 35);
        RedChance.setBackground(new Color(1, 80, 28));
        RedChance.setLayout(new BorderLayout());
        RedChance.add(RedLabelChance);
        //endregion
        //region BLACK
        JLabel BlackLabel = new JLabel();
        BlackLabel.setText("ONLY BLACK");
        BlackLabel.setVerticalAlignment(JLabel.BOTTOM);
        BlackLabel.setHorizontalAlignment(JLabel.CENTER);
        BlackLabel.setForeground(Color.orange);
        BlackLabel.setFont(new Font("Calibri", Font.ITALIC,24));

        JLabel BlackLabelChance = new JLabel();
        BlackLabelChance.setText("1:1.9");
        BlackLabelChance.setVerticalAlignment(JLabel.BOTTOM);
        BlackLabelChance.setHorizontalAlignment(JLabel.CENTER);
        BlackLabelChance.setForeground(Color.orange);
        BlackLabelChance.setFont(new Font("Calibri", Font.ITALIC,24));

        Black = new JPanel();
        Black.setBounds(600, 295, 200, 35);
        Black.setBackground(new Color(1, 80, 28));
        Black.setLayout(new BorderLayout());
        Black.add(BlackLabel);

        BlackChance = new JPanel();
        BlackChance.setBounds(600, 330, 200, 35);
        BlackChance.setBackground(new Color(1, 80, 28));
        BlackChance.setLayout(new BorderLayout());
        BlackChance.add(BlackLabelChance);
        //endregion
    }
    //region GETTERS
    public JPanel getSpades() {
        return Spades;
    }

    public JPanel getHearts() {
        return Hearts;
    }

    public JPanel getClubs() {
        return Clubs;
    }

    public JPanel getDiamonds() {
        return Diamonds;
    }

    public JPanel getLow() {
        return Low;
    }

    public JPanel getHigh() {
        return High;
    }

    public JPanel getRed() {
        return Red;
    }

    public JPanel getBlack() {
        return Black;
    }

    public JPanel getSpadesChance() {
        return SpadesChance;
    }

    public JPanel getHeartsChance() {
        return HeartsChance;
    }

    public JPanel getClubsChance() {
        return ClubsChance;
    }

    public JPanel getDiamondsChance() {
        return DiamondsChance;
    }

    public JPanel getLowChance() {
        return LowChance;
    }

    public JPanel getHighChance() {
        return HighChance;
    }

    public JPanel getRedChance() {
        return RedChance;
    }

    public JPanel getBlackChance() {
        return BlackChance;
    }

    //endregion
}
