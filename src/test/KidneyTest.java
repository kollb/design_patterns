

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class KidneyTest {
    Application app = new Application();

    @Test
    public void doTestStringSize() {
        String string = app.genRand(50);
        assertEquals(50, string.length());
    }

    @Test
    public void doTestKidneyVisitorWithAlcohol() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 94; i++) {
            string.append("A");
        }
        List<String> alcohol = null;
        IFilterKidney filterAlcohol = new filterAlcohol();
        AlcoholContainer alcoholContainer = new AlcoholContainer();
        kidneyObserver kidney = new kidneyObserver();
        alcoholContainer.register(kidney);
        alcohol = filterAlcohol.filterKidney(string.toString());
        alcohol = alcoholContainer.add(alcohol);
        assertEquals(4, alcohol.size());
        System.out.println("alcoholContainer Size: "+alcohol.size());
    }
}
