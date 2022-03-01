package check;

import java.util.List;

public class TextTab extends Tab {
    private final List<String> list;

    public TextTab(List<String> list) {
        super(1);
        this.list = list;
    }

    @Override
    public void childButtons() {
        System.out.println("Type filter"+list.size());
    }
}
