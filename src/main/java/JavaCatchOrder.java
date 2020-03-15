public class JavaCatchOrder {
    public void catchOrderExample() {
        try {
            String str = "hello";
            System.out.println(str.charAt(31));
        }
        catch(Exception ex) {
            System.out.println("Exception caught");
        }
        /*catch(StringIndexOutOfBoundsException ex) {  //编译错误
            System.out.println("Invalid Index");
        }*/
    }
}
