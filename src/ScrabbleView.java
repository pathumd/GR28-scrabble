/**
 * ScrabbleView implements the view of the MVC design pattern. It is used as the user-interface of the program,
 * that subscribes to a model and updates whenever a status change is made.
 *
 * @author Yehan De Silva
 * @version 1.0
 * @date November 11, 2022
 */
public interface ScrabbleView {

    /**
     * Check for status change and update view.
     */
    void update();
}