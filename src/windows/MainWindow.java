package windows;

import components.WelcomeIntro;

import javax.swing.JFrame;
import java.awt.Color;
/**
 * Class to create welcome page
 * @author Ondřej Fejl
 */
public class MainWindow extends JFrame{

    /**
     * Class constructor to create welcome page
     */
    public MainWindow() {

        this.setSize(800, 600);
        this.setTitle("Karetni Kasino");
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.darkGray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding components from class WelcomeIntro to Starting page
        WelcomeIntro IntroComponents = new WelcomeIntro(this);
            this.add(IntroComponents.getHeaderPanel());
            this.add(IntroComponents.getMiddlePanel());
            this.add(IntroComponents.getRules());
            this.add(IntroComponents.getGame());
    }
}
