import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterNicotine implements IFilterKidney {

    public List<String> filterKidney(String string){
        List<String> filterList = new ArrayList<String>();
        List<String> nicotine = new ArrayList<String>();

        for (int i = 0; i < string.length(); i++)
        {
            char c = string.charAt(i);
            String temp = Character.toString(c);
            filterList.add(temp);
        }


        for (int i = 0; i < filterList.size(); i++)
            if (filterList.get(i).equals("N"))
                nicotine.add("N");
        return nicotine;
    }

}


