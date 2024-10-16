package October.ex_14102024.MultipleInterface;

public class Son implements Parent,Father{
    @Override
    public void Money() {
        System.out.println(" hi from father");
    }

    @Override
    public void house() {
        System.out.println(" hi from Mother");
    }
}
