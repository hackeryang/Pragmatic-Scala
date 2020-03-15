import Intermixing.Bird;
import Intermixing.NoFlyException;

public class Penguin extends Bird {
    public void fly() throws NoFlyException {
        throw new NoFlyException();
        //...
    }
}
