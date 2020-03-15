import Intermixing.Printable;

public class APrintable implements Printable {
    public void print() {
        System.out.println("We can reuse the trait here if we like...");
        //Printable$class.print(this);  //针对Scala 2.11.x版本
        //Printable.super.print();  //针对Scala 2.12.x版本
    }

    public static void use(Printable printable) {
        printable.print();
    }

    public static void main(String[] args) {
        APrintable aPrintable = new APrintable();
        use(aPrintable);
    }
}
