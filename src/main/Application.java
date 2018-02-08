
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Application {

    public static String genRand(int length){
        MersenneTwisterFast rand = new MersenneTwisterFast();
        String possibleLetters = "OAKTN";
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++)
            sb.append(possibleLetters.charAt(rand.nextInt(possibleLetters.length())));
        return sb.toString();
    }
    public static void kidney(){
    }

    public static void execute() {
        long duration = 0;
        List<String> alcohol;
        List<String> coffeinetheine;
        List<String> nicotine;
        List<String> ok;
        AlcoholContainer alcoholContainer = new AlcoholContainer();
        CoffeineTheineContainer coffeineTheineContainer = new CoffeineTheineContainer();
        NicotineContainer nicotineContainer = new NicotineContainer();
        kidneyObserver kidney = new kidneyObserver();
        alcoholContainer.register(kidney);
        coffeineTheineContainer.register(kidney);
        nicotineContainer.register(kidney);


        while (duration<20000000) {
            long startTime = System.nanoTime();
            try{
                String input = genRand(50);

                IFilterKidney filterOk = new filterOk();
                IFilterKidney filterAlcohol = new filterAlcohol();
                IFilterKidney filterCoffeineTheine = new filterCoffeineTheine();
                IFilterKidney filterNicotine = new filterNicotine();

                alcohol = filterAlcohol.filterKidney(input);
                coffeinetheine = filterCoffeineTheine.filterKidney(input);
                nicotine = filterNicotine.filterKidney(input);
                ok = filterOk.filterKidney(input);
                alcohol = alcoholContainer.add(alcohol);
                coffeinetheine = coffeineTheineContainer.add(coffeinetheine);
                nicotine = nicotineContainer.add(nicotine);
                System.out.println(ok.toString());
                TimeUnit.SECONDS.sleep(2);}
            catch(Exception e){
                e.printStackTrace();
            }

            long endTime = System.nanoTime();
            duration += (endTime - startTime)/1000000;
        }
    }

    public static void main(String... args) {
        execute();
    }
}
