/**
 * The SingletonLauncher class drives the application. This class demonstrates
 * the static keyword by creating a singleton class;
 * or, "what can you do with static and why would you want to?"
 *
 * @author kkohler
 */
public class SingletonLauncher {

    /** Main method gets singleton demonstration going.
     *  Does NOT instantiate a singleton instance, because it can't! Instead,
     *  it calls the class's getInstance() method (which is static and
     *  available to be called on the class; no object instance needed!)
     *  @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creating a variable we'll name "newPresident" and setting it equal
        // to what the singleton's getInstance() method returns.
        ThereCanBeOnlyOne newPresident = ThereCanBeOnlyOne.getInstance();
        newPresident.requestPardon("Please grant clemency to this turkey.",
                "the Thanksgiving Turkey");

        // We can call methods without setting the singleton equal to a
        // variable (there will only ever be the one anyway).
        ThereCanBeOnlyOne.getInstance().requestPardon("Let this turkey go!",
                "the Thanksgiving Turkey");
    }
}
