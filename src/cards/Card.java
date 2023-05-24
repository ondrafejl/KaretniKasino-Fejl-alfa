package cards;

import java.net.URL;

/**
 * Class to create card
 * @author Ondřej Fejl
 */
public class Card {
    private final int Value;    //value of card
    private final URL Path;  //path to file
    private final String TypeCard;
    private final Boolean IsBlack;

    /**
     * Class Constructor - creating a card
     * @param value numeric value of card
     * @param path path to file
     * @param isBlack making red or black
     * @param typeCard type of card (clubs, diamonds, hearts or spades)
     */
    public Card(int value, URL path, Boolean isBlack, String typeCard) {
        Value = value;
        Path = path;
        IsBlack = isBlack;
        TypeCard = typeCard;
    }

    //region Getters and Setters

    public int getValue() {
        return Value;
    }

    public URL getPath() {
        return Path;
    }

    public Boolean getBlack() {
        return IsBlack;
    }

    public String getTypeCard() {
        return TypeCard;
    }

    //endregion

}