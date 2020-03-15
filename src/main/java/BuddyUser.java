import Intermixing.Buddy;
import Intermixing.Buddy$;

public class BuddyUser {
    public static void main(String[] args) {
        new Buddy().greet();
        Buddy$.MODULE$.greet();
    }
}
