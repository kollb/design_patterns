

public class kidneyObserver implements IObserveKidney {

    public void emptyKidney(AlcoholContainer container) {
        kidneyVisitor visitor = new kidneyVisitor();
        visitor.visit(container);
    }

    public void emptyKidney(CoffeineTheineContainer container) {
        kidneyVisitor visitor = new kidneyVisitor();
        visitor.visit(container);
    }

    public void emptyKidney(NicotineContainer container) {
        kidneyVisitor visitor = new kidneyVisitor();
        visitor.visit(container);
    }
}
