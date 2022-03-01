package check;

public class Tab {
    private final int id;

    public Tab(int id) {
        this.id = id;
        createButton();
    }

    private void createButton() {
        System.out.println("New tab");
        System.out.println("Copy tab");
        childButtons();
    }

    protected void childButtons() {

    }
}
