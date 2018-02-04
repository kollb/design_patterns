package main;

import java.util.List;

public class CoffeineTheineContainer extends Container{

    @Override
    public void checkKidney() {
        if (input.size() >= 90){
            this.kidney.emptyKidney(this);
        }
    }
}
