package main;

import java.util.List;

public class AlcoholContainer extends Container {

    public void checkKidney() {
        if (input.size() >= 90) {
            this.kidney.emptyKidney(this);
        }
    }

}
