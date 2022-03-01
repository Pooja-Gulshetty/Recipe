package check;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    List<String> list = new ArrayList<>();

    public void createasset(String type, String exparyDate, String seriolNumber) {
        list.add(type);
        list.add(exparyDate);
        list.add(seriolNumber);
    }
}
