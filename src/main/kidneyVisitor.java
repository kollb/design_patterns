package main;

public class kidneyVisitor {
    public void visit (AlcoholContainer container){
        System.out.println("Emptied alcoholContainer");
        container.empty();
    }

    public void visit (CoffeineTheineContainer container){
        System.out.println("Emptied coffeineTheineContainer");
        container.empty();
    }

    public void visit (NicotineContainer container){
        System.out.println("Emptied nicotineContainer");
        container.empty();
    }

}
