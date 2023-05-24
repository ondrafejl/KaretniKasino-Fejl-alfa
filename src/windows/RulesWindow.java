package windows;

import components.RulesComponents;

import javax.swing.JFrame;
import java.awt.Color;

/**
 * Class to create rules page
 * @author Ondřej Fejl
 */
public class RulesWindow extends JFrame {

    /**
     * Class constructor for crating the rules page
     */
    public RulesWindow(){

        this.setSize(800, 600);
        this.setTitle("Karetni Kasino");
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.darkGray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding components from class RulesComponents to rules page
        RulesComponents Components = new RulesComponents(this);
            this.add(Components.getHeaderLine());
            this.add(Components.getFirstLine());
            this.add(Components.getSecondLine());
            this.add(Components.getThirdLine());
            this.add(Components.getFourthLine());
            this.add(Components.getFifthLine());
            this.add(Components.getBack());

    }
}

