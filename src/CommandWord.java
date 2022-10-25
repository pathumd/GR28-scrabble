/**
 * Enumeration of all the valid command words for the game.
 *
 * @author Michael Kyrollos, 101183521
 * @version 1.0
 * @date October 23, 2022
 */
public enum CommandWord {

//    Each string has its own value
    PLAY("play"),START("start"), QUIT("quit"), HELP("help"), INVALID("invalid");

    private String inputString;

    /**
     *
     * Initialise this with a inputString
     *
     * @param commandString the inputString
     */
    CommandWord(String commandString)
    {
        this.inputString = commandString;
    }

    /**
     * @return The input word as a string.
     */
    public String toString()
    {
        return inputString;
    }

}