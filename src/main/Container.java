package main;


import java.util.ArrayList;
import java.util.List;

public abstract class Container {

    protected List<String> input = new ArrayList<String>();
    protected kidneyObserver kidney;

    public List<String> add(List<String> string){
        for (String c:  string){
            this.input.add(c);
            checkKidney();
        }
        return this.input;
    }

    public void register(kidneyObserver kidney){
        this.kidney = kidney;
    }

    public List<String> empty(){
        this.input = new ArrayList<>();
        return this.input;
    }

    public abstract void checkKidney();

}
